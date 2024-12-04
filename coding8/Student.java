package coding8;

public class Student{
	String name; // data member
	int age;
	public void Intro() {
		System.out.println("Your name is "+name+" And your age is:"+age);
	}
	public void SayHi(String name) {
		System.out.println(this.name+" SayHi to "+name);
	}
	public static void Mentor() {
		System.out.println("Monu Bhaiya");
	}
	static {
		System.out.println("Static block");
	}
	
}
