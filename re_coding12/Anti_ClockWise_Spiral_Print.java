package re_coding12;

public class Anti_ClockWise_Spiral_Print {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		spiralPrint(arr);

	}

	private static void spiralPrint(int[][] arr) {
		int minR = 0; int minC = 0;int maxR = arr.length-1; int maxC = arr[0].length-1;
		int te = arr.length*arr[0].length; int count=0;
		while(count<te) {
			for(int i=maxC;i>=minC && count<te;i--) {
				System.out.print(arr[minR][i]+"  ");
				count++;
			}minR++;
			for(int i=minR;i<=maxR && count<te;i++) {
				System.out.print(arr[i][minC]+"  ");
				count++;
			}minC++;
			for(int i=minC;i<=maxC && count<te;i++) {
				System.out.print(arr[maxR][i]+"  ");
				count++;
			}maxR--;
			for(int i=maxR;i>=minR && count<te;i--) {
				System.out.print(arr[i][maxC]+"  ");
				count++;
			}maxC--;
		}
		
	}

}
