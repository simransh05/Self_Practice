package re_coding16;

public class Magic_Number {
	public static int N_th_Magic(int n) {
		int ans = 0;
		int multi = 5;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += multi;
			}
			multi *= 5;
			n = n >> 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(N_th_Magic(n));

	}

}
