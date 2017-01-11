
public class QuickUnionUF {
	private int[] id;
	QuickUnionUF(int n){
		id = new int[n];
		for(int i=0;i<n;i++)
			id[i] = i;
		
	}
	
	public int root(int p){
		
		int i=p;
		while(id[i] != i) i = id[i];
		return i;
	}
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		id[i] = id[j];
	}
	public boolean connected(int p, int q){
		return (root(p) == root(q));
	}
}
