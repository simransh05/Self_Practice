package re_coding24;

public class Genrics_Demo {

	public static void main(String[] args) {
		String[] arr = { "ankit", "ankita", "vishal", "karan" };
		display(arr);
		Integer[] arr1 = { 1, 3, 2, 2, 4, 5, 3, 2, 2, 2, 1, 2 };
		display(arr1);
	}

	private static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

	}

}
