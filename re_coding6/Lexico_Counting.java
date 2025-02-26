package re_coding6;

public class Lexico_Counting {
	public static void Lexico(int n, int curr) {
		if(curr>n) {
			return;
		}
		System.out.print(curr+"  ");
		int i=0;
		if(curr==0) {
			i=1;
		}for(;i<=9;i++) {
			Lexico(n,curr*10+i);
		}
	}

	public static void main(String[] args) {
		int n=100;
		Lexico(n,0);

	}

}
