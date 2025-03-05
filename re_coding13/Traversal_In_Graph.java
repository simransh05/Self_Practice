package re_coding13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal_In_Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Traversal_In_Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vstd = new HashSet<>();
		for (int key : map.keySet()) {
			if (vstd.contains(key)) {
				continue;
			}
			q.add(key);
			while (!q.isEmpty()) {
				int rv = q.remove();
				if (vstd.contains(rv)) {
					continue;
				}
				vstd.add(rv);
				System.out.print(rv + "  ");
				for (int nbrs : map.get(rv).keySet()) {
					if (!vstd.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}

	}

}
