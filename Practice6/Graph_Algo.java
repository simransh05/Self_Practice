package Practice6;

import java.util.*;

public class Graph_Algo {
	static class edge{
		int src;
		int des;
		int weight;

		public edge(int src, int des, int weight) {
			this.src = src;
			this.des = des;
			this.weight = weight;
		}
		
	}
	
	public static void create(ArrayList<edge> graph[]) { 
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new edge(0,1,2));
		graph[0].add(new edge(0,2,4));
		
		graph[1].add(new edge(1,2,1));
		graph[1].add(new edge(1,3,7));
		
		graph[2].add(new edge(2,4,3));
		graph[3].add(new edge(3,5,1));
		graph[4].add(new edge(4,3,2));
		graph[4].add(new edge(4,5,5));
		
	}
	public static class pair implements Comparable<pair>{
		int node;
		int dis;
		public pair(int node, int dis) {
			this.node = node;
			this.dis = dis;
		}
		@Override
		public int compareTo(pair p2) {
			// TODO Auto-generated method stub
			return this.dis-p2.dis; //ascending order sorting
		}
		
	}
	//O(E+ElogV)
	public static void Dijkstra(ArrayList<edge> graph[],int src,int v) {
		PriorityQueue<pair> pq = new PriorityQueue<>();
		int[]dis =new int[v];
		for(int i=0;i<v;i++) {
			if(i!=src) {
				dis[i]=Integer.MAX_VALUE;
			}
		}
		boolean[] visited = new boolean[v];
		pq.add(new pair(0,0));
		while(!pq.isEmpty()) {
			pair curr = pq.remove();
			if(visited[curr.node]==false) {
				visited[curr.node]=true;
				for(int i=0;i<graph[curr.node].size();i++) {
					edge e = graph[curr.node].get(i);
					int u= e.src;
					int V = e.des;
					if(dis[u]+e.weight<dis[V]) { // relaxation
						dis[V]=dis[u]+e.weight;
						pq.add(new pair(V,dis[V]));
					}
				}
			}
		}for(int i=0;i<v;i++) {
			System.out.print(dis[i]+"  ");
		}System.out.println();
	}
	
	public static void BellMan(ArrayList<edge> graph[],int src,int v) {
		int[]dis =new int[v];
		for(int i=0;i<v;i++) {
			if(i!=src) {
				dis[i]=Integer.MAX_VALUE;
			}
		}
		for(int k=0;k<v-1;k++) {
			for(int i=0;i<v;i++) {
				for(int j=0;j<graph[i].size();j++) {
					edge e = graph[i].get(j);
					int U= e.src;
					int V = e.des;
					if(dis[U] !=Integer.MAX_VALUE && dis[U]+e.weight<dis[V]) {
						dis[V]= dis[U]+e.weight;
					}
				}
			}
		}for(int i=0;i<v;i++) {
			System.out.print(dis[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		int v =6;
		ArrayList<edge> graph[] = new ArrayList[v]; 
		create(graph);
//		Dijkstra(graph,0,v);
		BellMan(graph,0,v);
		

	}
	
	// line 51 Dijkstra
	// line 80 BellManFord

}
