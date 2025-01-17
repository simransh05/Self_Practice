package coding18;

import java.util.HashMap;

public class Disjoint_Set {
	public class node {
		int data;
		node parent;
		int rank;
	}
	private HashMap<Integer, node> map = new HashMap<>();
	public void createSet(int v) { //O(1)
		node nn = new node();
		nn.data=v;
		nn.rank=0;
		nn.parent=nn;
		map.put(v, nn);
	}
	public int find(int v) { // O(logN)
		 node nn = map.get(v);
		 return find(nn).data;
	}
	private node find(node nn) {
		if(nn.parent==nn) {
			return nn;
		}node n= find(nn.parent);
		nn.parent=n;//path compression
		return n;
	}
	public void union(int v1, int v2) {
		node nn1 = map.get(v1);
		node nn2=map.get(v2);
		node r1 = find(nn1);
		node r2 = find(nn2);
		if(r1.rank==r2.rank) {
			r1.parent=r2;
			r2.rank++;
		}else if(r1.rank>r2.rank) {
			r2.parent=r1;
		}else {
			r1.parent=r2;
		}	
	}

}
