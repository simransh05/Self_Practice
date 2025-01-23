package coding21;

import java.util.Scanner;

public class Lucky_Number {
	public static int index(String s) {
		int n =s.length();
		int count = (1<<n)-2;
		int pos =0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='7') {
				count+=(1<<pos);
			}
			pos++;
		} return count+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(index(s));
	}

}
