package Practice2;
import java.util.ArrayList;
public class stackByArrayList {
	static class stack{
		static ArrayList<Integer> list = new ArrayList<>();
		static boolean isEmpty() {
			return list.size()==0;
		}
		public static void push(int data) {
			 list.add(data);
		}
		public static int pop() {
			if (isEmpty()) {
				return -1;
			}int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}return list.get(list.size()-1);
		}
	}

	public static void main(String[] args) {
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}System.out.println();
		s.push(5);
		s.push(7);
		System.out.println(s.peek());

	}

}
