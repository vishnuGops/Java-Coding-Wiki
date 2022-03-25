
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseArray {

    public static ArrayList<Integer>  reversearray(ArrayList<Integer>  list) {
        ArrayList<Integer>  newList = new ArrayList<Integer> ();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));

        }
        return newList;
    }

    public static ArrayList<Integer> reversearray2(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);

        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6, 78, 94));

        System.out.println("The original array: " + arr);

        ArrayList<Integer> list1 = reversearray(arr);

        System.out.println("\nThe reversed array: " + list1);

        System.out.println("\nReversing the array within the same array: ");
        ArrayList<Integer> list2 = reversearray2(arr);

        System.out.println(list2);

        System.out.println("\n" + arr);
        System.out.println("\nReversing the array using Collections: ");
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
