package coding15;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //minimum heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //maximum heap
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(1);
		pq.add(5);
		pq.add(7);
		pq.add(3);
		pq.add(2);
		pq.add(-4);
		System.out.println(pq);
		
	}

}
