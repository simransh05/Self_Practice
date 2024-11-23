package coding3;

public class string {
	public static void subString(String str) {
		for(int len =1;len <=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		String str = "abcd";
		subString(str);

	}

}
