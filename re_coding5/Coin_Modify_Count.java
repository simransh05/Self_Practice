package re_coding5;

public class Coin_Modify_Count {
	public static int coin(int n , String ans) {
		if(n==0) {
			System.out.println(ans);
			return 1;
		}int a =0;
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
		    a =coin(n-1,ans+"H");
		}
		int b =coin(n-1,ans+"T");
		return a+b;
	}

	public static void main(String[] args) {
		int n=3;
		System.out.println(coin(n,""));

	}

}
