package coding19;

public class Uncrossed_Lines {
	public static int uncrossed(int[] arr,int arr1[]) {
		int[][] dp = new int[arr.length+1][arr1.length+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(arr[i-1]==arr1[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					int f = dp[i-1][j];
					int S = dp[i][j-1];
					dp[i][j]=Math.max(f, S);
				}
			}
		}return dp[dp.length-1][dp[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4};
		int[] arr1 = {1,4,2};
		System.out.println(uncrossed(arr,arr1));

	}

}
