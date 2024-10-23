package com.hero.multithreading.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApp {

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(5);
        MessageProducer producer = new MessageProducer(queue);
        MessageConsumer consumer = new MessageConsumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
