package coding17;
import java.util.*;
public class IsBipartite { // most important
	class Solution {
	    public boolean isBipartite(int[][] graph) {
	       Queue<Pair> q = new LinkedList<>(); 
	       HashMap<Integer , Integer> vstd = new HashMap<>();
	       for(int i=0;i<graph.length;i++) {
	    	   if(vstd.containsKey(i)) {
	    		   continue;
	    	   }q.add(new Pair(i,0));
	    	   while(!q.isEmpty()) {
	    		   Pair rv = q.poll();
	    		   if(vstd.containsKey(rv.vtx)) {
	    			   if(vstd.get(rv.vtx)!=rv.dis) {
	    				   return false;
	    			   }continue;
	    		   }vstd.put(rv.vtx, rv.dis);
	    		   for(int nbrs : graph[rv.vtx]) {
	    			   if(!vstd.containsKey(nbrs)) {
	    				   q.add(new Pair(nbrs,rv.dis+1));
	    			   }
	    		   }
	    	   }
	       }return true;
	    }
	}
	public class Pair{
		int vtx;
		int dis;
		public Pair(int vtx, int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}
		
	}

}
