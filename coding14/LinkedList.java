package coding14;

public class LinkedList<T> { // generic 
	public class node{
		T data;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	//O(1)
	public void addFirst(T val) { 
		node nn =new node(); 
		nn.data=val;
		if(size==0) { 
			head=nn; 
			tail=nn;
			size++;
		}else {
			nn.next=head; 
			head=nn;
			size++;
		}
	}
	//O(1)
	public void addLast(T val) {
		node nn = new node();
		nn.data=val;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}else {
			tail.next=nn; 
			tail=nn; 
			size++;
		}
	}
	private node getNode(int k) throws Exception {
		if(k==0 || k>=size) {
			throw new Exception("Out of bound");
		}
		node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}return temp;
	}
	public void addInIndex(T val ,int index) throws Exception {
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
	public T getFirst() {
		return head.data;
	}
	public T getLast() {
		return tail.data;
	}
	public T getAtIndex(int k) throws Exception {
		node kth = getNode(k);
		return kth.data;
	}
	//O(1)
	public T removeFirst() {
		T rv = head.data;
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
	public T removeLast() throws Exception {
		if(size==1) {
			return removeFirst();
		}else {
			T rv =tail.data;
		    node second_last = getNode(size-2);
		    second_last.next=null;
		    tail=second_last;
		    size--;
		    return rv;
		}
	}
	public T removeAtIndex(int k) throws Exception {
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
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("kaju");
		ll.addLast("ankita");
		ll.addLast("riya");
		ll.addLast("manya");
		ll.addLast("kiran");
		ll.display();
	}

}
