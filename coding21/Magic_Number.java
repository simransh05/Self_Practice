package coding21;

public class Magic_Number {
	public static int nth_magic(int n) {
		int multi = 5;
		int ans =0;
		while(n>0) {
			if((n&1)!=0) {
				ans=ans+multi;
			}
			multi*=5;
			n>>=1;
		}return ans;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(nth_magic(n));

	}

}
