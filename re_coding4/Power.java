package re_coding4;

public class Power {
	public static int pow(int a ,int b) {
		if(b==1) {
			return a;
		}
		int p = pow(a,b-1);
		return p*a;
	}
	public static int powTail(int a,int b, int ans) {
		if(b==0) {
			return ans;
		}return powTail(a,b-1,ans*a);
	}

	public static void main(String[] args) {
		int a =3;
		int b=5;
		System.out.println(pow(a,b));
		System.out.println(powTail(a,b,1));
	}

}
