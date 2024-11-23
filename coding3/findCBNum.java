package coding3;

public class findCBNum {

	public static void main(String[] args) {
		String str ="828192";
		cbNum(str);
		

	}
	public static boolean isCBNum(long num) {
		if(num==0||num==1) {
			return false;
		}int[] arr= {2,3,5,7,11,13,17,9,23,29};
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}return true;
	}
	public static void cbNum(String num) {
		int count=0;
		boolean []visited =new boolean[num.length()];
		for(int len = 1;len<=num.length();len++) {
			for(int j=len;j<=num.length();j++) {
				int i= j-len;
				String s =num.substring(i, j);
				if(isCBNum(Long.parseLong(s))==true && isVisited(visited,i,j-1)==true) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}System.out.println(count);
	}
	public static boolean isVisited(boolean[] visited , int i , int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true) {
				return false;
			}
		}return true;
	}
}
