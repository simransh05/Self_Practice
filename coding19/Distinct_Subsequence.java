package coding19;

import java.util.Arrays;

public class Distinct_Subsequence {
	public static int generateTD(String s, String s1,int i,int j, int[][] dp) {
		if(j==s1.length()) {
			return 1;
		}if(i==s.length()) {
			return 0;
		}if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int inc = 0;int exc =0;
		if(s.charAt(i)==s1.charAt(j)) {
			inc = generateTD(s,s1,i+1,j+1,dp);
		}exc = generateTD(s,s1,i+1,j,dp);
		return dp[i][j]=inc+exc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String s1 ="rabbit";
		int[][] dp = new int[s.length()][s1.length()];
		for(int []i :dp) {
			Arrays.fill(i,-1);
		}
		System.out.println(generateTD(s,s1,0,0,dp));

	}

}
