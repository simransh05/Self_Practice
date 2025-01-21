package coding20;

import java.util.Arrays;

public class Edit_Dis {
	public static int minDis(String s, String s1,int i,int j) {
		if(i==s.length()) {
			return s1.length()-j;
		}
		if(j==s1.length()) {
			return s.length()-i;
		}int ans =0;
		if(s.charAt(i)==s1.charAt(j)) {
			ans = minDis(s,s1,i+1,j+1);
		}else {
			int d = minDis(s,s1,i+1,j);
			int I = minDis(s,s1,i,j+1);
			int r = minDis(s,s1,i+1,j+1);
			ans = 1+ Math.min(d, Math.min(I, r));
		}return ans;
	}
	public static int minDisTD(String s, String s1,int i,int j, int[][] dp) {
		if(i==s.length()) {
			return s1.length()-j;
		}
		if(j==s1.length()) {
			return s.length()-i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if(s.charAt(i)==s1.charAt(j)) {
			dp[i][j] = minDisTD(s,s1,i+1,j+1,dp);
		}else {
			int d = minDisTD(s,s1,i+1,j,dp);
			int I = minDisTD(s,s1,i,j+1,dp);
			int r = minDisTD(s,s1,i+1,j+1,dp);
			dp[i][j] = 1+ Math.min(d, Math.min(I, r));
		}return dp[i][j] ;
	}
	public static void main(String[] args) {
		String s ="FOOD";
		String s1="MONEY";
		System.out.println(minDis(s,s1,0,0));
		int[][] dp = new int[s.length()+1][s1.length()+1];
		for(int i[] : dp) {
			Arrays.fill(i, -1);
		}System.out.println(minDisTD(s,s1,0,0,dp));
	}

}
