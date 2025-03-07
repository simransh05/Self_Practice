package re_coding15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
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
		String Path;
		int cost;

		public edgePair(int v, String Path, int cost) {
			this.v = v;
			this.Path = Path;
			this.cost = cost;
		}

		public String toString() {
			return v + "-->" + Path + "@" + cost;
		}

	}

	public void Dijkstra(int src) {
		PriorityQueue<edgePair> pq = new PriorityQueue<>(new Comparator<edgePair>() {

			@Override
			public int compare(edgePair o1, edgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		HashSet<Integer> vstd = new HashSet<>();
		pq.add(new edgePair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			edgePair rp = pq.remove();
			if (vstd.contains(rp.v)) {
				continue;
			}
			vstd.add(rp.v);
			System.out.println(rp);
			for (int nbrs : map.get(rp.v).keySet()) {
				if (!vstd.contains(nbrs)) {
					int cost = map.get(rp.v).get(nbrs);
					pq.add(new edgePair(nbrs, rp.Path + nbrs, rp.cost + cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		Dijkstra_Algo g = new Dijkstra_Algo(7);
		g.addEdge(1, 4, 6);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 4, 5);
		g.addEdge(4, 5, 1);
		g.addEdge(5, 6, 4);
		g.addEdge(7, 5, 2);
		g.addEdge(6, 7, 3);
		g.Dijkstra(1);

	}

}
