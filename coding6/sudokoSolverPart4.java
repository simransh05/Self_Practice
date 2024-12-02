package coding6;

public class sudokoSolverPart4 {
	public static void Sudoko(int[][] board , int row,int col) {
		if(col==9) {
			col=0;
			row++;
		}
		if(row==9) {
			display(board);
			System.out.println();
			return;
		}
		if(board[row][col]!=0) {
			Sudoko(board,row,col+1);
		}else {
			for(int val=1;val<=9;val++) {
				if(isSafe(board,row,col,val)) {
					board[row][col]=val;
					Sudoko(board,row,col+1);
					board[row][col]=0;
				}
			}
		}
	}
	public static boolean isSafe(int[][] board, int row , int col,int val) {
		for(int i=0;i<9;i++) {
			if(board[i][col]==val) { // column
				return false;
			}
		}
		for(int i=0;i<9;i++) {
			if(board[row][i]==val) { // row
				return false;
			}
		}
		int sr = 3 * (row/3); // in 3X3
	       int sc = 3 * (col/3);
	      
	       for(int i=sr; i<sr+3; i++) {
	           for(int j=sc; j<sc+3; j++) {
	               if(board[i][j] == val) {
	                   return false;
	               }
	           }
	       }
		return true;
	}
	public static void display(int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] board = {{5,3,0,0,7,0,0,0,0},
				         {6,0,0,1,9,5,0,0,0},
                         {0,8,9,0,0,0,0,6,0},
                         {8,0,0,0,6,0,0,0,3},
                         {4,0,0,8,0,3,0,0,1},
                         {7,0,0,0,2,0,0,0,6},
                         {0,6,0,0,0,0,2,8,0},
                         {0,0,0,4,1,9,0,0,5},
                         {0,0,0,0,8,0,0,7,9}};
		Sudoko(board,0,0);

	}

}
