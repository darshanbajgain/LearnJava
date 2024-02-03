/*
 * Arrays in Java are used to store multiple values of the same type under a single variable name.
 * 
 * Arrays Class in Java:
 * The java.util.Arrays class provides several utility methods for working with arrays, including sorting, searching, and filling.
 * 
 * 
 */

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        // initialize arrays
        int[] a = { 3, 15, 7, 8, 10, 9 }; // or int a[] = {3,15,7,8,10,9};

        // create a new array
        int b[] = new int[6];

        // using arraycopy() - copies arrays from specified source array
        System.arraycopy(a, 0, b, 0, 6); // arraycopy(source arr[] obj, srcPos, dest arr[] obj, destPos);
        for (int i : b) {
            System.out.println(i);
        }

        // using sort() method from Arrays class to sort array a;
        Arrays.sort(a);
        System.out.println("Sorted array of a is :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // using binarySearch() - returns the index of the search key if the key is
        // found;
        int index = Arrays.binarySearch(a, 10);// first parameter is the array object, second is the key value
        System.out.println("Key=10 is at index no. " + index);

        int newArr[] = new int[4];
        //using fill() method to assign 50 to each elements in newArr;
        Arrays.fill(newArr, 50);
        for( int i : newArr)
        System.out.println(i);

        //using equals() method form Arrays Class to compare the contents of arrays
        boolean isEqual= Arrays.equals(a, b); //comparing if arrays object a and b are equals or not;
        System.out.println("Are a and b equal: "+ isEqual);

    }
}