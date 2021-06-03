import java.util.ArrayList;

// Syntax:
// public List subList(int fromIndex, int toIndex)

// Parameters: This method takes the following argument as a parameter.

// fromIndex – low endpoint (inclusive) of the subList
// toIndex – high endpoint (exclusive) of the subList
// Returns Value: This method returns a view of the specified range within this list.

// Exception: This method throws the following Exception.

// IndexOutOfBoundsException – if an endpoint index value is out of range (fromIndex size)
// IllegalArgumentException – if the endpoint indices are out of order (fromIndex > toIndex)
// Below are the examples to illustrate the subList() method.
import java.util.*;

public class sublistArray {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");

        System.out.println("The original array is: " + arr);

        List<String> newList = arr.subList(2, 4);

        System.out.println("The sublist of the array: " + newList);

    }

}
