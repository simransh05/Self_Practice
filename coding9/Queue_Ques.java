package coding9;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Ques {
	public static void reverse(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}int x = q.remove();
		reverse(q);
		q.add(x);
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		reverse(q);
		System.out.println(q);

	}

}
