package practice4;
import java.util.*;
public class HashQuestion {
	static void maxFrequency(int [] arr) {
		HashMap<Integer ,Integer> map = new HashMap<>();
		int n =arr.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for(int key:map.keySet()) {
			if(map.get(key)> (n/3)) {
				System.out.println(key);
			}
		}
	}
	public static void union(int[] arr1, int[] arr2) {
		HashSet<Integer>set = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}for(int j =0;j<arr2.length;j++) {
			set.add(arr2[j]);
		}System.out.println(set);
//		return set.size();
	}
	public static int intersection(int[] arr1 ,int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}for(int j =0;j<arr2.length;j++) {
			if(set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
			}
		}
		return count;
	}
	public static String getStart(HashMap<String ,String> tick) {
		HashMap<String ,String> revMap = new HashMap<>();
		for(String key:tick.keySet()) {
			revMap.put(tick.get(key), key);
		}
		for(String key : tick.keySet()) {
			if(!(revMap.containsKey(key))) {
				return key;
			}
		}return null;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,5,1,3,1,5,1};
//		maxFrequency(arr);
		int[] arr1 = {7,3,9};
		int[] arr2 = {6,3,9,2,9,4};
		int[] arr3 = {1,2,3};
//		System.out.println(intersection(arr1,arr2));
//		union(arr1,arr2);
//		System.out.println(union(arr1,arr2));
//		HashMap<String ,String> ticket = new HashMap<>();
//		ticket.put("Chennai", "Bengaluru");
//		ticket.put("Mumbai", "Delhi");
//		ticket.put("Goa", "Chennai");
//		ticket.put("Delhi", "Goa");
//		
//		String start = getStart(ticket);
//		while(ticket.containsKey(start)) {
//			System.out.print(start+" --> ");
//			start = ticket.get(start);
//		}
//		System.out.println(start);
		HashMap<Integer ,Integer> map = new HashMap<>();
		int k =3;
		map.put(0, 1);
		int sum =0;
		int ans =0;
		for(int j =0;j<arr3.length;j++) {
			sum+=arr3[j];
			if(map.containsKey(sum-k)) {
				ans+=map.get(sum-k);
			}if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum, 1);
			}
		}
		System.out.println(ans);
	}

}
