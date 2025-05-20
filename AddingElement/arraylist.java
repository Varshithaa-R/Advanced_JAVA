 /*Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
 and a LinkedList to perform the following operations with different functions directed as
 follows
 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
 Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/

package AddingElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList after adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + arrayList);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        System.out.println("After updating index 0 to 'Strawberry': " + arrayList);

        // 6. Removing elements
        arrayList.remove("Banana");
        System.out.println("After removing 'Banana': " + arrayList);

        // 7. Searching elements
        System.out.println("Contains 'Orange'? " + arrayList.contains("Orange"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());

        // 9. Iterating using for-each
        System.out.print("Iterating with for-each: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. Sublist
        List<String> subList = arrayList.subList(1, 3);
        System.out.println("Sublist from index 1 to 2: " + subList);

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);
    }
}
