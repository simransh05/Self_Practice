package re_coding12;

public class Two_D_Array {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr);
		int[][] other = arr;
		System.out.println(other); // same address
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1][3]);
		// display
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}System.out.println();
		}

	}

}
