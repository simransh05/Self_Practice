package coding11;

import java.util.Stack;

public class Stock_Span {
	public static void span(int [] arr) {
		int[] ans = new int[arr.length]; 
		Stack<Integer> stk = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]) {
				stk.pop();
			}if(stk.isEmpty()) {
				ans[i]=i+1;
			}else{
				ans[i]=i-stk.peek();
			}stk.push(i);
		}for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] arr = {30,35,40,38,37};
		span(arr);
	}

}
