package coding18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Prims_Algo {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public Prims_Algo(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public class Pair{
		int v;int eq ;int cost;

		public Pair(int v, int eq, int cost) {
			this.v = v; //Vertix
			this.eq = eq; // Aquiring Vertix
			this.cost = cost;
		}
		public String toString() {
			return v+" - "+eq+" @ "+cost;
		}
	}
	public int prims() {
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> vstd = new HashSet<>();
		int sum =0;
		pq.add(new Pair(1,1,0));
		while(!pq.isEmpty()) {
			Pair rp = pq.remove();
			if(vstd.contains(rp.v)) {
				continue;
			}vstd.add(rp.v);
			System.out.println(rp);
			sum+=rp.cost;
			for(int nbrs : map.get(rp.v).keySet()) {
				if(!vstd.contains(nbrs)) {
					int cost = map.get(rp.v).get(nbrs);
					pq.add(new Pair(nbrs,rp.v,cost));
				}
			}
		}return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Prims_Algo pa = new Prims_Algo(n);
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int v1 = sc.nextInt();
			int v2 =  sc.nextInt();
			int cost = sc.nextInt();
			pa.addEdge(v1, v2, cost);
		}System.out.println(pa.prims());
		sc.close();
/*
 * 4 5 
1 2 10
2 3 15
1 3 5 
4 2 2 
4 3 40
 */

	}

}
