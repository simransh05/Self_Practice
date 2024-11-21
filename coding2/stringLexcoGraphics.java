package coding2;

public class stringLexcoGraphics {

	public static void main(String[] args) {
		String s1 = "kunal";
		String s2 = "komal";
		/*
		 * ASCii values
		 * s1>s2 +ve
		 * s1<s2 -ve
		 * s1==s2 0
		 */
		System.out.println(s1.compareTo(s2));
		System.out.println(compare(s1,s2));
	}
	public static int compare(String str1,String str2) {
		if(str1 == str2) {
			return 0;
		}
		int minimum = Math.min(str1.length(), str2.length());
		for(int i=0;i<minimum;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return str1.charAt(i)-str2.charAt(i);
			}
		}return str1.length()-str2.length();
	}

}
