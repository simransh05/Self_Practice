package re_coding16;

public class Count_Set_Bit {
	public static int countSet(int n) {// constant time
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 75;
		System.out.println(countSet(n));

	}

}
