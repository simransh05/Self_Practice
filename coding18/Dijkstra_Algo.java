package coding18;

import java.util.*;
import java.util.Comparator;

public class Dijkstra_Algo {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public Dijkstra_Algo(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}public class Pair {
		int vtx;
		String path;
		int cost;
		public Pair(int vtx, String path, int cost) {
			this.vtx = vtx;
			this.path = path;
			this.cost = cost;
		}
		public String toString() {
			return this.vtx+" - "+this.path+" @ "+this.cost;
		}
	}
	public void Dijkstra(int src) {
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
			public int compare(Pair o1, Pair o2) {
				return o1.cost-o2.cost;
			}
		});
		HashSet <Integer> vstd = new HashSet<>();
		pq.add(new Pair(src,""+src,0));
		while(!pq.isEmpty()) {
			Pair rp = pq.remove();
			if(vstd.contains(rp.vtx)) {
				continue;
			}vstd.add(rp.vtx);
			System.out.println(rp);
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!vstd.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new Pair(nbrs , rp.path+nbrs,rp.cost+cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Dijkstra_Algo dj = new Dijkstra_Algo(7);
		dj.addEdge(1, 4, 6);
		dj.addEdge(1, 2, 10);
		dj.addEdge(2, 3, 7);
		dj.addEdge(3, 4, 5);
		dj.addEdge(4, 5, 1);
		dj.addEdge(5, 6, 4);
		dj.addEdge(7, 5, 2);
		dj.addEdge(6, 7, 3);
		dj.Dijkstra(1);
	}

}
