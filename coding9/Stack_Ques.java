package coding9;
import java.util.Stack;
public class Stack_Ques {
	public static void Insert(int val ,Stack<Integer> stk) {// insert in the bottom
		//O(1)
		if(stk.isEmpty()) {
			stk.push(val);
			return;
		}int x =stk.pop();
		Insert(val,stk);
		stk.push(x);
	}
	public static void reverse(Stack<Integer> stk) {
		if(stk.isEmpty()) {
			return;
		}int x = stk.pop();
		reverse(stk);
		Insert(x,stk);
	}

	public static void main(String[] args) {
		Stack<Integer>stk= new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println(stk);
//		Insert(-6,stk);
//		System.out.println(stk);
		reverse(stk); // O(n2)
		System.out.println(stk);
				
	}

}
