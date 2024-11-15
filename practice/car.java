package practice;

public class car{
	int fuelInLeter ;
	String color;
	int addFuel;
	int maxSpeed;
	int currentFuel;
	float price;
	
	car(float price){
		color = "black";
		this.price = price;
		maxSpeed = 150;
	}
	
	public void drive() {
		if (currentFuel == 0) {
			System.out.println("you don't have fuel");
		}else if(currentFuel<5) {
			System.out.println("you need to refuel");
			currentFuel--;
		}else {
			System.out.println("you can drive");
			currentFuel--;
		}
	}
	public void addFuel(float fuel) {
		currentFuel+=fuel;
	}
	public float currentFuel(float currentFuel) {
		return currentFuel;
	}
}