package coding20;

import java.util.Arrays;

public class Minimum_Path_Sum {
	public static int sum(int[][] arr,int r , int c) {
		if(r==arr.length-1 && c ==arr[0].length-1) {
			return arr[r][c];
		}
		if(r>=arr.length || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int right = sum(arr,r,c+1);
		int down = sum(arr,r+1,c);
		return Math.min(right, down)+arr[r][c];
	}
	public static int sumTD(int[][] arr,int r , int c, int[][] dp) {
		if(r==arr.length-1 && c ==arr[0].length-1) {
			return arr[r][c];
		}
		if(r>=arr.length || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}if(dp[r][c]!=-1) {
			return dp[r][c];
		}
		int right = sumTD(arr,r,c+1,dp);
		int down = sumTD(arr,r+1,c,dp);
		return dp[r][c]=Math.min(right, down)+arr[r][c];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(sum(arr,0,0));
		int[][] dp = new int[arr.length][arr[0].length];
		for(int i[] :dp) {
			Arrays.fill(i, -1);
		}System.out.println(sumTD(arr,0,0,dp));
	}

}
