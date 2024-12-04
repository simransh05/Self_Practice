package coding8;

public class Person {
	private String name ="kajal";
	private int age =17;
	public Person() { // default
		
	}
	public Person(String name, int age) { // Constructor
		this.name= name;
		this.age = age;
	}
	
	// Encapsulation // 
	// setter
	public void setAge(int age) { // for setting the value for private
		this.age = age;
	}
	// getter
	public int getAge() { // for getting the value 
		return age;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}

}
