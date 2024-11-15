package Nested;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	public class check{
		public static void main (String [] args) {
			Person person = new Person("simran", 31);
			Person person1 = new Person("Simran", 21);
			System.out.println(person.equals(person1));
			
		}
	}

}
