package coding15;

public class Heap_Implement {

	public static void main(String[] args) {
		Heap h = new Heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(1);
		h.add(5);
		h.add(7);
		h.add(3);
		h.add(2);
		h.add(-4);
		h.display();
		System.out.println();
		System.out.println(h.remove());
		System.out.println();
		h.display();

	}

}
