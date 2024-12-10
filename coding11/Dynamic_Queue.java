package coding11;

public class Dynamic_Queue extends Queue {
	@Override
	public void Enqueue(int val) throws Exception {
		if(isFull()) {
			int [] ar = new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				int idx = (front+i)%arr.length;
				ar[i]=arr[idx];
			}arr=ar;
			front=0;
		}super.Enqueue(val);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Queue q = new Dynamic_Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println(q.dequeue());
		q.Enqueue(60);
		q.Enqueue(70);
		q.display();
		System.out.println(q.size());
	}

}
