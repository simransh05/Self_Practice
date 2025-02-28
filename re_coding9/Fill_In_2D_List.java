package re_coding9;

import java.util.ArrayList;
import java.util.List;

public class Fill_In_2D_List {
	public static void Combination(int[] coin, int amount,List<Integer> list,int idx,List<List<Integer>>result) {
		if(amount==0) {
			result.add(new ArrayList<>(list));
			return ;
		} 
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				list.add(coin[i]);
				Combination(coin,amount-coin[i],list,i,result);
				list.remove(list.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		int [] coin = {2,3,5};
		int amount =8;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>>result = new ArrayList<>();
		Combination(coin,amount,list,0,result);
		System.out.println(result);

	}

}
