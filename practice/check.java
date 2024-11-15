package practice;
public class check {
	public static void main (String [] args) {
		Employee detail = new Employee("Simran" , 21 , 20000);
		System.out.println(detail.getEmployeeDetails());
		detail.setName("simmi");
		System.out.println(detail.getEmployeeDetails());
		}
}