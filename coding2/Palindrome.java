package coding2;

public class Palindrome {

	public static void main(String[] args) {
		String s="naan";
		String s1= "kanika";
		System.out.println(check(s1));
		
	}
	public static boolean check(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}i++;
			j--;
		}return true;
	}
}
