package Practice2;

public class queueByLinkedList {
	static class node {
		int data;
		node next;
		public node (int data) {
			this.data = data;
			next = null;
		}
	}
	 static class queue{
		static node head = null;
		static node tail = null;
		
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		public static void add(int data) {
			node newNode = new node(data);
			if (tail == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		public static int remove() {
			if (isEmpty()) {
				return -1;
			}
			int front = head.data;
			if (head == tail) {
				tail = null;
			}
			head = head.next;
			return front;
		}
		public static int peek() {
			if (isEmpty()) {
				return -1;
			}return head.data;
		}
	}

	public static void main(String[] args) {
		queue q = new queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while(!q.isEmpty()) {
			System.out.print(q.remove()+"  ");
		}
	}

}
