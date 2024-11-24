package coding4;

public class subArray_Sliding_Window {
	public static int subArray(int[]arr , int k) {
		int current =0;
		int maxSum = 0;
		for(int i =0;i<k;i++) {
			current+=arr[i];
		}maxSum = current;
		for(int i=k;i<arr.length;i++) {
			current+=arr[i]; //grow
			current-=arr[i-k]; // shrink
			maxSum= Math.max(maxSum, current);
		}return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6,7,8,9,4,5};
		int k =  3;
		System.out.println(subArray(arr,k));

	}

}
