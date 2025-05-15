package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        Iterator<String> reverseIterator = list.descendingIterator();
        System.out.print("Reverse iteration: ");
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
    }
}

