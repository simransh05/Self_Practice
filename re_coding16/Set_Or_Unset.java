package re_coding16;

public class Set_Or_Unset {
	public static void check(int n, int k) {
		int v = 1 << k;
		if ((n & v) == v) {
			System.out.println("set");
		} else {
			System.out.println("unset");
		}
	}

	public static void main(String[] args) {
		int n = 75;
		int k = 3;
		check(n,k);
	}

}
