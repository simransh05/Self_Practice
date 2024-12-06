package coding9;

public class Stack_Implement {

	public static void main(String[] args) throws Exception{
		Stack s= new Stack();
		System.out.println(s.pop());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());
		s.display();
		System.out.println(s.pop());
		s.push(50);
		s.push(60);
		s.display();
		s.push(70);
		s.display();
	}

}
