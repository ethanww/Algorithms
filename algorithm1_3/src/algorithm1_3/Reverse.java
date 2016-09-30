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
		StdOut.println("1");
		while (!StdIn.isEmpty()) {
			stack.push(StdIn.readInt());
		}
		for (int i : stack) {
			StdOut.println(i);
		}
//		for (int i = 0; i < 5; i++) {
//			stack.push(i);
//		}
//		for (int i : stack) {
//			StdOut.println(i);
//		}
	}
}
