package coding7;

public class DivideAndConquer { 
	public static int[] MergeSort(int[] arr, int si , int ei) {
		if(si==ei) {
			int[] na = new int[1];
			na[0]=arr[si];
			return na;
		}int mid = (si+ei)/2;
		int []fa = MergeSort(arr,si,mid);
		int[] sa =MergeSort(arr,mid+1,ei);
		return merge(fa,sa);
	}
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
	public static void QuickSort(int[] arr , int si, int ei) {
		if(si>=ei) {
			return ;
		}
		int index = partition(arr,si,ei);
		QuickSort(arr,si,index-1);
		QuickSort(arr,index+1,ei);
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
	public static void display(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void main(String[] args) {
		int[]  arr = {7,5,1,3,4}; int [] arr1 = {5,7,2,1,8,3,4};
		QuickSort(arr1,0,arr1.length-1);
		display(arr1);
//		int[] ans = MergeSort(arr,0,arr.length-1);
//		for(int i=0;i<ans.length;i++) {
//			System.out.print(ans[i]+" ");
//		}

	}

}
