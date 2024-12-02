package coding6;

public class recursion_backtracking4 {
	public static void NQueen(boolean[][] board , int tq,int row) {
		if(tq==0) {
			display(board);
			System.out.println();
			return;
		}
		for(int col =0;col<board[0].length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				NQueen(board,tq-1,row+1);
				board[row][col]=false;
			}
		};
	}
	public static boolean isSafe(boolean[][] board , int row ,int col) {
		// up
		for(int r=row;r>=0;r--) {
			if(board[r][col]==true) {
				return false;
			}
		}
		// left diagonal
		for(int r=row , c=col;r>=0 && c>=0;r--,c--) {
			if(board[r][c]==true) {
				return false;
			}
		}// right diagonal
		for(int r=row ,c=col ;r>=0&&c<board[0].length;r--,c++) {
			if(board[r][c]==true) {
				return false;
			}
		}
		return true;
	}
	public static void display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		int n =4;
		boolean[][] board = new boolean[n][n];
		NQueen(board,n,0);
	}

}
