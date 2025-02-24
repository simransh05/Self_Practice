package re_coding6;

public class Count_Path {
	public static int pathBoardI(int curr ,int n,String ans) {
		if(curr>n) {
			return 0;
		}
		if(curr==n) {
			System.out.print(ans+"   ");
			return 1;
		}int count =0;
		for(int i=1;i<=3;i++) {
			count+= pathBoardI(curr+i,n,ans+i);
		}return count;
	}

	public static void main(String[] args) {
		int n=4;
		System.out.println(pathBoardI(0,n,""));

	}

}
