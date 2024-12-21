package Practice6;

import java.util.*;

public class Graphs {
	static class edge{
		int src;
		int des;
		int weight;
		
		public edge(int src, int des, int weight) {
			this.src = src;
			this.des = des;
			this.weight = weight;
		}

		public edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
		
	}
	public static void create(ArrayList<edge> graph[]) { // adjacency list
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();// create null array
		}
		graph[0].add(new edge(0,2)); //add edge
		
		graph[1].add(new edge(1,2));
		graph[1].add(new edge(1,3));
		
		graph[2].add(new edge(2,0));
		graph[2].add(new edge(2,1));
		graph[2].add(new edge(2,3));
		graph[3].add(new edge(3,1));
		graph[3].add(new edge(3,2));
	}
	public static void Create(ArrayList<edge> graph[]) { // weighted
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();// create null array
		}
		graph[0].add(new edge(0,2,2)); //add weight
		
		graph[1].add(new edge(1,2,10));
		graph[1].add(new edge(1,3,0));
		
		graph[2].add(new edge(2,0,2));
		graph[2].add(new edge(2,1,10));
		graph[2].add(new edge(2,3,-1));
		graph[3].add(new edge(3,1,0));
		graph[3].add(new edge(3,2,-1));
	}
	public static void BFS(ArrayList<edge> graph[] ,int v,boolean[] visited ,int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int curr = q.remove();
			if(visited[curr]==false) {
				System.out.print(curr+"  ");
				visited[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					edge e = graph[curr].get(i);
					q.add(e.des);
				}
			}
		}
	}
	public static void DFS(ArrayList<edge> graph[],int curr , boolean[] visited) {
	    System.out.print(curr+"  ");
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(visited[curr]==false) {
			   DFS(graph,e.des,visited);
			}
		}
	}
	public static void AllPath(ArrayList<edge> graph[], int curr ,boolean[] visited, String path, int target) {
		if(curr==target) {//modify dfs O(v^v)
			System.out.println(path);
			return;
		}for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(visited[e.des]==false) { // if neighbor is not visited then
				visited[curr]=true;
				AllPath(graph,e.des,visited,path+e.des,target);
				visited[curr]=false;// backtrack
			}
		}
	}
	public static boolean dfsCycle(ArrayList<edge> graph[], int curr, boolean [] visited,boolean[] rec) {
		visited[curr]=true;
		rec[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(rec[e.des]) {         //cycle
				return true;
			}else if(visited[e.des]==false) {
				if(dfsCycle(graph,e.des,visited,rec)) {
					return true;
				}
			}
		}rec[curr]=false;
		return false;
	}
	public static void TopSortutil(ArrayList<edge> graph[],int curr,boolean[] visited , Stack<Integer> stk) {
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(!visited[e.des]) {
				TopSortutil(graph,e.des,visited,stk);
			}
		}stk.push(curr);
	}
	public static void TopSort(ArrayList<edge> graph[], int v) {
		boolean[] visited = new boolean[v];
		Stack<Integer> stk = new Stack<>();
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				TopSortutil(graph,i,visited,stk);
			}
		}while(!stk.isEmpty()) {
			System.out.print(stk.pop()+"  ");
		}
	}
	public static boolean cycle(ArrayList<edge> graph[],int curr , boolean[] visited,int par) {
		visited[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			edge e = graph[curr].get(i);
			if(visited[e.des]==true && e.des!=par) {
				return true;
			}else if(!visited[e.des]) {
				if(cycle(graph,e.des,visited,curr)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int v =4;
		ArrayList<edge> graph[] = new ArrayList[v]; 
		create(graph);
		boolean [] visited = new boolean[v];
//		TopSort(graph,v);
		System.out.println(cycle(graph,0,visited,-1));
//		boolean [] rec =new boolean [v];
//		for(int i=0;i<v;i++) {
//			if(visited[i]==false) {
//				boolean isCycle = dfsCycle(graph,0,visited,rec);
//				if(isCycle) {
//					System.out.println(isCycle);
//					break;
//				}
//			}
//		}
//		AllPath(graph,0,visited,"0",3);
//		System.out.println(dfsCycle(graph,0,visited,new boolean[v])); // for the single graph
//		for(int i=0;i<v;i++) {
//			if(visited[i]==false) {
//				DFS(graph,i, visited); //for disconnected components
//			}
//		}
//		DFS(graph,0,visited);
		
//		Create(graph);
		
		// 2's neighbors
//		for(int i=0;i<graph[2].size();i++) {
//			edge e = graph[2].get(i);
//			System.out.println(e.des+" , "+e.weight);
//		}
	}
	// line 23 unweighed graph create
	// line 38 weighted graph create
	// line 53 BFS
	// line 68 DFS
	// line 78 AllPath
	// line 91 cycle detect  in directed graphs
	// line 106 Topological sorting
	// line 126 cycle detect in undirected graphs
}
