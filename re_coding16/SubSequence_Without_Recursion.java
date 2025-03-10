package re_coding16;

public class SubSequence_Without_Recursion {
	public static void Subsequence(String s) {
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			print(s, i);
		}
	}

	private static void print(String s, int i) {
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i = i >> 1;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		String s = "abc";
		Subsequence(s);

	}

}
