package re_coding4;

public class Print {
	public static void printDec(int n) {
		if(n==0) {
			return ;
		}System.out.println(n);
		printDec(n-1);
	}
	public static void printInc(int n) {
		if(n==0) {
			return;
		}printInc(n-1);
		System.out.println(n);
	}
	public static void printBoth(int n) {
		if(n==0) {
			System.out.println();
			return;
		}System.out.println(n);
		printBoth(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n=5;
//		printDec(n);
//		printInc(n);
		printBoth(n);

	}

}
