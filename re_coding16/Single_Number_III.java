package re_coding16;

import java.util.Arrays;

public class Single_Number_III {
	public static int[] Single_Number(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		return new int[] { a, b };
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(Single_Number(arr)));
		int[] ans = Single_Number(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + "  ");
		}

	}

}
