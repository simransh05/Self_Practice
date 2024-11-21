package coding2;

public class string {

	public static void main(String[] args) {
		String s1= "hello";
		String s2= "hello";
		String s3= new String("hello");
		String s4 =new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.length());
		//adding strings 
		String s5 =s1.concat(s4); //method 1
		String s6 = s1+s2; //method 2 (most used)
		System.out.println(s5);
		System.out.println(s6);
		System.out.println("hey"+10+20+"bye"); //first string
		System.out.println(10+20+"bye"+10+20); // first integer
		System.out.println(s1.charAt(1)); // character at index
		System.out.println(s1.equals(s2)); // both are equal or not
		System.out.println(checkEqual(s1,s2));
	}
	static boolean checkEqual(String str, String str1) {
		if(str == str1) {
			return true;
		}if(str.length()!=str1.length()) {
			return false;
		}for(int i=0;i<str1.length();i++) {
			if(str.charAt(i)!=str1.charAt(i)) {
				return false;
			}
		}return true;
	}

}
