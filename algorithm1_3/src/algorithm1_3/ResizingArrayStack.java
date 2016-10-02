package algorithm1_3;

import java.util.Iterator;

import org.omg.CORBA.PRIVATE_MEMBER;

public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item[] a=(Item[])new Object[1];//创建一个Item类型的数组
	private int N=0;
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	private void resize(int max) {
		Item[] temp=(Item[])new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}//重新生成数组
	public void push(Item item) {
		if (N==a.length) {
			resize(2*a.length);
		}
		a[N++]=item;
	}
	public Item pop() {
		Item item=a[--N];
		a[N]=null;//避免游离
		if (N>0&&N==a.length/4) {
			resize(a.length/2);
		}
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<Item>() {
		//支持后入先出的迭代
		private int i=N;
		public boolean hasNext() {
			return i>0;
		}
		public Item next() {
			return a[--i];
		}
		public void remove() {
			
		}
	}
}
