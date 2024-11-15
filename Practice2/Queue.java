package Practice2;

public class Queue {

	static class queue{
		static int[] arr;
		 static int size ;
		static int rear = -1;
		
		queue(int size){
			this.size = size;
			arr = new int[size];
		}
		public static boolean isEmpty() {
			return rear ==-1 ;
		}
		
		// enque
		public static void add(int data) {
			if (rear == size-1) {
				System.out.println("full queue");
				return;
			}
//			rear++;
			arr[++rear]= data;
		}
		// dequeue
		public static int remove() {
			if (isEmpty()) {
				System.out.print("empty queue");
				return -1;
			}
			int front = arr[0];
			for (int i =0;i<rear;i++) {
				arr[i]= arr[i+1];
			}
			rear--;
			return front;
		}
		public static int peek() {
			if (isEmpty()) {
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
		queue q = new queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		while (!q.isEmpty()) {
			System.out.println(q.remove());
//			q.remove();
		}
		
	}

}
