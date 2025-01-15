package coding17;

import java.util.HashSet;

public class Graph_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 4, 6);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 4, 5);
		g.addEdge(4, 5, 1);
		g.addEdge(5, 6, 4);
		g.addEdge(7, 5, 2);
		g.addEdge(6, 7, 3);
//		g.display();
//		System.out.println("__________________");
//		g.removeVertex(4);
//		g.display();
//		System.out.println(g.HasPath(1, 5,new HashSet<>()));
		g.AllPath(1, 7, new HashSet<>(), "");

	}

}
