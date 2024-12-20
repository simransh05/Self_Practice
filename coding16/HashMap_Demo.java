package coding16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String ,Integer> map = new HashMap<>();
		// put for adding 
		map.put("Raj", 89);
		map.put("Ankit", 79);
		map.put("Kaju", 99);
		map.put("Ankita", 59);
		map.put("Vishal", 77);
		map.put("Pooja", 88);
		map.put("Anku", 88);
		map.put("Puneet", 73);
		System.out.println(map); //show in random order
//		// {Kaju=99, Ankita=59, Anku=88, Raj=89, Pooja=88, Puneet=73, Vishal=77, Ankit=79}
//		// contains key 
//		System.out.println(map.containsKey("kajal")); // false
//		System.out.println(map.containsKey("Kaju")); // true (case sensitive)
//		// for getting the value of the key
//		System.out.println(map.get("Kajal")); //null
//		System.out.println(map.get("Ankita")); // 59
//		// remove 
//		System.out.println(map.remove("Kajal")); //null
//		System.out.println(map.remove("Kaju")); // print -99
//		System.out.println(map);
//		// {Ankita=59, Anku=88, Raj=89, Pooja=88, Puneet=73, Vishal=77, Ankit=79}
//		System.out.println(map.size());// 7
		
		
		
		TreeMap<String , Integer> map1 = new TreeMap<>();
		// put sorted key display 
		map1.put("Raj", 89);
		map1.put("Ankit", 79);
		map1.put("Kaju", 99);
		map1.put("Ankita", 59);
		map1.put("Vishal", 77);
		map1.put("Pooja", 88);
		map1.put("Anku", 88);
		map1.put("Puneet", 73);
		map1.put("Ankita", 38);
		System.out.println(map1); // O(logn)
		
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// put
		map2.put("Raj", 89);
		map2.put("Ankit", 79);
		map2.put("Kaju", 99);
		map2.put("Ankita", 59);
		map2.put("Vishal", 77);
		map2.put("Pooja", 88);
		map2.put("Anku", 88);
		map2.put("Puneet", 73);
		map2.put("Ankita", 38);
		map2.put(null, 78);
		System.out.println(map2);//O(1)
		
		// loop
//		Set<String> set = map.keySet();// key is stored in set
//		for(String i: set) {
//			System.out.println(i +" "+map.get(i));
//		}
		
		//another way
		for(String i: map.keySet()) {
			System.out.println(i +" "+map.get(i));
		}
	}

}
