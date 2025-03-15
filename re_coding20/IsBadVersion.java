package re_coding20;

public class IsBadVersion {
	public static int isBad(int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (version(mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static boolean version(int mid) {
		if (mid >= 4) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(isBad(n));

	}

}
