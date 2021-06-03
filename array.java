import java.io.*;
import java.util.*;

public class array {

    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }

        System.out.println(arr);

        arr.remove(3);
        System.out.println("Array after removing 3:");
        System.out.println(arr);

        System.out.println("Each element of Array:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }

}
