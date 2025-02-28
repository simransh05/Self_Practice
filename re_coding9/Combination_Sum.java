package re_coding9;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum { // 1d List
	public static void Combination(int[] coin, int amount,List<Integer> list,int idx) {
		if(amount==0) {
			System.out.println(list);
			return ;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				list.add(coin[i]);
				Combination(coin,amount-coin[i],list,i);
				list.remove(list.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int [] coin = {2,3,5};
		int amount =8;
		List<Integer> list = new ArrayList<>();
		Combination(coin,amount,list,0);
		

	}

}
