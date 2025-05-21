// Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations with different functions directed as
// follows
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
// Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
// size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package AddingElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist{
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("LinkedList after adding elements: " + linkedList);

        // 2. Adding element at specific index
        linkedList.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + linkedList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        linkedList.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        linkedList.set(0, "Strawberry");
        System.out.println("After updating index 0 to 'Strawberry': " + linkedList);

        // 6. Removing elements
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);

        // 7. Searching elements
        System.out.println("Contains 'Orange'? " + linkedList.contains("Orange"));

        // 8. List size
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating using for-each
        System.out.print("Iterating with for-each: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);

        // 12. Sublist
        List<String> subList = linkedList.subList(1, 3);
        System.out.println("Sublist from index 1 to 2: " + subList);

        // 13. Clearing the list
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
    }
}
