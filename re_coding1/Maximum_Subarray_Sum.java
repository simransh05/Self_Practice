package re_coding1;

public class Maximum_Subarray_Sum {
	public static int Maximum(int[] arr) { // O(n^2)
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				ans =Math.max(ans, sum);
				if(sum<0) { // this line will help when the sum is negative
					sum=0;
				}
			}
		}return ans;
	}
	public static int maxSubArray(int[] nums) { // O(n)
	       int maxSum = nums[0];
	        int currentSum = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            currentSum = Math.max(nums[i], currentSum + nums[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        } return maxSum;
		}

	public static void main(String[] args) {
		int[] arr = {2,3,-11,4,-1,5};
		System.out.println(Maximum(arr));
		System.out.println(maxSubArray(arr));

	}

}
