package coding7;

public class Pow_NlogN {
	public static int pow(int a,int n) {
		if(n==0) {
			return 1;
		}
		int ans = pow(a,n/2);
		ans=ans*ans;
		if(n%2!=0) {
			ans*=a;
		}return ans;
	}

	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}

}
