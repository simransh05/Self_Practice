package re_coding;

public class Divide_And_Conquer {
	public static int[] sort(int[] arr, int si,int ei) {
		if(si==ei) {
			int[] bs = new int[1];
			bs[0]=arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		int[] fa  = sort(arr,si,mid);
		int[] sa = sort(arr,mid+1,ei);
		return merge(fa,sa);
	}
	public static int[] merge(int[] arr,int []arr1) {
		int m = arr.length;int n = arr1.length;
		int[] ans = new int[m+n];
		int i=0;int j=0 ; int k =0;
		while(i<m && j<n) {
			if(arr[i]<arr1[j]) {
				ans[k]=arr[i];
				i++;k++;
			}else  {
				ans[k]=arr1[j];
				j++;k++;
			}
		}while(i<m) {
			ans[k]=arr[i];
			i++;k++;
		}
		while(j<n) {
		    ans[k]=arr1[j];
			j++;k++;
		}return ans;
	}

	public static void main(String[] args) {
		int[]arr= {7,5,1,3,4};
		int[] ans = sort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+"  ");
		}

	}

}
