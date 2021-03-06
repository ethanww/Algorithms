package algorithm1_3;

import java.util.Iterator;

import javax.xml.soap.Node;

public class Bag<Item> implements Iterable<Item> {
	private class Node {
		Item item;
		Node next;
	}
	private Node first;
	public void add(Item item) {
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
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
