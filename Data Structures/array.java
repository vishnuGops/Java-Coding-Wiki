import java.util.*;

/*
ArrayList in Java

ArrayList is a part of collection framework and is present in java.util package. It provides us with dynamic arrays in Java. 
Though, it may be SLOWER than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
This class is found in java.util package. 


*/

public class array {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arr.add(i);
        }

        System.out.println("Original array:" + arr);

        arr.remove(3);

        System.out.println("Array after removing 3:" + arr);

        System.out.println("Each element of Array:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.add(1, 10);
        System.out.println("Adding element 10 in the 2nd index of the array:" + arr);

        ArrayList<String> str = new ArrayList<String>();
        str.add("Geeks");
        str.add("Geeks");

        System.out.println(str);
        str.add(1, "for");
        System.out.println(str);

        System.out.println("\nREMOVAL\n");

        str.remove(1); // removing using index
        System.out.println("Removing the element at first index:" + str);

        str.remove("Geeks"); // removing using object
        System.out.println("Removing the object: " + str);

        System.out.println("\nITERATING\n");

        str.add("Money");
        str.add("Kids");
        str.add("Location");
        // using for loop
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i) + " ");

        }
        System.out.println();
        // using for each loop
        for (String s : str) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("To check if Money exists in the list: " + str.contains("Money"));

        System.out.println("\nReplace Kids with Monkey");
        String rep = str.set(2, "Monkey");

        System.out.println("Replaced Array: " + str);
        System.out.println("Replaced element = " + rep);

    }

}
