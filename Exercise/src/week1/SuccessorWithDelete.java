package week1;

import org.omg.CORBA.PRIVATE_MEMBER;

public class SuccessorWithDelete {
	private int[] Sorted;
	
	public SuccessorWithDelete(int[] S)
	{
		Sorted=new int[S.length];
		for (int i = 0; i < S.length; i++) {
			Sorted[i]=S[i];
		}
		quicksort(Sorted, 0, Sorted.length-1);
	}
	public int FindSuccessor(int X) {
		return Sorted[X+1];
	}
	
	public int[] Remove(int[] S,int X) {
		int[] AlreadyRemoved=new int[S.length];
		for (int i = 0; i < S.length; i++) {
			if (i<X) {
				AlreadyRemoved[i]=S[i];
			}
			if (i>X) {
				AlreadyRemoved[i-1]=S[i];
			}
		}
		return AlreadyRemoved;
	}
	public void quicksort(int[] N,int left,int right) {
		int dp;
		if(left<right)
		{
			dp=partition(N, left, right);
			quicksort(N, left, dp-1);
			quicksort(N, dp+1, right);
		}
	}
	public int partition(int[] N,int left,int right) {
		int pivot=N[left];
		while (left<right) {
			while(left<right&&N[right]>=pivot)
				right--;
			if (left<right) {
				N[left++]=N[right];
			}
			while (left<right&&N[left]<=pivot) 
				left++;
			if (left<right) {
				N[right--]=N[left];
			}
		}
		N[left]=pivot;
		return left;
	}
}
