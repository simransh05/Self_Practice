package re_coding14;

import java.util.HashMap;

public class DSU {
	class node {
		int data;
		node parent;
		int rank;

	}

	private HashMap<Integer, node> map = new HashMap<>();

	public void create(int v) {
		node nn = new node();
		nn.data = v;
		nn.parent = nn;
		nn.rank = 0;
		map.put(v, nn);
	}

	public int find(int v) {
		node nn = map.get(v);
		return find(nn).data;
	}

	private node find(node nn) {
		if (nn.parent == nn) {
			return nn;
		}
		node n = find(nn.parent);
		nn.parent = n;// path compression
		return n;
	}

	public void union(int v1, int v2) {
		node nn1 = map.get(v1);// address
		node nn2 = map.get(v2);
		node n1 = find(nn1);// representative node
		node n2 = find(nn2);
		if (n1.rank == n2.rank) {
			n1.parent = n2;
			n2.rank++;
		} else if (n1.rank > n2.rank) {
			n2.parent = n1;
		} else {
			n1.parent = n2;
		}
	}
}
