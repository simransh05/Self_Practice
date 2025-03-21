package coding15;

import java.util.*;

public class Cars_Implement {

	public static void main(String[] args) {
		Cars[] ar =new Cars[5];
		ar[0] = new Cars(200, 10, "White");
		ar[1] = new Cars(1000, 20, "Black");
		ar[2] = new Cars(345, 3, "Yellow");
		ar[3] = new Cars(34, 89, "Grey");
		ar[4] = new Cars(8907, 6, "Red");
//		sort(ar);
//		Arrays.sort(ar ,new Comparator<Cars>() {
//
//			@Override
//			public int compare(Cars o1, Cars o2) {
//				// TODO Auto-generated method stub
//				return o1.price-o2.price;
//			}
//		});
		
//		Arrays.sort(ar,new Comparator<Cars>() {
//
//			@Override
//			public int compare(Cars o1, Cars o2) {
//				// TODO Auto-generated method stub
//				return o2.speed-o1.speed;
//			}
//			
//		});
//		
		Arrays.sort(ar,new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.colour.compareTo(o2.colour);
			}
			
		});
		
		
		display(ar);

	}public static void display(Cars[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}public static <T extends Comparable<T>>void sort(T[] arr) {
		for(int turn=1;turn <arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i].compareTo(arr[i+1])>0) {
					T temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	

}
