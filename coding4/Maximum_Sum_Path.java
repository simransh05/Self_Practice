package coding4;

public class Maximum_Sum_Path {
	public static int MaximumSum(int[] arr1 ,int [] arr2) {
		int i=0;int j=0; int s1 = 0;int s2 =0;int ans=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else {
				int sum1=0;
				for(int k=s1;k<=i;k++) {
					sum1+=arr1[k];
				}int sum2=0;
				for(int k=s2;k<=j;k++) {
					sum2+=arr2[k];
				}
				ans = ans+Math.max(sum1, sum2);
				i++;
				j++;
				s1=i;
				s2=j;
			}
		}int sum1=0;
		for(int k=s1;k<arr1.length;k++) {
			sum1+=arr1[k];
		}int sum2=0;
		for(int k=s2;k<arr2.length;k++) {
			sum2+=arr2[k];
		}ans =ans+Math.max(sum1, sum2);
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1= {2,3,7,10,12,15,30,34};
		int [] arr2 = {1,5,7,8,10,15,16,19};
		System.out.println(MaximumSum(arr1,arr2));

	}

}
