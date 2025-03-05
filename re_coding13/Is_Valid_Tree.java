package re_coding13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Is_Valid_Tree {
	public boolean isValid(int n, int[][] edge) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < edge.length; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < edge.length; i++) {
			int v1 = edge[i][0];
			int v2 = edge[i][1];
			map.get(v1).add(v2);
			map.get(v2).add(v1);
		}
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vstd = new HashSet<>();
		int c = 0;
		for (int key : map.keySet()) {
			if (vstd.contains(key)) {
				continue;
			}
			c++;
			q.add(key);
			while (!q.isEmpty()) {
				int rv = q.remove();
				if (vstd.contains(rv)) {
					return false;
				}
				vstd.add(rv);
				for (int nbrs : map.get(rv)) {
					if (!vstd.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return c == 1;
	}
	
}
