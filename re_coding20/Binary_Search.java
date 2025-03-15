package re_coding20;

public class Binary_Search {
	public static int binary(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7, 9, 11, 13, 17, 18, 19, 20 };
		int target = 13;
		System.out.println(binary(arr, target));

	}

}
