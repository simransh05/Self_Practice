package Practice1;

public class backtracking {
	static void permutation(String str , String per , int indx) {
		if (str.length()==0) {
			System.out.println(per);
			return;
		}
		for (int i =0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			String newStr = str.substring(0, i)+ str.substring(i+1);
			permutation(newStr ,per+currentChar , indx+1);
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		permutation(str,"",0);
	}

}
