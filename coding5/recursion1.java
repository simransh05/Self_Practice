package coding5;

public class recursion1 {
	public static int fac(int n) {
		if(n==1 || n==0) {
			return 1;
		}return n*fac(n-1);
	}
	public static void print(int n) {
		if(n==0) {
			return;
		} System.out.println(n);
		print(n-1);
	}
	public static void printValue(int n) {
		if(n==1) {
			return ;
		}printValue(n-1);
		System.out.println(n);
	}
	public static int power(int a ,int b) {
		if(b==0) {
			return 1;
		}
		if(b==1) {
			return a;
		}return a*(power(a,b-1));
	}
	public static int tailFac(int n , int i) {
		if(n==0) {
			return i;
		} return tailFac(n-1,n*i);
	}
	// tail recursion
	public static int pow(int a,int b ,int i) {
		if(b==0) {
			return i;
		}return pow(a,b-1,i*a);
	}
	public static int array(int[]arr ,int item ,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==item) {
			return index;
		}return array(arr,item,index+1);
	}

	public static void main(String[] args) {
		int n =5; int a=3;int b=5;
		int[] arr = {2,4,3,5,6,3,7,3,54,3,11};
		int item =3;
		System.out.println(array(arr,item,0));
		System.out.println(fac(n));
//		print(n);
//		printValue(n);
		System.out.println(power(a,b));
//		System.out.println(tailFac(n,1));
		System.out.println(pow(a,b,1));

	}

}
