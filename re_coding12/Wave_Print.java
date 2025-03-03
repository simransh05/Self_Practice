package re_coding12;

public class Wave_Print {
	public static void Vertical_Wave(int[][] arr) {
		for(int col =0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+"  ");
				}
			}else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+"  ");
				}
			}
		}
	}
	public static void Horizontal_Wave(int[][] arr) {
		for(int row =0;row<arr.length;row++) {
			if(row%2==0) {
				for(int col=0;col<arr[0].length;col++) {
					System.out.print(arr[row][col]+"  ");
				}
			}else {
				for(int col=arr[0].length-1;col>=0;col--) {
					System.out.print(arr[row][col]+"  ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][]arr = {{1,2,3,4,5}, // 4x5
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20}};
		Vertical_Wave(arr);
		System.out.println();
		Horizontal_Wave(arr);

	}

}
