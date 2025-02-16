package re_coding3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_FrameWork {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
//		add
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		// add index and value
		list.add(2, 15);
		System.out.println(list);
//		get
		System.out.println(list.get(0));
		// remove 
		System.out.println(list.remove(0));
		System.out.println(list);
		list.add(15);
		list.add(26);
		list.add(37);
		// update 
		list.set(0, 21);
		System.out.println(list);
		// size 
		System.out.println(list.size());
		// sort 
		Collections.sort(list);
		System.out.println(list);
		// display
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}System.out.println();
		// for each loop
		for(int i: list) {// read value
			System.out.print(i+"  ");
		}
	}

}
