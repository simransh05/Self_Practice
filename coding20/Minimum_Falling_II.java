package coding20;

import java.util.Arrays;

public class Minimum_Falling_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] dp = new int[arr.length][arr[0].length];
		for(int i[] :dp) {
			Arrays.fill(i,-100000);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr[0].length;i++) {
			ans  = Math.min(ans, fallingTD(arr,0,i,dp));
		}System.out.println(ans);

	}

	private static int fallingTD(int[][] arr, int r, int c, int[][] dp) {
		// TODO Auto-generated method stub
		if(r==arr.length-1) {
			return arr[r][c];
		}if(arr[r][c]!=-100000) {
			return arr[r][c];
		}
		int ans  = Integer.MAX_VALUE;
		for(int i=0;i<arr[0].length;i++) {
			if(c!=i) {
				ans  = Math.min(ans,fallingTD(arr,r+1,i,dp));
			}
		}return dp[r][c] = ans +arr[r][c];
	}

}
