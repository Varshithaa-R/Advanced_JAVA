/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink")) */


package LinkedList;

import java.util.LinkedList;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("Before adding at end: " + list);

        list.offerLast("Pink");

        System.out.println("After adding 'Pink' at end: " + list);
    }
}

