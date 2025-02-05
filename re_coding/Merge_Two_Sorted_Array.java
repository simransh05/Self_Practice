package re_coding;

public class Merge_Two_Sorted_Array {
	public static int[] merge(int[] arr,int []arr1) {
		int m = arr.length;int n = arr1.length;
		int[] ans = new int[m+n];
		int i=0;int j=0 ; int k =0;
		while(i<m && j<n) {
			if(arr[i]<arr1[j]) {
				ans[k]=arr[i];
				i++;k++;
			}else {
				ans[k]=arr1[j];
				j++;k++;
			}
		}while(i<m ) {
			ans[k]=arr[i];
			i++;k++;
		}
		while(j<n) {
		    ans[k]=arr1[j];
			j++;k++;
		}return ans;
	}

	public static void main(String[] args) {
		int [] arr1= {2,3,5,7,9};
		int[] arr2 = {1,2,5,7,9,11,13,15,18};
		int[] ans =merge(arr1,arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"  ");
		}

	}

}
