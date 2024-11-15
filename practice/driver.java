package practice;
public class driver{
	public static void main(String[] args) {
		car myCar = new car(50000);
//		myCar.drive();
//		myCar.addFuel(10);
//		myCar.drive();
//		myCar.drive();
		System.out.println(myCar.price);
		System.out.println(myCar.maxSpeed+ 10);
		System.out.println(myCar.currentFuel);
	}
}