package re_coding23;

public class Sum_of_Number {
	// Method Overloading
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int sum(int... arr) {// triple dot sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(5, 8));
		System.out.println(sum(10, 9, 8));
		System.out.println(sum(4, 8, 9.5));
		System.out.println(sum(5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
	}

}
