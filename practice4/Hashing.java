package practice4;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {

	public static void main(String[] args) {
		//creating
		HashSet<Integer> set =new HashSet<>();
		
		//add
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		
		// is empty
		if(!set.isEmpty()) {
			System.out.println("not empty");
		}
		
		//iterator
		 Iterator it = set.iterator();
		 while(it.hasNext()) {
			 System.out.print(it.next()+"  ");
		 }System.out.println();
		
		//print Element
		System.out.println(set);
		
		//size
		System.out.println(set.size());// size without duplicate
		
		//contains
		if(set.contains(10)) {
			System.out.println("contain");
		}
		if(!(set.contains(50))) {
			System.out.println("does not contain");
		}
		// remove
		set.remove(30);
		if(set.contains(30)) {
			System.out.println("contains");
		}else {
			System.out.println("does not contain");
		}
	}

}
