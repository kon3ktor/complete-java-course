package com.hero.multithreading.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class MessageProducer implements Runnable {

    private BlockingQueue<Message> queue;

    public MessageProducer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Message message = new Message("" + i);
            try {
                queue.put(message);
                System.out.println("Message added to queue: " + message.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            queue.put(new Message("exit"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
