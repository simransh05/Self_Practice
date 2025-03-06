package re_coding14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Kruskal_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskal_Algo(int v) {
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
		int e1;
		int e2;
		int cost;

		public edgePair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		public String toString() {
			return e1 + "-->" + e2 + "@" + cost;
		}

	}

	public List<edgePair> getAllEdge() {
		List<edgePair> list = new ArrayList<>();
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				int cost = map.get(v1).get(v2);
				list.add(new edgePair(v1, v2, cost));
			}
		}
		return list;
	}

	public int kruskal() {
		List<edgePair> ll = getAllEdge();
		Collections.sort(ll, new Comparator<edgePair>() {

			@Override
			public int compare(edgePair o1, edgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		int sum = 0;
		DSU dsu = new DSU();
		for (int v : map.keySet()) {
			dsu.create(v);
		}
		for (edgePair e : ll) {
			int re1 = dsu.find(e.e1);
			int re2 = dsu.find(e.e2);
			if (re1 == re2) {
				// nothing
			} else {
				dsu.union(re1, re2);
				sum += e.cost;
				System.out.println(e);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Kruskal_Algo g = new Kruskal_Algo(7);
		g.addEdge(1, 4, 6);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 4, 5);
		g.addEdge(4, 5, 1);
		g.addEdge(5, 6, 4);
		g.addEdge(7, 5, 2);
		g.addEdge(6, 7, 3);
		System.out.println(g.kruskal());
	}

}
