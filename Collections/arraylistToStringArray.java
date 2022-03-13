package Collections;
import java.util.ArrayList;
import java.util.*;

public class arraylistToStringArray {
    // using string array
    public static String[] getStringarray(ArrayList<String> arr) {

        String[] str = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            str[i] = arr.get(i);
        }
        return str;
    }

    // using intermediate object array
    public static String[] getStringarray2(ArrayList<String> arr) {
        String[] str = new String[arr.size()];

        // convert array list to object array
        Object[] obj = arr.toArray();

        int i = 0;
        for (Object o : obj) {
            str[i++] = (String) o;
        }
        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Hello");
        arr.add("How");
        arr.add("Are");
        arr.add("You");
        System.out.println("The actual array: " + arr);
        String[] str = getStringarray(arr);
        System.out.println("The string array = " + Arrays.toString(str));

        System.out.println("\nUsing object array as intermediate \n");
        String[] str1 = getStringarray2(arr);
        System.out.println("The string array is = " + Arrays.toString(str1));

    }
}
