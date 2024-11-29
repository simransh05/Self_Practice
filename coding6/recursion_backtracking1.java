package coding6;

public class recursion_backtracking1 {
	public static void permutationQueen(boolean []board ,int tq ,String ans , int qpsf) {
		if(qpsf==tq) { // qpsf = queen placed so far
			System.out.println(ans);
			return;
		}for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				permutationQueen(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i]=false;
			}
		}
	}
	public static void combinationQueen(boolean[] board , int tq , String ans ,int qpsf , int index) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}for(int i =index ; i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				combinationQueen(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1 ,i+1);
				board[i]=false;
			}
		}
	}
	static void coinPermutation(int amount, int [] arr, String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}for(int i=0;i<arr.length;i++) {
			if(amount>=arr[i]) {
				coinPermutation(amount-arr[i],arr,ans+arr[i]);
			}
		}
	}
	static void coinCombination(int amount, int [] arr, String ans ,int index) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}for(int i=index;i<arr.length;i++) {
			if(amount>=arr[i]) {
				coinCombination(amount-arr[i],arr,ans+arr[i],i);
			}
		}
	}

	public static void main(String[] args) {
		int n=4;
		boolean [] board= new boolean[n];
		int tq = 2;
		int[] arr = {2,3,5};
//		permutationQueen(board, tq,"",0);
//		combinationQueen(board,tq,"",0,0);
//		coinPermutation(8,arr,"");
		coinCombination(8,arr,"",0);

	}

}
