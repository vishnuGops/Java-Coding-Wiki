import java.util.ArrayList;
import java.util.*;

public class arraylistToStringArray {

    public static String[] getStringarray(ArrayList<String> arr) {

        String[] str = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            str[i] = arr.get(i);
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
    }
}
