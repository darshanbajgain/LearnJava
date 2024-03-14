# Collection Framework Heiarchy

The *java.util* package contains all the classes and interfaces for the Collection framework.

![heiarchy](https://static.javatpoint.com/images/java-collection-hierarchy.png)

## 4 core interfaces:

1. Collection
2. List
3. Queue
4. Set

Collection interface extends the Iterable interface. The iterable interface has only one method called iterator(). The function of the iterator method is to return the iterator object. Using this iterator object, we can iterate over the elements of the collection.

The primary interfaces in the Collection Framework are:

- Collection: This is the root interface of the collection hierarchy. It defines basic operations such as adding, removing, and querying elements. Subinterfaces and classes extend or implement this interface to provide specialized collection types.

- List: Represents an ordered collection (sequence) of elements. Allows duplicate elements and provides methods to access elements by their index. A subinterface of Collection.Lists maintain an ordered collection of elements, allowing duplicate elements and providing indexed access to elements. Implementations of the List interface include ArrayList, LinkedList, and Vector.

- Set: Represents a collection that does not allow duplicate elements. Ensures that all elements are unique. Implementations of the Set interface include HashSet, LinkedHashSet, and TreeSet.

- Queue: Extends the Collection interface. Queues represent a collection that holds elements prior to processing. They follow the First-In-First-Out (FIFO) order. Implementations of the Queue interface include LinkedList, PriorityQueue, and ArrayDeque.

- Map: Not a subinterface of Collection, but an important part of the Collection Framework. Maps represent a collection of key-value pairs, where each key is associated with exactly one value. Keys in a map must be unique. Map uses a hashing technique for storing key-value pairs. It doesn’t allow to store the duplicate keys but duplicate values are allowed. Implementations of the Map interface include HashMap, LinkedHashMap, TreeMap, and HashTable.

### Iterable Interface:

Represents a collection of elements that can be iterated over.
It provides a single method, iterator(), which returns an Iterator over the elements of the collection.
All collection classes implement this interface, enabling them to be used in enhanced for loops and other contexts requiring iteration.

### Methods of Collection Interface in Java


The Collection interface consists of a total of fifteen methods for manipulating elements in the collection. They are as follows:

1. add(): This method is used to add or insert an element in the collection. The general syntax for add() method is as follow:
add(Object element) : boolean
If the element is added to the collection, it will return true otherwise false, if the element is already present and the collection doesn’t allow duplicates.

2. addAll(): This method adds a collection of elements to the collection. It returns true if the elements are added otherwise returns false. The general syntax for this method is as follows:
addAll(Collection c) : boolean

3. clear(): This method clears or removes all the elements from the collection. The general form of this method is as follows:
clear() : void
This method returns nothing.

4. contains(): It checks that element is present or not in a collection. That is it is used to search an element. The general for contains() method is as follows:
contains(Object element) : boolean
This method returns true if the element is present otherwise false.

5. containsAll(): This method checks that specified a collection of elements are present or not. It returns true if the calling collection contains all specified elements otherwise return false. The general syntax is as follows:
containsAll(Collection c) : boolean

6. equals(): It checks for equality with another object. The general form is as follows:
equals(Object element) : boolean

7. hashCode(): It returns the hash code number for the collection. Its return type is an integer. The general form for this method is:
hashCode() : int

8. isEmpty(): It returns true if a collection is empty. That is, this method returns true if the collection contains no elements.
isEmpty() : boolean

9. iterator(): It returns an iterator. The general form is given below:
iterator() : Iterator

10. remove(): It removes a specified element from the collection. The general syntax is given below: remove(Object element) : boolean
This method returns true if the element was removed. Otherwise, it returns false.

11. removeAll(): The removeAll() method removes all elements from the collection. It returns true if all elements are removed otherwise returns false.
removeAll(Collection c) : boolean

12. retainAll(): This method is used to remove all elements from the collection except the specified collection. It returns true if all the elements are removed otherwise returns false.
retainAll(Collection c) : boolean

13. size(): The size() method returns the total number of elements in the collection. Its return type is an integer. The general syntax is given below:
size() : int

14. toArray(): It returns the elements of a collection in the form of an array. The array elements are copies of the collection elements.
toArray() : Object[]

15. Object[ ] toArray(): Returns an array that contains all the elements stored in the invoking collection. The array elements are the copies of the collection elements.
toArray(Object array[]) : Object[]
