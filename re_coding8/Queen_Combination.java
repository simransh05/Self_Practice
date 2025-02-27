package re_coding8;

public class Queen_Combination {
	public static void Queen(boolean[] board, int q, String ans,int soFarQ, int idx) {
		if(soFarQ==q) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				Queen(board,q,ans+"b"+i+"q"+soFarQ,soFarQ+1,i+1);
				board[i]=false;
			}
		}
	}

	public static void main(String[] args) {
		int n = 4;
		int q =2;
		boolean[] board = new boolean[n];
		Queen(board,q,"",0,0);

	}

}
