package coding9;
import java.util.Stack;
public class Find_The_Celebrity {
	public static int celebrity(int[][] arr) { // leetcode 277
		Stack<Integer>stk = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			stk.push(i);
		}while(stk.size()>1) {
			int a= stk.pop();
			int b = stk.pop();
			if(arr[a][b]==1) {
				stk.push(b);
			}else {
				stk.push(a);
			}
		}int candidate=stk.pop();
		for(int i=0;i<arr.length;i++) {
			if(i==candidate) {
				continue;
			}if(arr[i][candidate]==0 || arr[candidate][i]==1) {
				return -1;
			}
		}return candidate;
	}

	public static void main(String[] args) {
		int[] [] arr= {{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
		System.out.println(celebrity(arr));

	}

}
