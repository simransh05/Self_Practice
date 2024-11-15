package practice;

public class Car1 extends Vahicle {

	@Override
	void service() {
		super.service();
		System.out.println("this is override");
	}
	public static void main (String [] args) {
		Vahicle v = new Vahicle ();
		Car1 c = new Car1();
		v.service();
		c.service();// first the parent class because of super and then car will be printed
		
	}
	

}
