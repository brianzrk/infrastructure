package com.origin.infrastructure.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;

public class KafkaProducerDemo {

    public static void main(String[] args) throws InterruptedException {
        Properties prop = new Properties();
        prop.put("bootstrap.servers", "10.153.205.20:9092");
        prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<>(prop);
        ProducerRecord<String, String> record = new ProducerRecord<>("testTopic", "testKey", "testValue");

        // 同步方式发送消息，会阻塞在这里，直到发送完成
        // producer.send(record).get();

        // 异步方式发送消息，不阻塞，设置一个监听回调函数即可
        producer.send(record, new Callback() {
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception == null) {
                    System.out.println("消息发送成功");
                } else {
                    System.out.println("消息发送异常");
                }
            }
        });

        Thread.sleep(5 * 1000);

        // 退出producer
        producer.close();


    }

}
