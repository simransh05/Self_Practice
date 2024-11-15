package Practice1;

public class LL {
	node head;
	int size;
	
	LL(){
		this.size=0;
	}
	class node {
		String data;
		node next;
		public node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}
		public void addFirst(String data) {
			node newNode = new node (data);
			if (head == null){
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode; 
		}
		// add at last
		public void addLast(String data) {
			node newNode = new node (data);
			if (head == null){
				head = newNode;
				return;
			}
			node currNode = head;
			while (currNode.next !=null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		// print 
		public void printList() {
			if (head == null) {
				System.out.println("The list is empty");
				return;
			}
			node currNode = head;
			while (currNode !=null) {
				System.out.print(currNode.data +" --->");
				currNode = currNode.next;
			}
			System.out.println("null");
			
		}
		public void removeFirst() {
		       if(head == null) {
		           System.out.println("Empty List, nothing to delete");
		           return;
		       }
		       size--;
		       head = this.head.next;
		       
		   }


		   public void removeLast() {
		       if(head == null) {
		           System.out.println("Empty List, nothing to delete");
		           return;
		       }
		       size--;
		       if(head.next == null) {
		           head = null;
		           return;
		       }


		       node currNode = head;
		       node lastNode = head.next;
		       while(lastNode.next != null) {
		           currNode = currNode.next;
		           lastNode = lastNode.next;
		       }


		       currNode.next = null;
		   }

	public int getSize() {
		return size;
	}
	// iterative way for reverse
	public void reverse() {
		if(head == null || head.next==null) {
			return;
		}
		node prevNode = head;
		node currNode = head.next;
		while (currNode != null) {
			node nextNode = currNode;
			currNode = prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
	// recursive way for reverse
	public node reverseRecursive(node head) {
		if (head == null || head.next == null) {
			return head;
		}
		node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		LL list = new LL();
		System.out.println(list.getSize());
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("link list");
		list.printList();
		list.addFirst("this");
		list.printList();
		System.out.println(list.getSize());
		list.removeFirst();
		list.printList();
		list.removeLast();
		list.printList();
		System.out.println(list.getSize());
		list.reverse();
		System.out.println(list);
		list.head =list.reverseRecursive(list.head);
		list.printList();
		
	}
}
