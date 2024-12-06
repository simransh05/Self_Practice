package coding9;
import java.util.Stack;
public class stack_java {

	public static void main(String[] args) {
		Stack<Integer> stk =new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println(stk.peek()); // see the top element
		System.out.println(stk);// stack display in arrayList form
		System.out.println(stk.pop()); // remove top element
		System.out.println(stk);
		System.out.println(stk.isEmpty()); // boolean if  empty
		System.out.println(stk.size()); // size of the stack
	}

}
