package coding21;

public class Check_Ith_Set {
	public static void check_Ith_Position(int n , int i) {
		int mask = 1<<i;
		if((n& mask)!=0) {
			System.out.println("set");
		}else {
			System.out.println("unset");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 75;
		int i =2;
		check_Ith_Position(n,i);

	}

}
