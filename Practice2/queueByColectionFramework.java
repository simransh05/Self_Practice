package Practice2;
import java.util.Queue;
import java.util.*;
public class queueByColectionFramework {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while(!q.isEmpty()) {
			System.out.print(q.remove()+"  ");
		}
	}

}
