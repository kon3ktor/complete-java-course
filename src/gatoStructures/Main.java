package gatoStructures;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayListG<String> stringList = new ArrayListG<>();
        // Insertion
        stringList.add("A");
        stringList.add("B");
        stringList.add(2, "C");
        System.out.println(stringList);
        // Access
        System.out.println(stringList.get(2));
        System.out.println(stringList.get(2));
        // Traversal
        for (int i=0; i<stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }

        // Itertor traversal
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);
        }

        // index of
        int index = stringList.indexOf("C");
        System.out.println("The element is found at index " + index);

        // remove
        stringList.remove("1");
        stringList.remove("A");
        System.out.println(stringList);
        System.out.println(stringList.size());

        stringList.add("shuenla weones");
        stringList.add(0, "querian pico mrd?");
        for (String letter : stringList) {
            System.out.println(letter);
        }

        ArrayListG<Integer> intList = new ArrayListG<>();
        System.out.println(intList.size());
        System.out.println(intList.capacity());
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println(intList.size());
        System.out.println(intList.capacity());

        for (Integer number : intList) {
            System.out.print(number + ",");
        }
        System.out.println();

        intList.spofArray(intList);
        intList.printPairs(intList);
        intList.reverseArray(intList);
        for (Integer number : intList) {
            System.out.print(number + ",");
        }

    }
}
