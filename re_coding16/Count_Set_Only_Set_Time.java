package re_coding16;

public class Count_Set_Only_Set_Time {
	public static int CountSet(int n) {// fastest way to check set bit
		int c = 0;
		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		return c;
	}

	public static void main(String[] args) {
		int n = 75;
		System.out.println(CountSet(n));

	}

}
