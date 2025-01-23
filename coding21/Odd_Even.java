package coding21;

public class Odd_Even {
	public static void odd_even(int n) {
		if((n&1)==1) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =8;
		odd_even(n);
	}

}
