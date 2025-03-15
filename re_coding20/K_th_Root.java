package re_coding20;

public class K_th_Root {
	public static int Root(int k, int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 143;
		int k = 3;
		System.out.println(Root(k, n));

	}

}
