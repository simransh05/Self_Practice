package re_coding19;

public class Cycle_Remove {
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

	public void display() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	private node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("out of range");
		}
		node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Create() throws Exception {
		node nn = getNode(2);
		tail.next = nn;
	}

	public void cycleRemove1() {
		node meet = hasCycle();
		if (meet == null) {
			return;
		}
		node start = head;
		while (start != null) {
			node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}
	public void cycleRemove2() {
		node meet = hasCycle();
		if (meet == null) {
			return;
		}
		int count = 1;
		node temp = meet;
		while(temp.next!=meet) {
			count++;
			temp = temp.next;
		}node fast = head;
		for(int i=0;i<count;i++) {
			fast= fast.next;
		}
		node slow = head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}fast.next=null;
		
	}
	public void floyedCycle() {
		node meet = hasCycle();
		if (meet == null) {
			return;
		}
		node fast = meet;
		node slow = head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}fast.next=null;
	}

	public node hasCycle() {
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_Remove cr = new Cycle_Remove();
		cr.AddLast(1);
		cr.AddLast(2);
		cr.AddLast(3);
		cr.AddLast(4);
		cr.AddLast(5);
		cr.AddLast(6);
		cr.AddLast(7);
		cr.AddLast(8);
		cr.Create();
//		cr.cycleRemove2();
		cr.floyedCycle();
		cr.display();
	}

}
