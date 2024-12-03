package coding7;

public class MergeAndPartition {
	public static int[] merge(int[] arr1, int [] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int [] nums = new int[n+m]; int i=0;int j=0;int k=0;
		while(i<n && j<m) {
				if(arr1[i]<arr2[j]) {
					nums[k]=arr1[i];
					k++; i++;
				}else {
					nums[k]=arr2[j];
					k++;j++;
				}
			}
			while(i<n) {
				nums[k]=arr1[i];
				k++;i++;
			}
			while(j<m) {
				nums[k]=arr2[j];
				k++;j++;
			}
			return nums;
		
	}
	public static int partition(int [] arr ,int si,int ei) {
		int item = arr[ei]; int index=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<item) {
				int temp= arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}int temp=arr[ei];
		arr[ei]=arr[index];
		arr[index]=temp;
		return index;
	}
	
	public static void main(String[] args) {
		int [] arr = {2,1,8,7,4,3,9,4};
		int[] nums1 = {0,1,2,6,7,9,11,23,34};
		int[] nums2 = {2,3,4,5,6,7,8};
		int index= partition(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println(index);
//		int[] ans = merge(nums1,nums2);
//		for(int i=0;i<ans.length;i++) {
//			System.out.print(ans[i]+" ");
//		}
	}
}
