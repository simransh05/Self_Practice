package Practice2;
import java.util.Stack;
public class stackImplement {
	static void pushBottom(int data , Stack<Integer> stk) {
		if (stk.isEmpty()) {
			stk.push(data);
			return ;
		}int top = stk.pop();
		pushBottom(data,stk);
		stk.push(top);
	}
	static void reverse(Stack<Integer> stk) {
		if (stk.isEmpty()) {
			return ;
		}int top = stk.pop();
		reverse(stk);
		pushBottom(top,stk);
	}

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
//		pushBottom(4,stk);
		reverse(stk);
		while(!stk.isEmpty()) {
			System.out.print(stk.pop()+" ");
		}
		
	}

}
