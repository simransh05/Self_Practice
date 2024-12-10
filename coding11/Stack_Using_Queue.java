package coding11;

public class Stack_Using_Queue {
	private Dynamic_Queue q;

	public Stack_Using_Queue() {
		q= new Dynamic_Queue();
	}
	public int size() {
		return q.size();
	}
	public boolean isempty() {
		return q.isEmpty();
	}
	public void push(int item) throws Exception {
		q.Enqueue(item);
	}
	public int pop() throws Exception {
		Dynamic_Queue help = new Dynamic_Queue();
		while(q.size()>1) {
			help.Enqueue(q.dequeue());
		}int rv = q.dequeue();
		while(!help.isEmpty()) {
			q.Enqueue(help.dequeue());
		}
		return rv;
	}
	public int peek() throws Exception {
		Dynamic_Queue help = new Dynamic_Queue();
		while(q.size()>1) {
			help.Enqueue(q.dequeue());
		}int rv = q.dequeue();
		help.Enqueue(rv);
		while(!help.isEmpty()) {
			q.Enqueue(help.dequeue());
		}
		return rv;
	}
	public static void main(String[] args) throws Exception {
		Stack_Using_Queue sq = new Stack_Using_Queue();
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		sq.push(50);
		System.out.println(sq.pop());
		System.out.println(sq.peek());
		
		
	}

}
