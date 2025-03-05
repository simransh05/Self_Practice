package re_coding13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
	public static class Pair {
		int vtx;
		int dis; // vertex // distance

		public Pair(int vtx, int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}
	}

	public static boolean Is_Bipartite(int[][] edges) {
		Queue<Pair> q = new LinkedList<>();
		HashMap<Integer, Integer> vstd = new HashMap<>();
		for (int key = 0; key < edges.length; key++) {
			if (vstd.containsKey(key)) {
				continue;
			}
			q.add(new Pair(key, 0));
			while (!q.isEmpty()) {
				Pair rv = q.poll();
				if (vstd.containsKey(rv.vtx)) {
					if (vstd.get(rv.vtx) != rv.dis) {
						return false;
					}
					continue;
				}
				vstd.put(rv.vtx, rv.dis);
				for (int nbrs : edges[rv.vtx]) {
					if (!vstd.containsKey(nbrs)) {
						q.add(new Pair(nbrs, rv.dis + 1));
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] edges = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
		System.out.println(Is_Bipartite(edges));
	}

}
