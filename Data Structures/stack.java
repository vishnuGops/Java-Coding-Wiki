import java.io.*;
import java.util.*;

/*
Stack Class

Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of 
last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek. 
The class can also be said to extend Vector and treats the class as a stack with the five mentioned functions. The class can also be referred to as 
the subclass of Vector.
*/

public class stack {

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop operation: ");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos != -1) {
            System.out.println("Element at pos: " + pos);
        } else {
            System.out.println("Element not found");
        }

    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_push(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_pop(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);

    }

}
