package re_coding10;

import java.util.Scanner;

public class Rat_Chases_Cheese {
	static boolean val = false;
	public static void path(char[][] arr, int row , int col,int[][] ans) {
		if(row==arr.length-1 && col==arr[0].length-1) {
			ans[row][col]=1;
			val=true;
			display(ans);
			return ;
		}if(row<0 || col<0 || col>=arr[0].length ||row>=arr.length || arr[row][col]=='X') {
			return ;
		}
		arr[row][col]='X';
		ans[row][col]=1;
		path(arr,row-1,col,ans);// up
		path(arr,row,col-1,ans); //left
		path(arr,row+1,col,ans); // down
		path(arr,row,col+1,ans); // right
		arr[row][col]='O';
		ans[row][col]=0;
	}
	

	private static void display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+"  ");
			}System.out.println();
		}
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char [][] arr = new char[m][n];
		for(int i=0;i<m;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				arr[i][j]=s.charAt(j);
			}
		}int [][] ans = new int [m][n];
		path(arr,0,0,ans);
		if(val==false) {
			System.out.println("NO PATH FOUND");
		}
	}

}
