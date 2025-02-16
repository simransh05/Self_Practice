package re_coding3;

public class Circular_SubArray_Sum {
	public static int kadane(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}return ans;
	}
	public static int circular(int[] arr) {
		int linear = kadane(arr);
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i]; // full  array sum
			arr[i]=arr[i]*-1; 
		}
		int mid  = kadane(arr);
		int circular= mid+sum;
		if(circular==0) {
			return linear;
		}return Math.max(linear, circular);
	}

	public static void main(String[] args) {
		int[] arr = {-2,-3,7,5,-19};
		System.out.println(circular(arr));
	}

}
