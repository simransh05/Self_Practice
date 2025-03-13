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

	public void AddAtIndex(int val, int k) throws Exception {
		if (k == 0) {
			AddFirst(val);
		} else if (k == size) {
			AddLast(val);
		} else {
			node nn = new node();
			nn.data = val;
			node k_1th = getNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}

	public int GetFirst() {
		return head.data;
	}

	public int GetLast() {
		return tail.data;
	}

	public int GetAtIndex(int k) throws Exception {
		return getNode(k).data;
	}

	public int RemoveFirst() {
		int rv = head.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
		return rv;
	}

	public int RemoveLast() throws Exception {
		int rv = tail.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			node secLast = getNode(size - 2);
			secLast.next = null;
			tail = secLast;
		}
		size--;
		return rv;
	}

	public int RemoveAtIndex(int k) throws Exception {
		int rv = 0;
		if (k == 0) {
			return RemoveFirst();
		} else if (k == size - 1) {
			return RemoveLast();
		} else {
			node kth = getNode(k);
			node k_1th = getNode(k - 1);
			rv = kth.data;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
		}
		return rv;
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

	public int size() {
		return size;
	}

}
