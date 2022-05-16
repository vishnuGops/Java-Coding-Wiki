
// Vector Class in Java

// The Vector class implements a growable array of objects. Vectors fall in legacy classes, but now it is fully compatible with collections. 
// It is found in java.util package and implement the List interface, so we can use all the methods of List interface as shown below as follows:

// Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed 
// using an integer index.
// They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
// It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, 
// and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
// The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the 
// ConcurrentModificationException.

// Importing required classes
import java.io.*;
import java.util.*;

public class vector {

    public static void main(String[] args) {
        int n = 5;

        Vector<Integer> v = new Vector<Integer>(n);

        for (int i = 0; i < 10; i++) {
            v.add(i);
        }

        System.out.println(v);

        // v.remove(3);
        for (int j = v.size() - 1; j > 0; j--) {
            if (j % 2 == 0) {
                v.remove(j);
            }
        }
        System.out.println("The vector after removing: " + v);

        // create a default vector
        Vector vec = new Vector();

        // can add string to vector too
        vec.add(221);
        vec.add("Hello");
        vec.add("what's up?");
        vec.add(12);

        System.out.println(vec);

        // create a empty vector
        Vector<Integer> vec2 = new Vector<Integer>();

        vec2.add(123456);
        for (int i = 90; i < 100; i++) {
            vec2.add(i);
        }
        System.out.println(vec2);

        // replacing items in vector
        vec2.set(0, 89);

        System.out.println();
        System.out.println("After replacing the first element:" + vec2);

        // using get to iterate or get element from linkedlist
        System.out.println(vec.get(1));
    }
}
