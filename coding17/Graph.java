package coding17;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public Graph(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public void addVertex(int v1) {
		map.put(v1, new HashMap<>());
	}
	public boolean HasEdge(int v1,int v2) {
		return map.get(v1).containsKey(v2);
	}
	public boolean HasVertex(int v1) {
		return map.containsKey(v1);
	}
	public int totalEdge() {
		int sum =0;
		for(int key:map.keySet()) {
			sum+=map.get(key).size();
		}return sum/2;
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void removeVertex(int v1) {
		for(int nbrs :map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}map.remove(v1);
	}
	public void display() {
		for(int key:map.keySet()) {
			System.out.println(key+"  "+map.get(key));
		}
	}
	public  boolean HasPath(int src , int des,HashSet<Integer>vstd) {
		if(src==des) {
			return true;
		}
		vstd.add(src);
		for(int nbrs :map.get(src).keySet()) {
			if(!vstd.contains(nbrs)) {
				boolean ans = HasPath(nbrs,des,vstd);
				 if(ans) {
					return true;
				}
			}
		}
		return false;
	}
	public  void AllPath(int src , int des,HashSet<Integer>vstd, String ans) {
		if(src==des) {
			System.out.println(ans+des);
			return ;
		}
		vstd.add(src);
		for(int nbrs :map.get(src).keySet()) {
			if(!vstd.contains(nbrs)) {
				 AllPath(nbrs,des,vstd,ans+src);
			}
		}
		vstd.remove(src);
	}
	public boolean bfs(int src ,int des) {
		Queue<Integer> q =new LinkedList<>();
		q.add(src);
		HashSet<Integer> vst = new HashSet<>();
		while(!q.isEmpty()) {
			int rv = q.remove();
			if(vst.contains(rv)) {
				continue;
			}vst.add(rv);
			if(src == des) {
				return true;
			}for(int nbrs :map.get(rv).keySet()) {
				if(!vst.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}return false;
	}
	public boolean dfs(int src ,int des) {
		Stack<Integer> s =new Stack<>();
		s.push(src);
		HashSet<Integer> vst = new HashSet<>();
		while(!s.isEmpty()) {
			int rv = s.pop();
			if(vst.contains(rv)) {
				continue;
			}vst.add(rv);
			if(src == des) {
				return true;
			}for(int nbrs :map.get(rv).keySet()) {
				if(!vst.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}return false;
	}
	
}
