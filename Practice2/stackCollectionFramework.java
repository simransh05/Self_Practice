package Practice2;
import java.util.Stack;
public class stackCollectionFramework {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}System.out.println();
		s.push(5);
		s.push(9);
		System.out.println(s.peek());
	}

}
