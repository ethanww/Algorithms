package algorithm1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_1_15 {
	public static int[] histogram(int[] a,int M) {
		int[] M1=new int[M];
		int N=a.length;
		for (int i = 0; i < M; i++) {
			M1[i]=0;
		}
		for (int i = 0; i < N; i++) {
			if (a[i]<M) {
				M1[a[i]]++;
			}
		}
		return M1;
	}
	public static void main(String[] args) {
        int N = 30;
        int M = 10;
        
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(M);
        
        for (int i = 0; i < N; i++)
            StdOut.printf("%2d", a[i]);
        
        int[] h = histogram(a, M);
        
        StdOut.println("\n");
        for (int i = 0; i < M; i++)
            StdOut.printf("%4d", h[i]);
	}
}
