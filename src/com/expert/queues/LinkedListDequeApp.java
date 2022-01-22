package com.expert.queues;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeApp {

    public static void main(String[] args) {

        Deque<Integer> bankQueueNumbers = new LinkedList<>();

        bankQueueNumbers.addLast(30);
        bankQueueNumbers.offerLast(31);
        bankQueueNumbers.addFirst(32);
        bankQueueNumbers.offerFirst(33);
        bankQueueNumbers.offer(34);
        System.out.println(bankQueueNumbers);

        System.out.println("The first customer in the queue has the number: " + bankQueueNumbers.getFirst());

        System.out.println("Customer with number " + bankQueueNumbers.removeFirst() + " is called.");
        System.out.println(bankQueueNumbers);

        System.out.println("Customer with number " + bankQueueNumbers.pollLast() + " is called.");
        System.out.println(bankQueueNumbers);

        bankQueueNumbers.remove(33);
        System.out.println("Customer with number 33 is removed from the queue.");
        System.out.println(bankQueueNumbers);


    }

}
