package practice;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.add(20, 30));
		System.out.println(calculator.add(30, 30, 40));

	}

}
