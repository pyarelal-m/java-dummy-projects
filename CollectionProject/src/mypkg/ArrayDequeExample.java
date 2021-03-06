package mypkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<String> stack = new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        
        int size = stack.size() - 1;
        while (size >= 0 ) {
            System.out.println(stack.pop());
            size--;
        }       // Last in First out 
        
        System.out.println("=================");
        stack.clear();
        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        
	}

}
