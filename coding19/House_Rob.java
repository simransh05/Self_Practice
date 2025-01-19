package coding19;

import java.util.Arrays;

public class House_Rob {
	public static int rob(int[] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}int rob = arr[i]+rob(arr,i+2);
		int not_rob = rob(arr,i+1);
		return Math.max(rob, not_rob);
	}
	public static int robTD(int[] arr, int i, int [] dp) {
		if(i>=arr.length) { // array left to right
			return 0;
		}if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i]+robTD(arr,i+2,dp);
		int not_rob = robTD(arr,i+1,dp);
		return dp[i]=Math.max(rob, not_rob);
	}
	public static int robTD2(int[] arr, int i, int [] dp) {
		if(i<0) { // array right to left
			return 0;
		}if(dp[i]!=-1) {
			return dp[i];
		}
		int rob = arr[i]+robTD2(arr,i-2,dp);
		int not_rob = robTD2(arr,i-1,dp);
		return dp[i]=Math.max(rob, not_rob);
	}
	public static int bottom(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int[]dp = new int[arr.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0], arr[1]);
		for(int i=2;i<dp.length;i++) {
			dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
		}return dp[dp.length-1];
	}
	public static void main(String[] args) {
		int [] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(rob(arr,0));
//		System.out.println(robTD(arr,0,dp));
		System.out.println(robTD2(arr,arr.length-1,dp));
		System.out.println(bottom(arr));
	}

}
