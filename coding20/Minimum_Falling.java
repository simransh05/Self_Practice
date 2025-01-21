package coding20;

import java.util.Arrays;

public class Minimum_Falling {
	public static int falling(int [][] arr, int r ,int c) {
		if(c<0 || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}if(r==arr.length-1) {
			return arr[r][c];
		}
		int dl = falling(arr,r+1,c-1);
		int down = falling(arr,r+1,c);
		int dr = falling(arr,r+1,c+1);
		return Math.min(down, Math.min(dl, dr)) +arr[r][c];
	}
	public static int fallingTD(int [][] arr, int r ,int c,int[][] dp) {
		if(c<0 || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}if(r==arr.length-1) {
			return arr[r][c];
		}if(dp[r][c]!=-100000) {
			return dp[r][c];
		}
		int dl = fallingTD(arr,r+1,c-1,dp);
		int down = fallingTD(arr,r+1,c,dp);
		int dr = fallingTD(arr,r+1,c+1,dp);
		return dp[r][c] =Math.min(down, Math.min(dl, dr)) +arr[r][c];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
		int [][] dp = new int[arr.length][arr[0].length];
		for(int i[] :dp) {
			Arrays.fill(i,-100000);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr[0].length;i++) {
			ans  = Math.min(ans, fallingTD(arr,0,i,dp));
		}System.out.println(ans);
	}

}
