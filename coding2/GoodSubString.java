package coding2;

import java.util.Scanner;

public class GoodSubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = sc.next();
		System.out.println(goodSub(s));
		

	}
	public static int goodSub(String s) {
		int ans = 0; int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(voval(ch)) {
				count ++;
			}else {
				ans =Math.max(ans, count);
				count=0;
			}
		}return ans;
	}
	public static boolean voval(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}return false;
	}

}
