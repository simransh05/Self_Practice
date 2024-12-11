package coding12;

public class LinkedList {
	public class node{
		int data;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	//O(1)
	public void addFirst(int val) { //  adding in start
		node nn =new node(); // 20-> 10
		nn.data=val;//create then value in node
		if(size==0) { // no node 
			head=nn; // 10 is created head,tail 
			tail=nn;
			size++;
		}else {
			nn.next=head; // address
			head=nn;
			size++;
		}
	}
	//O(1)
	public void addLast(int val) {
		node nn = new node();
		nn.data=val;
		if(size==0) { // same as addFirst
			head=nn;
			tail=nn;
			size++;
		}else {
			tail.next=nn; // address store in tail
			tail=nn; // then tail will be new node
			size++;
		}
	}
	private node getNode(int k) throws Exception { // find the index of the node
		if(k==0 || k>=size) {
			throw new Exception("Out of bound");
		}
		node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}return temp;
	}
	public void addInIndex(int val ,int index) throws Exception {
		if(index==0) {
			addFirst(val);
		}else if(index==size) {
			addLast(val);
		}else {
		    node nn = new node();
		    nn.data=val;
		    node k_1th =getNode(index-1);
		    nn.next=k_1th.next;
		    k_1th.next=nn;
		    size++;
		}
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		return tail.data;
	}
	public int getAtIndex(int k) throws Exception {
		node kth = getNode(k);
		return kth.data;
	}
	//O(1)
	public int removeFirst() {
		int rv = head.data;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}else {
		    node temp = head;
		    head=head.next;
		    temp.next=null;
		    size--;
		}return rv;
	}
	public int removeLast() throws Exception {
		if(size==1) {
			return removeFirst();
		}else {
			int rv =tail.data;
		    node second_last = getNode(size-2);
		    second_last.next=null;
		    tail=second_last;
		    size--;
		    return rv;
		}
	}
	public int removeAtIndex(int k) throws Exception {
		if(k==0) {
			return removeFirst();
		}else if(k==size-1) {
			return removeLast();
		}else {
			node k_1th = getNode(k-1);
			node kth = k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.data;
		}
	}
	public void display() {
		node temp =head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}System.out.println(".");
	}
	public int size() {
		return size;
	}

}
