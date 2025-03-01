package re_coding10;

public class Word_Search {
	
	public static void main(String[] args) {
		char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean ans = search(board,i,j,word,0);
					if(ans==true) {
						System.out.println(ans);
						return ;
					}
				}
			}
		}System.out.println(false);

	}
	private static boolean search(char[][] board, int row, int col, String word,int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(row<0 || col<0 || col>=board[0].length ||row>=board.length || word.charAt(idx)!=board[row][col] ) {
			return false;
		}board[row][col]='*';
		int[] r = {-1,0,1,0};
		int[] c = {0,-1,0,1};
		for(int i=0;i<c.length;i++) {
			boolean ans = search(board,row+r[i],col+c[i],word,idx+1);
			if(ans==true) {
				return true;
			}
		}board[row][col]=word.charAt(idx);
		return false;
	}

}
