package coding20;

public class LIS_NLogN {
	public static int lis(int [] arr) {
		int[]dp = new int[arr.length];
		dp[0]=arr[0];
		int length =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]> dp[length-1]) { // last value is same then add at the end
				dp[length]=arr[i];
				length++;
			}else {
				int idx = binarySearch(dp,0,length-1,arr[i]); // search for value just greater then arr[i]
				dp[idx]=arr[i]; // replace
			}
		}return length;
	}

	private static int binarySearch(int[] arr, int si, int ei, int target) {
		int idx =0;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(arr[mid]>=target) {
				idx= mid;
				ei = mid-1;
			}else {
				si=mid+1;
			}
		}return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));
	}

}
