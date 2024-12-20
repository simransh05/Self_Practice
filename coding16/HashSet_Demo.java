package coding16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(3);
		set.add(50);
//		System.out.println(set); // [50, 3, 20, 40, 10, 30]
//		// contains for checking value present or not 
//		System.out.println(set.contains(3)); // true
//		System.out.println(set.contains(23)); // false
//		// remove 
//		System.out.println(set.remove(3));
//		System.out.println(set);// [50, 20, 40, 10, 30]
//		for(int i : set) {
//			System.out.print(i+"  ");
//		}
		
		
		TreeSet<Integer>set1 = new TreeSet<>(); 
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(30);
		set1.add(3);
		set1.add(50);
		System.out.println(set1); //[3, 10, 20, 30, 40, 50] (sorted)
		
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// order maintain -> add
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(30);
		set2.add(3);
		set2.add(50);
		System.out.println(set2); //[10, 20, 30, 40, 3, 50]
	}

}
