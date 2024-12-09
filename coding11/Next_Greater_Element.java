package coding11;

import java.util.Stack;

public class Next_Greater_Element {
	
	public static void greater(int[]arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stk = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!stk.isEmpty() && arr[i]>arr[stk.peek()]) {
				ans[stk.pop()]=arr[i];
			}stk.push(i);
		}while(!stk.isEmpty()){
			ans[stk.pop()]=-1;
		}
		for(int i=0;i<ans.length;i++) {
			System.out.println(arr[i]+", "+ans[i]);
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {11,9,13,21,3};
		greater(arr);
	}

}
