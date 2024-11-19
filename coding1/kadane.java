package coding1;

public class kadane { // used for finding maxSubArray Sum
	static int Kadanes(int[] arr) {
		int sum=0;
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}return ans;
	}
	static int maximumSum(int[] arr) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
		 for(int j=i;j<arr.length;j++) {
			sum+=arr[j];
			 ans = Math.max(ans, sum);
		}
		}return ans;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,-11,4,-1,5};
		System.out.println(maximumSum(arr));
		System.out.println(Kadanes(arr));

	}

}
