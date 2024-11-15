package practice;
public class Course{
	static int maxCapacity;
	int enrollStudent;
	String courseName;
	String StudentName;
	String [] enrolled = new String[maxCapacity];
	static int setMaxCapacity(int capacity) {
		return maxCapacity;
	}
	{
		maxCapacity = 100;
	}
	Course(String StudentName) {
		courseName = "java";
	}
	void enrollStudent(String StudentName) {
		 enrolled[enrollStudent] = StudentName;
		 enrollStudent++;
	}
	void unenrolled(String StudentName) {
		System.out.println("the member is delete");
		 enrollStudent++;
	}
}