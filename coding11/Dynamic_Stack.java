package coding11;

public class Dynamic_Stack extends Stack{
	@Override
	public void push(int val) throws Exception { // method override for constructor
		if(isFull()) {
			int [] ar = new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				ar[i]=arr[i];
			}arr =ar;
		}
		super.push(val); //super for calling child class method
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Stack d =new Dynamic_Stack();
		d.push(10);
		d.push(20);
		d.push(30);
		d.push(40);
		d.push(50);
		d.push(60);
		d.display();
		System.out.println(d.size());
	}

}
