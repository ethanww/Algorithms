package algorithm1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {
	private int[] id;
	private int count;

	public QuickUnionUF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++){
			id[i] = i;
		}
	}
	
    public int count() {
        return count;
    }
    
    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }
    
    public boolean connected(int p, int q) {
    	return find(p) == find(q);
    }
    
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        id[i] = j; 
        count--;
    }
    
	public static void main(String[] args) {
		int N=StdIn.readInt();
		QuickUnionUF uf=new QuickUnionUF(N);
		while (!StdIn.isEmpty()) {
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			if (uf.connected(p, q)) {
				continue;
			}
			uf.union(p, q);
			StdOut.println(p+" "+q);
		}
		StdOut.println(uf.count()+"componets");				
	}
}
