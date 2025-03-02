package re_coding11;

public class N_Queen {
	public static void queen(boolean [][] board,int tq , int row) {
		if(tq==0) {
			display(board);
			System.out.println();
			return ;
		}
		for(int col = 0;col<board[0].length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				queen(board,tq-1,row+1);
				board[row][col]=false;
			}
		}
	}

	private static boolean isSafe(boolean[][] board, int row, int col) {
		int r = row ;
		while(r>=0) {// up
			if(board[r][col]) {
				return false;
			}r--;
		}
		r=row;
		int c =col;
		while(r>=0 && c>=0) { // left diagonal
			if(board[r][c]) {
				return false;
			}r--;c--;
		}
		r=row;
		c =col;
		while(r>=0 && c<board[0].length) { // right diagonal
			if(board[r][c]) {
				return false;
			}r--;c++;
		}
		return true;
	}

	private static void display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+"  ");
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int n=4;
		boolean [][] board = new boolean[n][n];
		queen(board,n,0);

	}

}
