package coding9;

public class Queue {
	private int [] arr;
	private int front =0;
	private int size =0;
	public Queue() {
		arr=new int[5];
	}
	public Queue(int n) {
		arr=new int[n];
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size == arr.length;
	}
	public void Enqueue(int val)throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		int idx = (front+size)%arr.length; // modulas for circular
		arr[idx]=val;
		size++;
	}
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
	    int val = arr[front];
	    front=(front+1)%arr.length; // for circular array 
	    size--;
	    return val;
	}
	public int getFront() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return  arr[front];
	}
	public int size() {
		return size; 
	}
	public void display() {
		for(int i=0;i<size;i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}System.out.println();
	}
}
