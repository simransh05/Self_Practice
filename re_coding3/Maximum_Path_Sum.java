package re_coding3;

public class Maximum_Path_Sum {

	public static void main(String[] args) {
		int[] arr = {2,3,7,10,12,15,30,34};
		int [] arr1= {1,5,7,8,10,15,16,19};
		System.out.println(Maximum(arr,arr1));

	}

	private static int Maximum(int[] arr, int[] arr1) {
		int s1 =0;int s2 =0;int ans=0;
		int i=0;
		int j=0;
		while(i<arr.length && j<arr1.length) {
			if(arr[i]<arr1[j]) {
				i++;
			}else if(arr[i]>arr1[j]) {
				j++;
			}else {
				int sum1=0;
				for(int k=s1;k<=i;k++) {
					sum1+=arr[k];
				}
				int sum2=0;
				for(int k=s2;k<=j;k++) {
					sum2+=arr1[k];
				}
				ans=ans+Math.max(sum1, sum2);
				i++;j++;
				s1=i;s2=j;
			}
		}int sum1=0;
		for(int k=s1;k<arr.length;k++) {
			sum1+=arr[k];
		}int sum2=0;
		for(int k=s2;k<arr1.length;k++) {
			sum2+=arr1[k];
		}
		ans=ans+Math.max(sum1, sum2);
		return ans;
	}

}
