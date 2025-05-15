package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        ListIterator<String> iterator = list.listIterator(1); // Start at 2nd element (index 1)
        System.out.print("Iterating from 2nd element: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

