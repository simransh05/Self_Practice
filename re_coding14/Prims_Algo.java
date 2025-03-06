package re_coding14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class edgePair {
		int v;
		int acq;
		int cost;

		public edgePair(int v, int acq, int cost) {
			this.v = v;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return v + "-->" + acq + "@" + cost;
		}

	}

	public int prims() {
		PriorityQueue<edgePair> pq = new PriorityQueue<>(new Comparator<edgePair>() {

			@Override
			public int compare(edgePair o1, edgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		HashSet<Integer> vstd = new HashSet<>();
		pq.add(new edgePair(1, 1, 0));
		int sum = 0;
		while (!pq.isEmpty()) {
			edgePair rp = pq.remove();
			if (vstd.contains(rp.v)) {
				continue;
			}
			vstd.add(rp.v);
			System.out.println(rp);
			sum += rp.cost;
			for (int nbrs : map.get(rp.v).keySet()) {
				if (!vstd.contains(nbrs)) {
					int cost = map.get(rp.v).get(nbrs);
					pq.add(new edgePair(nbrs, rp.v, cost));
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Prims_Algo g = new Prims_Algo(7);
		g.addEdge(1, 4, 6);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 4, 5);
		g.addEdge(4, 5, 1);
		g.addEdge(5, 6, 4);
		g.addEdge(7, 5, 2);
		g.addEdge(6, 7, 3);
		System.out.println(g.prims());

	}

}
