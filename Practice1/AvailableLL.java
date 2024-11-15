package Practice1;
import java.util.LinkedList;
public class AvailableLL {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println(list);
		list.size();
		for (int i =0;i<list.size();i++) {
			System.out.print(list.get(i)+"--> ");
		}System.out.println("null");
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}

}
