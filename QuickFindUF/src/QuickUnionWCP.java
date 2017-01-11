
public class QuickUnionWCP {
	private int[] id;
	private int[] sz;
	QuickUnionWCP(int n){
		id = new int[n];
		for(int i=0;i<n;i++){
			id[i] = i;
			sz[i]=1;
		}
		
	}
	
	public int root(int p){
		
		int i=p;
		while(id[i] != i){
			i = id[i];
			id[i] = id[id[i]];
		}
		return i;
	}
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		if (sz[i] < sz[j]){ id[i] = id[j]; sz[j]+=sz[i];}
		else {id[j] = id[i]; sz[i]+=sz[j];}
	}
	public boolean connected(int p, int q){
		return (root(p) == root(q));
	}
}
