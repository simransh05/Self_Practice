package coding19;

import java.util.Arrays;

public class Longest_Common_Subsequence {
	public static int longest(String s, String s1,int i, int j) {
		int ans =0;
		if(i==s.length()||j==s1.length()) {
			return 0;
		}
		if(s.charAt(i)==s1.charAt(j)){
			return 1+longest(s,s1,i+1,j+1);
		}else {
			int f = longest(s,s1,i+1,j);
			int S =longest(s,s1,i,j+1);
			ans=Math.max(f, S);
		}return ans;
	}
	public static int longestTD(String s, String s1,int i, int j,int[][] dp) {
		int ans=0;
		if(i==s.length()||j==s1.length()) {
			return 0;
		}if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if(s.charAt(i)==s1.charAt(j)){
			return 1+longestTD(s,s1,i+1,j+1,dp);
		}else {
			int f = longestTD(s,s1,i+1,j,dp);
			int S =longestTD(s,s1,i,j+1,dp);
			ans=Math.max(f, S);
		}return dp[i][j]=ans;
	}
	public static int longestBU(String s, String s1) {
		int[][] dp = new int[s.length()+1][s1.length()+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(s.charAt(i-1)==s1.charAt(j-1)) {
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
		String s = "abcde";
		String s1 = "ace";
		int[][] dp = new int[s.length()][s1.length()];
		for(int[] i:dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(longest(s,s1,0,0));
		System.out.println(longestTD(s,s1,0,0,dp));
		System.out.println(longestBU(s,s1));
	}

}
