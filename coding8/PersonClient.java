package coding8;

public class PersonClient {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		Person p1 =new Person("Simran",21);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
