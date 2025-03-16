package re_coding21;

public class Book_Allocation_Problem {
	public static int minimumBook(int[] pages, int student) {
		int low = 0;
		int high = 0;
		int ans = 0;
		for (int i = 0; i < pages.length; i++) {
			high += pages[i];
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (possible(pages, student, mid)) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	private static boolean possible(int[] pages, int student, int mid) {
		int read = 0;
		int s = 1;
		for (int i = 0; i < pages.length;) {
			if (read + pages[i] <= mid) {
				read += pages[i];
				i++;
			} else {
				s++;
				read = 0;
			}
			if (s > student) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] pages = { 12, 34, 67, 90 };
		int student = 2;
		System.out.println(minimumBook(pages,student));
	}

}
