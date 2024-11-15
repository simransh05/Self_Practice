package Practice2;
public class stackByLinkedList {
	static class node {
		int data;
		node next;
		public node (int data) {
			this.data= data;
			next = null;
		}
	}
	static class stackClass{
		public static node head;
		
		static boolean isEmpty() {
			return head == null;
		}
		public static void push (int data) {
			node newNode = new node(data);
			if (isEmpty()) {
				head= newNode;
				return;
			}
			newNode.next= head;
			head = newNode;
		}
		static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		public int peek() {
			if (isEmpty()) {
				return -1;
			}return head.data;
		}
	}

	public static void main(String[] args) {
		stackClass s = new stackClass();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}System.out.println();
		s.push(5);
		s.push(8);
		System.out.println(s.peek());
		
	}

}
