package re_coding16;

import java.util.Scanner;

public class Tavas_And_Saddas {
	public static int index(String s) {
		int n = s.length();
		int pos = 0;
		int count = (1 << n) - 2;
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				count += (1 << pos);
			}
			pos++;
		}
		return count + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(index(s));
		sc.close();

	}

}
