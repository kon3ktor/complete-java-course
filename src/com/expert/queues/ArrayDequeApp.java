package com.expert.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeApp {

    public static void main(String[] args) {

        Deque<String> editHistory = new ArrayDeque<>();

//        System.out.println("Taking action: null");
//        editHistory.push(null);
        System.out.println("Taking action: making the text bold");
        editHistory.push("making the text bold");
        System.out.println("Taking action: adding some text");
        editHistory.push("adding some text");
        System.out.println("Taking action: adding a new paragraph");
        editHistory.push("adding a new paragraph");

        System.out.println();
        System.out.println("The last action in our edit history: " + editHistory.peek());

        System.out.println("Undoing the last action: " + editHistory.pop());
        System.out.println("Undoing the last action: " + editHistory.pop());

        System.out.println();
        System.out.println("Taking action: making the text italic");
        editHistory.push("making the text italic");
        System.out.println("Edit history: " + editHistory);


    }
}
