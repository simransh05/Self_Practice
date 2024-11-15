package Nested;

public class Square extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}


	public Square(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return radius*radius;
	}

}
