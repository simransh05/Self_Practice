package coding21;

public class Count_Set_Bit {
	public static int setBit(int n) {
		int count=0;
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}n>>=1;  // n = n>>1;
		}return count;
	}
	public static int countSet(int n) { // fastest approach only set times loop runs
		int count=0;
		while(n>0) {
			count++;
			n=(n&n-1);
		}return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 75;
		System.out.println(setBit(n));
		System.out.println(countSet(n));
	}

}
