package re_coding17;

public class Linked_List {
	class node {
		int data;
		node next;
	}

	private node head;
	private node tail;
	private int size;

	public void AddFirst(int val) {
		node nn = new node();
		nn.data = val;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void AddLast(int val) {
		node nn = new node();
		nn.data = val;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void AddAtIndex(int val, int k) {
		node nn = new node();
		nn.data=val;
		if(size==0) {
			
		}
	}

	public void display() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}

}
