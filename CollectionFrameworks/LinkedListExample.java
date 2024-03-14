/*

LinkedList is a doubly-linked list implementation of the List interface.
It provides efficient insertion and deletion operations at both ends of the list.
Elements are stored as nodes, each containing a reference to the next and previous nodes.
LinkedList also allows duplicate elements and maintains insertion order.

- An ArrayList class can act as a list only because it implements List only.	
- LinkedList class can act as a list and queue both because it implements List and Deque interfaces.

 */

import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        System.out.println("LinkedList: " + list); // Output: LinkedList: [Alice, Bob, Charlie]

        list.addFirst("David"); // Insert at the beginning
        list.addLast("Emily"); // Insert at the end

        System.out.println("After insertion: " + list); // Output: After insertion: [David, Alice, Bob, Charlie, Emily]

        list.removeFirst(); // Remove the first element
        list.removeLast(); // Remove the last element

        System.out.println("After removal: " + list); // Output: After removal: [Alice, Bob, Charlie]
    }
}
