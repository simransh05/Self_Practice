package coding12;

import coding12.LinkedList.node;

public class Cycle_Removal {
	public class node{
		int data;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	//O(1)
	public void addFirst(int val) { 
		node nn =new node();
		nn.data=val;//create then value in node
		if(size==0) { // no node 
			head=nn; // 10 is created head,tail 
			tail=nn;
			size++;
		}else {
			nn.next=head; 
			head=nn;
			size++;
		}
	}
	//O(1)
	public void addLast(int val) {
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
	public void display() {
		node temp =head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}System.out.println(".");
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
	public void cycle() throws Exception {
		node nn = getNode(2);
		tail.next=nn;
	}
	public void removeCycle1() { // O(n^2)
		node meetingPoint = hasCycle();
		if(meetingPoint==null) {
			return;
		}node start = head;
		while(start!=null) {
			node temp = meetingPoint;
			while(temp.next!=meetingPoint) {
				if(temp.next==start) {
					temp.next=null;
					return;
				}temp= temp.next;
			}start=start.next;
		}
	}
	public void removeCycle2() { // O(n)
		node meetingPoint = hasCycle();
		if(meetingPoint==null) {
			return;
		}int count = 1;
		node temp = meetingPoint;
		while (temp.next != meetingPoint) {
			count++;
			temp = temp.next;
		}
		node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;

		}
		node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	public void floyedCycleRemoval() {//O(n)
		node meetingPoint = hasCycle();
		if(meetingPoint==null) {
			return;
		}node fast =meetingPoint;
		node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	public node hasCycle() {
        node slow = head;
        node fast= head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return slow;
            }
        }return null;
    }

	public static void main(String[] args) throws Exception {
		Cycle_Removal cr = new Cycle_Removal();
		cr.addFirst(6);
		cr.addFirst(5);
		cr.addFirst(4);
		cr.addFirst(3);
		cr.addFirst(2);
		cr.addFirst(1);
		cr.cycle();
//		cr.removeCycle1();
		cr.removeCycle2();
		cr.display();

	}

}
