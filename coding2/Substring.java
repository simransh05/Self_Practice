package coding2;

public class Substring {

	public static void main(String[] args) {
		String s1 = "hello";
//		System.out.println(s1.substring(0, 4));
		findSubString(s1);

	}
	public static void findSubString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
