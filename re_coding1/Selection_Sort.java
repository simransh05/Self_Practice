package re_coding1;

public class Selection_Sort {
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int idx = minIdx(arr,i);
			int temp = arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
	}
	public static int minIdx(int[] arr ,int idx ) {
		int min =idx;
		for(int i=idx+1 ;i<arr.length;i++) {
			if(arr[i]<arr[min]) {
				min = i;
			}
		}return min;
	}

	public static void main(String[] args) {
		int[]arr = {5,3,-7,4,8,2};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}System.out.println();
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}

	}

}
