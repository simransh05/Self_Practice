package coding20;

public class Wine_Problem {
	public static int profit(int[] arr,int i,int j, int year) {
		if(i > j) {
			return 0;
		}int i_th =arr[i]*year+ profit(arr,i+1,j,year+1);
		int j_th= arr[j]*year+profit(arr,i,j-1,year+1);
		return Math.max(i_th, j_th);
	}
	public static int profitTD(int[] arr,int i,int j, int year,int[][] dp) {
		if(i > j) {
			return 0;
		}if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int i_th =arr[i]*year+ profitTD(arr,i+1,j,year+1,dp);
		int j_th= arr[j]*year+profitTD(arr,i,j-1,year+1,dp);
		return dp[i][j] = Math.max(i_th, j_th);
	}
	public static int profitBU(int[] arr) {
		int [][] dp = new int[arr.length][arr.length];
		for(int i=0;i<dp.length;i++) {
			dp[i][i]=arr[i]*arr.length; // year 5
		}
		int year = arr.length-1;
		for(int d= 1;d<arr.length;d++) {
			for(int j=d;j<dp.length;j++) {
				int i= j-d;
				int left = arr[i]*year +dp[i+1][j];
				int right = arr[j]*year +dp[i][j-1];
				dp[i][j]=Math.max(left, right);
			}year--;
		}return dp[0][dp[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = {2,3,5,1,4};
		System.out.println(profit(wine,0,wine.length-1,1));
		int [][] dp = new int [wine.length][wine.length];
		System.out.println(profitTD(wine,0,wine.length-1,1,dp));
		System.out.println(profitBU(wine));
	}

}
