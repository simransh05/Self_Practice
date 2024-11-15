package practice;
public class Student{
	String name ;
	int age;
	int rollNum;
	
	public Student(String name , int age , int rollNum) {
		this.name= name;
		this.age = age;
		this.rollNum = rollNum;
	}
	public String toString() {
		return "your name is " + name +". your age is "+ age +". your rollNum is "+rollNum;
	}
	
	public static void main (String [] args) {
	 Student stu = new Student("simran", 21, 31);
	 System.out.println(stu.toString());
	}
}