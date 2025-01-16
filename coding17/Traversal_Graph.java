package coding17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal_Graph {
	HashMap<Integer , HashMap<Integer , Integer>> map;
	public Traversal_Graph(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void addEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public void BFT() {
		Queue<Integer> q =new LinkedList<>();
		HashSet<Integer> vst = new HashSet<>();
		for(int key : map.keySet()) {
			if(vst.contains(key)) {
				continue;
			}
		    q.add(key);
		    while(!q.isEmpty()) {
			    int rv = q.remove();
			    if(vst.contains(rv)) {
				    continue;
			     }vst.add(rv);
			     System.out.print(rv+" ");
			    for(int nbrs :map.get(rv).keySet()) {
				    if(!vst.contains(nbrs)) {
					    q.add(nbrs);
				     }
			    }
		    }
		}
	}
	public void DFT() {
		Stack<Integer> s =new Stack<>();
		HashSet<Integer> vst = new HashSet<>();
		    for(int key:map.keySet()) {
		    	if(vst.contains(key)) {
					continue;
				}
		        s.push(key);
		        while(!s.isEmpty()) {
			        int rv = s.pop();
			    if(vst.contains(rv)) {
				    continue;
			    }vst.add(rv);
			    System.out.print(rv+" ");
			    for(int nbrs :map.get(rv).keySet()) {
				    if(!vst.contains(nbrs)) {
					    s.push(nbrs);
				     }
			    }
		    }
		}
	}

}
