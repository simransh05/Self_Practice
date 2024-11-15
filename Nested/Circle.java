package Nested;

public class Circle extends Shape {
	private double radius;

	public  Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	} 
	

}
