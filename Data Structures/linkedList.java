import java.util.*;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Yo");
        ll.add("Yo");
        ll.add("Honey");
        ll.add("Singh");

        System.out.println("Linked List:" + ll);
        System.out.println("Linked List value at index 3:" + ll.get(3));

        String str = new String();
        for (int i = 0; i < ll.size(); i++) {
            str += ll.get(i) + " ";
        }
        System.out.println(str);

        System.out.println("\nAdding element to start and end of the LinkedList\n");

        ll.add(0, "start");
        ll.add(ll.size(), "end");

        System.out.println("The resultant LL: " + ll);

        System.out.println("\nChecking if Linked List contains Honey: " + ll.contains("Honey"));
        System.out.println("\nChecking if Linked List contains Money: " + ll.contains("Money"));

        // using set to replace honey with money
        System.out.println("\nUsing set to replace honey with money:");

        ll.set(3, "Money");
        System.out.println("Resultant List: " + ll);

        LinkedList<String> list = new LinkedList<String>();

        list.addAll(ll);
        ll.clear();
        System.out.println("After clear List1 is empty: " + ll.isEmpty() + ll);

        System.out.println("\nList Iterator\n");

        ListIterator<String> itr = list.listIterator(2);

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
