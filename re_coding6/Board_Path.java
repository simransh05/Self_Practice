package re_coding6;

public class Board_Path {
	// curr --> n
	public static void path(int curr ,int n,String ans) {
		if(curr<0) {
			return ;
		}
		if(curr==0) {
			System.out.print(ans+"   ");
			return ;
		}
		path(curr-1,n,ans+1);
		path(curr-2,n,ans+2);
		path(curr-3,n,ans+3);
	}
	// curr -->0 
	public static void pathBoard(int curr ,int n,String ans) {
		if(curr>n) {
			return ;
		}
		if(curr==n) {
			System.out.print(ans+"   ");
			return ;
		}
		pathBoard(curr+1,n,ans+1);
		pathBoard(curr+2,n,ans+2);
		pathBoard(curr+3,n,ans+3);
	}
	// loop
	public static void pathBoardI(int curr ,int n,String ans) {
		if(curr>n) {
			return ;
		}
		if(curr==n) {
			System.out.print(ans+"   ");
			return ;
		}
		for(int i=1;i<=3;i++) {
			pathBoardI(curr+i,n,ans+i);
		}
	}

	public static void main(String[] args) {
		int n = 4;
		path(n,n,"");
		System.out.println();
		pathBoard(0,n,"");
		System.out.println();
		pathBoardI(0,n,"");

	}

}
