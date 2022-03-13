import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicatesList {
    // this is using another array list
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<Integer>();

        for (Integer i : list) {
            if (!newlist.contains(i)) {
                newlist.add(i);
            }

        }
        return newlist;
    }

    // we can also make use of LinkedHashSet which hold unique values and no
    // duplicates
    // is also faster and more efficient

    public static ArrayList<Integer> removeDups(ArrayList<Integer> list) {

        Set<Integer> set = new LinkedHashSet<Integer>();

        set.addAll(list);

        list.clear();

        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        System.out.println("Original Array: " + list);

        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.println("Array with no Duplicates using another array: " + newList);

        ArrayList<Integer> setlist = removeDups(list);
        System.out.println("Array with no duplicates using set: " + setlist);

        System.out.println("Using Java8 Stream: ");

        List<Integer> streamList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(streamList);

    }

}
