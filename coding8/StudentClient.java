package coding8;

public class StudentClient {

	public static void main(String[] args) {
		Student s = new Student();
		s.Intro();//Your name is null And your age is:0
		System.out.println(s.name); // for excess
		s.age = 21;
		s.name="Harry";
		s.Intro();//Your name is Harry your age is:21
		
		Student s1 = new Student(); // can create n objects with same class
		s1.name="komal";
		s1.age = 31;
		s1.Intro();
		s1.SayHi("karan");
		Student.Mentor(); // Common for all that why static 
//		s1.Mentor();
	}
	static {
		System.out.println("static block in main method");
	}

}