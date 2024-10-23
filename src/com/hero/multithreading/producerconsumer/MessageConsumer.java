package com.hero.multithreading.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class MessageConsumer implements Runnable {

    private BlockingQueue<Message> queue;

    public MessageConsumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Message message;
            while (!"exit".equals((message = queue.take()).getMessage())) {
                Thread.sleep(100);
                System.out.println("Message is consumed: " + message.getMessage());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
