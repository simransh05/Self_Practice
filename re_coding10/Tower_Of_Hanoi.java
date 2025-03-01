package re_coding10;

public class Tower_Of_Hanoi {
	public static void toh(int n , String src ,String help,String des) {
		if(n==0) {
			
			return ;
		}
		toh(n-1,src,help,des);
		System.out.println("move "+ n+"th disk from "+src +" to " +des );
		toh(n-1,help,src, des);
	}

	public static void main(String[] args) {
		int n = 3;
		toh(n,"A","C","B");

	}

}
