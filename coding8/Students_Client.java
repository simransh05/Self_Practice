package coding8;

public class Students_Client {

	public static void main(String[] args) throws Exception {
		Students s = new Students("Raj",18);
		System.out.println(s.getAge());
		s.setAge(10);
		System.out.println(s.getAge());
		s.setAge(-10);
		System.out.println(s.getAge());
	}

}