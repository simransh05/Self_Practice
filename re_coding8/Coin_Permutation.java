package re_coding8;

public class Coin_Permutation {
	public static void coinPer(int[] coin, int amount,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return ;
		}
		if(amount < 0) {
			return;
		}
		for(int i=0;i<coin.length;i++) {
			coinPer(coin,amount-coin[i],ans+coin[i]);
		}
	}
	public static void permutation(int[] coin, int amount,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<coin.length;i++) {
			if(amount>=coin[i]) {
				permutation(coin,amount-coin[i],ans+coin[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] coin = {2,3,5};
		int amount =8;
		coinPer(coin,amount,"");
		System.out.println();
		permutation(coin,amount,"");
	}

}
