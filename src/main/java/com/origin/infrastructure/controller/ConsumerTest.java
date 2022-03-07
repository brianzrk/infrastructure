package com.origin.infrastructure.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * @author zhangruikai01
 */
public class ConsumerTest {
    public static void main(String[] args) {
        String topic = "test";
        String groupId = "test-group";
        Properties prop = new Properties();
        prop.put("bootstrap.servers", "localhost:9092");  // 必须指定， required
        prop.put("group.id", groupId);  // 必须指定，required， 指定consumer group的名字，唯一标识一个consumer group
        prop.put("enable.auto.commit", "true");
        prop.put("auto.commit.interval.ms", "1000");
        prop.put("auto.offset.reset", "earliest");
        prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // 必须指定 required
        prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // 必须指定 required

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(prop);
        consumer.subscribe(Arrays.asList(topic));

        try {
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(1000);
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("offset = %d, key = %s, value = %s%n "
                            , record.offset(), record.key(), record.value());
                }
            }
        } finally {
            consumer.close();
        }
    }
}
