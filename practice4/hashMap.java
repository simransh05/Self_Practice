package practice4;
import java.util.*;
public class hashMap {

	public static void main(String[] args) {
		// create key=country population value
		HashMap<String , Integer> map = new HashMap<>();
		
		// adding
		map.put("india", 120);
		map.put("US", 30);
		map.put("china",150);
		System.out.println(map);
		
//		update or add
		map.put("china", 180);
		System.out.println(map);
		
		if(map.containsKey("uk")) {
			System.out.println("available");
		}else {
			System.out.println("not available");
		}
		System.out.println(map.get("china"));// exist
		System.out.println(map.get("uk"));// does not exist then null
		
		
		// iteration for key and value
		for(Map.Entry<String , Integer> e : map.entrySet()) {
			System.out.println(e.getKey()); // print key of1st then value of 2nd
			System.out.println(e.getValue());// print value of1st
		}
		
		// iteration for only key
		Set<String> key = map.keySet();
		for(String keys :key) {
			System.out.println(keys+"  "+map.get(keys));
		}

	}

}
