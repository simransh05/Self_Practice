package coding7;

public class SlevePrime {
	public static void Prime(int n) {
		boolean []prime=new boolean[n+1]; // arr val = false of all
		prime[0]=true;
		prime[1]=true;
		for(int i=2;i*i<n;i++) {
			if(prime[i]==false) {
				for(int j=2;i*j<prime.length;j++) {
					prime[i*j]=true;
				}
			}
		}for(int i=2;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.print(i+"  ");
			}
		}
	}
	
	public static void main(String[] args) {
		int n =100;
		Prime(n);
	}

}
