package re_coding6;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
	public static void valid(int n, int open,  int close, String ans,List<String>list) {
		if(close==n && open ==n) {
			list.add(ans);
			return;
		}
		if(open<n) {
			valid(n,open+1,close,ans+"(",list);
		}if(open>close) {
			valid(n,open,close+1,ans+")",list);
		}
	}

	public static void main(String[] args) {
		int n=3;
		List<String> result = new ArrayList<>();
		valid(n,0,0,"",result);
		System.out.println(result);

	}

}
