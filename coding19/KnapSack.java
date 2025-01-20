package coding19;

public class KnapSack {
	public static int knap(int[]wt, int [] val , int cap,int idx) {
		if(cap ==0|| idx== wt.length) {
			return 0;
		}		
		int inc =0;int exc =0;
		if(wt[idx]<=cap) {
			inc = val[idx]+knap(wt,val, cap-wt[idx],idx+1);
		}exc = knap(wt,val, cap,idx+1);
		return Math.max(inc, exc);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = {1,2,3,2,2};
		int[]value= {8,4,0,5,3};
		int w = 4;
		System.out.println(knap(weights,value,w,0));

	}

}
