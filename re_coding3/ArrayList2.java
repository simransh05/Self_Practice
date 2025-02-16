package re_coding3;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(7);
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);
		list.add(20);
		list.add(30);
		System.out.println(list);

	}

}
