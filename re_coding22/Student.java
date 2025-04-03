package re_coding22;

public class Student {
	String name;
	int age;

	public void Intro_Yourself() {
		System.out.println("My Name is " + name + " And my age is " + age);
	}

	public void sayHi(String name) {
		System.out.println(this.name + " sayHi " + name);
	}

	public static void MentorName() {
		System.out.println("Monu Bhaiya");
	}

	static {
		System.out.println("I am static block");
	}
}
