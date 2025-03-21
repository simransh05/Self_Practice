package coding22;

import java.util.Arrays;

public class Counting_Sort {
	public static int[] sort(int []arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int[] freq = new int[max+1];
		for(int i=0;i<arr.length;i++) {
			int e = arr[i];
			freq[e]++;
		}
		for(int i=1;i<freq.length;i++) {
			freq[i]=freq[i-1]+freq[i];
		}int[] ans = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			int e = arr[i];
			int idx = freq[e];
			ans[idx-1]=arr[i];
			freq[e]--;
		}return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		System.out.println(Arrays.toString(sort(arr)));
	}

}
