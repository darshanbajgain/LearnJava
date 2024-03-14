/*
ArrayList:
ArrayList is a resizable array implementation of the List interface provided by Java Collections Framework. 
It dynamically resizes itself as elements are added or removed.

Key Features:
Dynamic Sizing: Automatically grows and shrinks in size as elements are added or removed.
Indexed Access: Supports fast indexed access to elements.
Ordered Collection: Maintains the order of elements as they are added.
Allows Duplicates: Allows storing duplicate elements.
 */
import java.util.*;
class ArrayListExample {
public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
    
    // Adding elements to the ArrayList
    list.add("Apple");
    list.add("Banana");
    list.add("Mango");

    //printing Arraylist 
    System.out.println("ArrayList: " + list);

    //removing  and item 
    list.remove("Banana");

    //printing updated arraylist after removal
    System.out.println("updated array list: "+ list);

    // Accessing elements by index
    String firstElement = list.get(0);
    System.out.println("First Element: " + firstElement); // Output: First Element: Apple

    // Iterating over elements using a for-each loop
     System.out.println("Iterating over elements:");
     for (String fruitlist : list) {
        System.out.println(fruitlist);
     }

    // Clearing all elements from the ArrayList
    list.clear();
    System.out.println("after clearing all elements is : "+ list);

    boolean isEmpty = list.isEmpty();
    System.out.println("Removing all elements from Arraylist");
    list.removeAll(list);
    System.out.println("Is arraylist empty?: " + isEmpty);

    list.add("Orange");
    list.add("Pineapple");
    System.out.println("After adding again, arraylist: "+ list);

    // Checking if an element exists
    boolean containsOrange = list.contains("Orange");
    System.out.println("Contains Orange? " + containsOrange);
   

}
    
}