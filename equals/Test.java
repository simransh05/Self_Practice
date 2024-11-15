package equals ;
public class Test {
	public static void main (String [] args) {
		Person newPerson = new Person("Simran ", 21,"21@23");
		Person newPerson2 = new Person("Simran ", 21,"21@23");
//		if (newPerson == newPerson2) {
//			System.out.println("equal");
//			}else {
//				System.out.println("not equal");
//			}
		System.out.println(newPerson.equals(newPerson2));
	}

	
}