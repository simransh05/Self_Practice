package coding9;

public class Queue_Implement {

	public static void main(String[] args) throws Exception{
		Queue q= new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.display();
		q.Enqueue(50);
		q.Enqueue(60);
		q.Enqueue(70);
		q.display();

	}

}
