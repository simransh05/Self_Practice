package re_coding9;

import java.util.ArrayList;
import java.util.List;

public class Pallindrome_Partition {
	public static void Partition(String s , List<String> list , List<List<String>>result) {
		if(s.length()==0) {
			result.add(new ArrayList<>(list));
			return ;
		}
		for(int i=1;i<=s.length();i++) {
			String str = s.substring(0, i);// answer 
			if(isPallindrome(str)) {
				list.add(str);
				Partition(s.substring(i),list,result);// question
				list.remove(list.size()-1);
			}
		}
	}
	public static void Partition(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=1;i<=ques.length();i++) {
			String str = ques.substring(0, i);// answer 
			Partition(ques.substring(i),ans+str+"|");// question
		}
	}
	public static void PartitionPallindrome(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return ;
		}
		for(int i=1;i<=ques.length();i++) {
			String str = ques.substring(0, i);// answer 
			if(isPallindrome(str)) {
			     Partition(ques.substring(i),ans+str+"|");// question
			}
		}
	}

	private static boolean isPallindrome(String str) {
		int i=0; int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}i++;j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>>result = new ArrayList<>();
		Partition(s,list,result);
		System.out.println(result);
		Partition(s,"");
	}

}
