package coding12;

public final class Implement_LinkedList {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.display();
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
		ll.addInIndex(12, 2);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getAtIndex(2));
		System.out.println(ll.getLast());
		ll.display();
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll.removeAtIndex(2));
		ll.display();
		System.out.println(ll.size());
	}

}
