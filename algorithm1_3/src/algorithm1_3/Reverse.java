package algorithm1_3;

import java.util.Iterator;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Reverse {
	public static void main(String[] args) {
		StdOut.println("1");
		Stack<Integer> stack;
		stack=new Stack<Integer>();
		while (!StdIn.isEmpty()) {
			stack.push(StdIn.readInt());
		}
		System.out.println(stack.pop());
//		for (int i : stack) {
//			StdOut.println(i);
//		}
//		stack.push(StdIn.readInt());
//		stack.push(StdIn.readInt());
//		for (int i=0 ;i<stack.size();i++) {
//			StdOut.println(stack.pop());
//		}
	}
}
