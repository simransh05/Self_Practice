package re_coding2;

public class Sliding_Window {
	public static int Maximum(int[] arr, int k) {
		int sum =0;
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}ans = sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans = Math.max(ans, sum);
		}return ans;
	}

	public static void main(String[] args) {
		int[] arr= {2,1,3,4,7,2,6,4,5};
		int k=3;
		System.out.println(Maximum(arr,k));
		
	}

}
