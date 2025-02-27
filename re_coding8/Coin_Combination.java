package re_coding8;

public class Coin_Combination {
	public static void permutation(int[] coin, int amount,String ans,int idx) {
		if(amount==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				permutation(coin,amount-coin[i],ans+coin[i],i);
			}
		}
	}

	public static void main(String[] args) {
		int[] coin = {2,3,5};
		int amount = 8;
		permutation(coin,amount,"",0);

	}

}
