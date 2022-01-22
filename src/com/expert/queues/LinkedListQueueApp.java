package com.expert.queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueApp {

    public static void main(String[] args) {

        Queue<Integer> bankQueueNumbers = new LinkedList<>();

        bankQueueNumbers.add(30);
        bankQueueNumbers.offer(31);
        bankQueueNumbers.offer(32);
        bankQueueNumbers.offer(33);
        bankQueueNumbers.offer(34);
        System.out.println(bankQueueNumbers);

        System.out.println("The first customer in the queue has the number: " + bankQueueNumbers.element());

        System.out.println("Customer with number " + bankQueueNumbers.remove() + " is called.");
        System.out.println(bankQueueNumbers);

        System.out.println("Customer with number " + bankQueueNumbers.poll() + " is called.");
        System.out.println(bankQueueNumbers);

        bankQueueNumbers.remove(33);
        System.out.println("Customer with number 33 is removed from the queue.");
        System.out.println(bankQueueNumbers);
    }
}
