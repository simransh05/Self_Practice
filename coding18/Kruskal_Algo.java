package coding18;

import java.util.*;

public class Kruskal_Algo {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public Kruskal_Algo(int v) {
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
	public int Kruskal() {
		List<Pair> ll = getAllEdge();
		Collections.sort(ll, new Comparator<Pair>() {
			public int compare(Pair o1 , Pair o2) {
				return o1.cost-o2.cost;
			}
		});
		int sum=0;
		Disjoint_Set dsu = new Disjoint_Set();
		for(int v:map.keySet()) {
			dsu.createSet(v);
		}for(Pair e :ll ) {
			int r1 = dsu.find(e.e1);
			int r2 = dsu.find(e.e2);
			if(r1==r2) {
				
			}else {
				dsu.union(e.e1, e.e2);
				sum+=e.cost;
				System.out.println(e);
			}
		}return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Kruskal_Algo ka = new Kruskal_Algo(n);
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			int v1 = sc.nextInt();
			int v2 =  sc.nextInt();
			int cost = sc.nextInt();
			ka.addEdge(v1, v2, cost);
		}System.out.println(ka.Kruskal());
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
