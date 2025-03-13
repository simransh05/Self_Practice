package re_coding17;

public class LinkedList_Implement {

	public static void main(String[] args) throws Exception {
		Linked_List ll = new Linked_List();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddLast(50);
		ll.AddFirst(12);
		ll.AddAtIndex(15, 4);
		ll.AddAtIndex(-10, 2);
		ll.display();
		System.out.println(ll.RemoveFirst());
		System.out.println(ll.RemoveLast());
		System.out.println(ll.RemoveAtIndex(2));
		ll.display();
	}
}
