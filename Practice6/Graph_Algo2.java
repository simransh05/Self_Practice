package Practice6;

import java.util.*;

public class Graph_Algo2 {
	static class edge{
		int src;
		int des;

		public edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}
	public static void create(ArrayList<edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]= new ArrayList<edge>();
		}
		graph[0].add(new edge(0,2));
		graph[0].add(new edge(0,1));
		graph[0].add(new edge(0,3));
		graph[1].add(new edge(1,0));
		graph[1].add(new edge(1,2));
		graph[2].add(new edge(2,0));
		graph[2].add(new edge(2,1));
		graph[3].add(new edge(3,4));
		graph[3].add(new edge(3,0));
		graph[4].add(new edge(4,3));
	}

	private static void topSort(ArrayList<edge>[] graph, int curr, boolean[] visited, Stack<Integer> s) {
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			edge e =graph[curr].get(i);
			if(!visited[e.des]) {
				topSort(graph , e.des,visited,s);
			}
		}s.push(curr);
	}
	
	public static void dfs(ArrayList<edge> graph[],int curr ,boolean[] visited) {
		visited[curr]=true;
		System.out.print(curr+"  ");
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(!visited[e.des]) {
				dfs(graph,e.des,visited);
			}
		}
	}
	public static void kosaraju(ArrayList<edge> graph[],int v) {
		Stack<Integer> s = new Stack<>();
		boolean [] visited =new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				topSort(graph,i,visited,s);
			}
		}ArrayList<edge> transpose[] =new ArrayList[v];
		for(int i=0;i<graph.length;i++) {
			visited[i]=false;
			transpose[i]= new ArrayList<edge>();
		}for(int i=0;i<v;i++) {
			for(int j=0;j<graph[i].size();j++) {
				edge e =graph[i].get(j);
				transpose[e.des].add(new edge(e.des,e.src));
			}
		}
		while(!s.isEmpty()) {
			int curr = s.pop();
			if(!visited[curr]) {
				dfs(transpose,curr,visited);
				System.out.println();
			}
		}
	}
	public static void tarjan(ArrayList<edge> graph[], int v) {
		int [] dt = new int[v];
		int low[] = new int[v];
		int time =0;
		boolean[] visited =new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				DFS(graph,i,visited,dt , low,time,-1);
			}
		}
	}

	private static void DFS(ArrayList<edge>[] graph, int curr, boolean[] visited, int[] dt, int[] low, int time, int par) {
		visited[curr]=true;
		dt[curr]=low[curr]=++time;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(e.des==par) {
				continue;
			}else if(!visited[e.des]) {
				DFS(graph,e.des,visited,dt,low,time,curr);
				low[curr]=Math.min(low[curr], low[e.des]);
				if(dt[curr]<low[e.des]) {
					System.out.println(curr +"--> "+ e.des);
				}
			}else {
				low[curr]=Math.min(low[curr], dt[e.des]);
			}
		}
	}
	
	// O(V+E)
	public static void Articulation(ArrayList<edge> graph[],int v ) {
		int [] dt = new int[v];
		int low[] = new int[v];
		int time =0;
		boolean[] visited =new boolean[v];
		boolean[] ap = new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				DFS1(graph,i,visited,dt , low,time,-1,ap);
			}
		}for(int i=0;i<ap.length;i++) {
			if(ap[i]) {
				System.out.println(i);
			}
		}
	}

	private static void DFS1(ArrayList<edge>[] graph, int curr, boolean[] visited, int[] dt, int[] low, int time, int par, boolean[] ap) {
		visited[curr]=true;
		dt[curr]=low[curr]=++time;
		int child=0;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(e.des==par) {
				continue;
			}else if(!visited[e.des]) {
				DFS1(graph,e.des,visited,dt,low,time,curr,ap);
				low[curr]=Math.min(low[curr],low[e.des]);
				if(dt[curr]<=low[e.des] && par!=-1) {
					ap[curr]=true;
				}child++;
			}else {
				low[curr]=Math.min(low[curr], dt[e.des]);
			}
		}if(par==-1 && child>1 ) {
			ap[curr]=true;
		}
	}

	public static void main(String[] args) {
		int v =5;
		ArrayList<edge> graph[] = new ArrayList[v]; 
		create(graph);
//		kosaraju(graph,v);
//		tarjan(graph,v);
		Articulation(graph,v);
	}
	
	// line 26 Topological Sort for Kosaraju's
	// line 36 DFS for Kosaraju's
	// line 46 Kosaraju's Algorithm
	// line 76 Tarjan's Algorithm
	// line 88 DFS for Tarjan's
	// line 108 Articulation point 
	// line 125 DFS for Articulation

}
