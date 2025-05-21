/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1)) */


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

