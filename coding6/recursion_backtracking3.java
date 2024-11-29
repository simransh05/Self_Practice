package coding6;
import java.util.*;
public class recursion_backtracking3 {
	
	static boolean validPath =false;
	public static void ratChasesCheese(char[][]arr,int cr ,int cc,int [][] ans) {
		if(cc<0||cr<0||cc>=arr[0].length ||cr >=arr.length||arr[cr][cc]=='X') {
			return;
		}
		if(cr==arr.length-1 && cc==arr[0].length-1) {
			ans[cr][cc]=1;
			validPath=true;
			display(ans);
		}
		arr[cr][cc]='X'; // cr =current row & cc = current column
		ans[cr][cc]=1;
		// in loop 
		int[] row = {-1,1,0,0};
		int[] col = {0,0,-1,1};
		for(int i=0;i<row.length;i++) {
			ratChasesCheese(arr,row[i],col[i],ans);
		}
//		ratChasesCheese(arr,cr-1,cc,ans);//up
//		ratChasesCheese(arr,cr+1,cc,ans); // down
//		ratChasesCheese(arr,cr,cc-1,ans); // left
//		ratChasesCheese(arr,cr,cc+1,ans); //right
		arr[cr][cc]='O';
		ans[cr][cc]=0;
		
	}
	public static void display(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}System.out.println();
		}
	}
	public static boolean wordSearch(char[][] board, int cr ,int cc ,String word ,int index) {
		if(index==word.length()) {
			return true;
		}
		if(cc<0||cr<0||cc>=board[0].length ||cr >=board.length|| word.charAt(index)!=board[cr][cc]) {
			return false;
		}
		board[cr][cc]='*';
		int[] row = {-1,0,1,0};
		int[] col = {0,-1,0,1};
		for(int i=0;i<row.length;i++) {
			boolean ans =wordSearch(board,cr+row[i],cc+col[i],word,index+1);
			if(ans==true) {
				return true;
			}
		}board[cr][cc]=word.charAt(index);
		return false;
	}

	public static void main(String[] args) {
		char [][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "SEE"	;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean ans = wordSearch(board,i,j,word,0);
					if(ans == true) {
						System.out.println(ans);
						return;
					}
				}
			}
		}System.out.println(false);
//		5 4
//		OXOO
//		OOOX
//		XOXO
//		XOOX
//		XXOO
		// input
//		Scanner sc =new Scanner(System.in);
//		int m= sc.nextInt();
//		int n = sc.nextInt();
//		char[][]arr= new char[m][n];
//		for(int i=0;i<m;i++) {
//			String s = sc.next();
//			for(int j=0;j<s.length();j++) {
//				arr[i][j]=s.charAt(j);
//			}
//		}int[][] ans= new int[m][n];
//		ratChasesCheese(arr,0,0,ans);
//		if(validPath==false) {
//			System.out.println("NO PATH EXIST");
//		}
	}
}
