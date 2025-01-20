package coding19;

import java.util.Arrays;

public class Coin_Change_II {
	public static int coin(int arr[] ,int amount, int idx) {
		if(amount==0) {
			return 1;
		}if(idx==arr.length) {
			return 0;
		}
		int inc =0;int exc =0;
		if(arr[idx]<=amount) {
			inc = coin(arr,amount-arr[idx],idx);
		}exc =coin(arr,amount,idx+1);
		return inc +exc;
	}
	
	public static int coinTD(int arr[] ,int amount, int idx,int[][] dp) {
		if(amount==0) {
			return 1;
		}if(idx==arr.length) {
			return 0;
		}if(dp[amount][idx]!=-1) {
			return dp[amount][idx];
		}
		int inc =0;int exc =0;
		if(arr[idx]<=amount) {
			inc = coinTD(arr,amount-arr[idx],idx,dp);
		}exc =coinTD(arr,amount,idx+1,dp);
		return dp[amount][idx] =inc +exc;
	}
	public static int coinBU(int[] coins,int amount) {
		int[][] dp = new int[amount+1][coins.length+1];
		for(int i=0;i<dp[0].length;i++) {
			dp[0][i]=1;
		}
		for(int am=1;am<dp.length;am++) { // amount 
			for(int i=1;i<dp[0].length;i++) { // coin
				int inc = 0;int  exc =0;
				if(coins[i-1]<=am) {
					inc = dp[am-coins[i-1]][i];
				}exc = dp[am][i-1];
				dp[am][i]=inc+exc;
			}
		}return dp[dp.length-1][dp[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 5;
		int[] arr = {1,2,5};
		System.out.println(coin(arr,amount,0));
		int[][] dp = new int[amount+1][arr.length];
		for(int i[] :dp) {
			Arrays.fill(i, -1);
		}System.out.println(coinTD(arr,amount,0,dp));
		System.out.println(coinBU(arr,amount));
	}

}
