package algorithm1_3;

import java.util.Iterator;

import javax.xml.soap.Node;


public class Stack<Item> implements Iterable<Item> {
	private Node first;
	private int N;
	private class Node
	{//定义结点的嵌套类
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return first ==null;
	}
	public int size() {
		return N;
	}
	public void push(Item item) {
		Node oldfisrt=first;
		first =new Node();
		first.item=item;
		first.next=oldfisrt;
		N++;
	}
	public Item pop() {
		Item item =first.item;
		first=first.next;
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	private class  ListIterator implements Iterator<Item> {
		private Node current=first;
		public boolean hasNext() {
			return current!=null;
		}
		public void remove() {
			
		}
		public Item next() {
			Item item=current.item;
			current=current.next;
			return item;
		}
	}
}
