package com.origin.infrastructure.controller;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.errors.RetriableException;

import java.util.Properties;

/**
 * @author zhangruikai01
 */
public class ProducerTest {
    public static void main(String[] args) throws InterruptedException {

        Properties prop = new Properties();
        prop.put("bootstrap.servers", "localhost:8686");    // 必须指定 required
        prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // 必须指定 required
        prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // 必须指定 required
        prop.put("acks", "-1"); // -1标识需要所有的ISR收到消息才会返回收到，
        prop.put("retries", 3);
        prop.put("batch.size", 323840);
        prop.put("linger.ms", 10);
        prop.put("buffer.memory", 33554432);
        prop.put("max.block.ms", 3000);
        KafkaProducer<String, String> producer = new KafkaProducer<>(prop);
        ProducerRecord<String, String> record = new ProducerRecord<>("test", "testKey", "testValue");

        // 同步方式发送消息，会阻塞在这里，直到发送完成
        // producer.send(record).get();

        // 异步方式发送消息，不阻塞，设置一个监听回调函数即可
        producer.send(record, new Callback() {
            // metadata 与 exception 至少有一个为null
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception == null) {
                    System.out.println("消息发送成功");
                } else {
                    if (exception instanceof RetriableException) {
                        System.out.println("消息发送异常-可重试异常");
                    } else {
                        System.out.println("消息发送异常-不可重试异常");
                    }
                }
            }
        });

        Thread.sleep(5 * 1000);
        // 退出producer
        producer.close();

    }
}
