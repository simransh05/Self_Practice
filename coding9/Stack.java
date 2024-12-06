package coding9;

public class Stack {
	private int[] arr;
	private int index= -1;
	public Stack() {
		arr =new int[5];
	}
	public Stack(int n) {
		arr=new int[n];
	}//O(1)
	public boolean isEmpty() {
		return index==-1;
	}//O(1)
	public boolean isFull() {
		return index==arr.length-1;
	}//O(1)
	public void push(int val) throws Exception {
		if(isFull()) {
			throw new Exception("Stack Overflow");
		}
			index++;
			arr[index]=val;
	}//O(1)
	public int size() {
		return index+1;
	}//O(1)
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int rev =arr[index];
		index--;
		return rev;
	}//O(1)
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return arr[index];
	}//O(n)
	public void display() {
		for(int i=0;i<=index;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
