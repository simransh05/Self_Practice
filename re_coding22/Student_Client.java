package re_coding22;

public class Student_Client {

	public static void main(String[] args) {
		System.out.println("Hello");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.age = 10;
		s.name = "karan";
		s.Intro_Yourself();
		Student s1 = new Student();
		s1.age = 12;
		s1.name = "kaju";
		s1.Intro_Yourself();
		s1.sayHi(s.name);
		Student.MentorName();

	}

	static {
		System.out.println("I am static block in main");
	}

}
