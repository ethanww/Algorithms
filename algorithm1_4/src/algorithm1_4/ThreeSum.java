package algorithm1_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSum {

	// print distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	public static void printAll(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						StdOut.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	// return number of distinct triples (i, j, k) such that a[i] + a[j] + a[k]
	// = 0
	public static int count(int[] a) {
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}

	/*public static void main(String[] args) throws FileNotFoundException {
		Scanner cin = new Scanner(new File(args[0]));

		ArrayList<Integer> arrayList = new ArrayList<>();
		while (cin.hasNext()) {
			arrayList.add(cin.nextInt());
		}
		int[] a = new int[arrayList.size()];
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			a[i] = arrayList.get(i);
		}
		cin.close();
		Stopwatch timer = new Stopwatch();
		int cnt = count(a);
		StdOut.println("elapsed time = " + timer.elapsedTime());
		StdOut.println(cnt);
	}*/
    public static void main(String[] args)  { 
        int[] a = In.readInts(args[0]);

        Stopwatch timer = new Stopwatch();
        int cnt = count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(cnt);
    } 
}
