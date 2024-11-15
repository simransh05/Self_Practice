package Practice1;

//import java.util.Arrays;

public class MergeSort {
	static void display(int [] arr) {
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}System.out.println();
	}
	static void conquer (int [] arr , int si , int mid , int ei) {
		int [] merge = new int[ei-si+1];
		int i = si;
		int j = mid+1;
		int k =0;
		while (i<= mid && j<=ei) {
			if (arr[i]<=arr[j]) {
				merge[k]= arr[i];
				k++;i++;
			}else {
				merge[k]= arr[j];
				k++;j++;
			}
		}
		while (i<=mid) {
			merge[k]= arr[i];
			k++;i++;
		}
		while (j<=ei) {
			merge[k]= arr[j];
			k++;j++;
		}
		for (int m =0 , n=si; m <merge.length;m++,n++ ) {
			arr[n]= merge[m];
		}
	}
	static void divide (int [] arr , int si , int ei) {
		if (si>=ei) {
			return;
		}int mid = si +(ei-si)/2;
		divide(arr,si, mid);
		divide (arr , mid+1 , ei);
		conquer(arr , si , mid ,ei);
	}

	public static void main(String[] args) {
		int [] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide (arr, 0,n-1);
		display(arr);
	}

}
