package coding4;
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(20); //capacity is stored here
		System.out.println(list);
		
		//add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);  // (10,20,30,40,50,60)
		// add in between
		list.add(1, 15); // range 0-size
		System.out.println(list); // (10,15,20,30,40,50,60)
		
		// get
		System.out.println(list.get(2)); // range 0-size-1 (20)
		
		// remove
		System.out.println(list.remove(0)); // print the element (10)
		System.out.println(list); // (15,20,30,40,50,60) after remove
		
		// update
		list.set(2, 25); // change 30 to 25
		System.out.println(list); // (15,20,25,40,50,60)
		
		//size
		System.out.println(list.size()); //6
		
		//sort
		list.add(2);
		list.add(58);
		list.add(31);
		Collections.sort(list);//for sorting
		System.out.println(list); //[2, 15, 20, 25, 31, 40, 50, 58, 60]
		
		// display
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"   ");
		}System.out.println();
		
		// for each loop use 
		for(int i:list) {
			System.out.print(i+"   ");
		}
	}
}
