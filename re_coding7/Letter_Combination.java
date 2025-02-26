package re_coding7;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combination {
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static void keyPaid(String s, String ans,List<String> list){
		if(s.length()==0) {
			list.add(ans);
			return ;
		}char ch = s.charAt(0);
		int val  = ch-'0';
		String press = map[val];
		for(int i=0;i<press.length();i++) {
			keyPaid(s.substring(1),ans+press.charAt(i),list);
		}
	}

	public static void main(String[] args) {
		String s = "23";
		List<String> list = new ArrayList<>();
		keyPaid(s,"",list);
		System.out.println(list);

	}

}
