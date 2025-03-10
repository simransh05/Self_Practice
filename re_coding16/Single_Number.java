package re_coding16;

public class Single_Number {
	public static int Number(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans = ans ^ nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		System.out.println(Number(arr));

	}

}
