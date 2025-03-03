package re_coding12;

public class Search_In_2D_Matrix {
	public static boolean search(int[][] arr , int target) { // from arr[0][n]
		int r =0;int c = arr[0].length-1;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==target) {
				return true;
			} else if(arr[r][c]>target) {
				c--;
			}else {
				r++;
			}
		}return false;
	}
	public static boolean searchI(int[][] arr , int target) { // from arr[n][0]
		int r =arr.length-1;int c = 0;
		while(r>=0 && c<arr[0].length) {
			if(arr[r][c]==target) {
				return true;
			} else if(arr[r][c]>target) {
				r--;
			}else {
				c++;
			}
		}return false;
	}

	public static void main(String[] args) {
		int[][] arr =  { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 30;
		System.out.println(search(arr,target));
		System.out.println(searchI(arr,target));

	}

}
