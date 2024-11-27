package coding5;

public class recursion3 {
	public static void dice(int n ,int curr ,String ans) {
		if(curr>n) {
			return;
		}if(curr==n) {
			System.out.print(ans+"  ");
			return;
		}dice(n,curr+1,ans+1);
		dice(n,curr+2,ans+2);
		dice(n,curr+3,ans+3);
	}
	
	public static int diceLoop(int n ,int curr ,String ans ) {
		if(curr>n) {
			return 0;
		}if(curr==n) {
			System.out.print(ans+"  ");
			return 1;
		}int count=0;
		for(int i=1;i<n;i++) {
			 count+=diceLoop(n,curr+i,ans+i );
		}return count;
	}
	public static void lexico(int n, int val) {
		if(val>n) {
			System.out.println(val);
			return;
		}int i=0;
		if(val==0) {
			i=1;
		}
		for(;i<10;i++) {
			lexico(n,val*10+i);
		}
	}
	public static void matrix( int cc,int cr , int er, int ec , String ans) {
		if(cc==ec && cr==er) {
			System.out.println(ans);
			return;
		}if(cc>ec||cr>er){
			return;
		}
		matrix(cc+1,cr,er,ec,ans+ "H");
		matrix(cc,cr+1,er,ec,ans+"V");
	}

	public static void main(String[] args) {
		int n=3; int m =3; //matrix m*n
//		dice(n,0,"");
		System.out.println();
//		diceLoop(n,0,"");
//		System.out.println(diceLoop(n,0,""));
//		lexico(20,0);
		matrix(0,0,m-1,n-1,"");
	}

}
