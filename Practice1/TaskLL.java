package Practice1;
import java.util.*;
public class TaskLL {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		// question 1
//		list.add(1);
//		list.add(5);
//		list.add(7);
//		list.add(3);
//		list.add(8);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);
//		System.out.println(list.indexOf(7));
//		question 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
//		int element = sc.nextInt();
		for (int i =0;i<10;i++) {
			int n = sc.nextInt();
			if (n>=1 && n<=25) {
				list.add(n);
			}else {
				
				continue;
			}
		}System.out.println(list);
		sc.close();
	}

}
