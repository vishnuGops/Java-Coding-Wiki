import java.util.*;
import java.util.Arrays;

public class reverseVowels {

    public static void main(String[] args) {
        String s = "Hello";

        int left = 0;
        int right = s.length() - 1;

        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        char[] arr = s.toCharArray();

        while (left < right) {
            if (!list.contains(arr[left]))
                left++;

            if (!list.contains(arr[right]))
                right--;

            if (list.contains(arr[left]) && list.contains(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
        }
        System.out.println(new String(arr));

    }

}
