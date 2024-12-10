package coding11;
import java.util.Stack;
public class Queue_Using_Stack {
	private Stack<Integer> stk;
	public Queue_Using_Stack() {
		stk = new Stack<>();
	}
	public int size() {
		return stk.size();
	}
	public boolean isEmpty() {
		return stk.isEmpty();
	}
	public void enqueue(int val) {
		Stack<Integer> help = new Stack<>();
		while(!stk.isEmpty()) {
			help.push(stk.pop());
		}stk.push(val);
		while(!help.isEmpty()) {
			stk.push(help.pop());
		}
	}
	public int dequeue() {
		return stk.pop();
	}
	public int getFront() {
		return stk.peek();
	}

	public static void main(String[] args) {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		System.out.println(qs.dequeue());
		System.out.println(qs.getFront());
		
		
		
		
	}

}
