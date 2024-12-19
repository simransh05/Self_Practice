package coding15;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Sum_Pair {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		4
//		1 2 3 4
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.remove();
			int b = pq.remove();
			sum += a + b;
			pq.add(a + b);
		}
		System.out.println(sum);

	}

}
