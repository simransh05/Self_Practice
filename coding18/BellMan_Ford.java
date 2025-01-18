package coding18;

import java.util.*;

public class BellMan_Ford {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public BellMan_Ford(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
	}
	public class Pair{
		int e1;int e2 ;int cost;

		public Pair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
		public String toString() {
			return e1+" - "+e2+" @ "+cost;
		}
	}
	
	public List<Pair> getAllEdge(){
		List<Pair> ll = new ArrayList<>();
		for(int e1 : map.keySet()) {
			for(int e2 :map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new Pair(e1,e2,cost));
			}
		}return ll;
	}

	public void BellMan() {
		int v =map.size();
		int[] dis = new int[v+1];
		for(int i=2;i<dis.length;i++) {
			dis[i]=99999999;
		}List<Pair> ll = getAllEdge();
		for(int i=1;i<=v;i++) {
			for(Pair e : ll) {
				if(i==v && dis[e.e2]>dis[e.e1]+e.cost) {
					System.out.println("-wt cycle");
					return;
				}
				if(dis[e.e2]>dis[e.e1]+e.cost) {
					dis[e.e2]= dis[e.e1]+e.cost;
				}
			}
		}
		for(int i=1;i<dis.length;i++) {
			System.out.println(dis[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BellMan_Ford bfd = new BellMan_Ford(5);
		bfd.addEdge(1, 2, 8);
		bfd.addEdge(2, 5, -2);
//		bfd.addEdge(2, 5, 2);
		bfd.addEdge(5, 2, 1);
		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
		bfd.BellMan();
	}

}
