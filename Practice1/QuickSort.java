package Practice1;

public class QuickSort {
	static void display(int[] arr){
        for (int i:arr) 
            System.out.print(i + " ");
        System.out.println();
    }
	static int partition(int [] arr , int low , int high) {
		int pivot = arr[high];
		int i = low -1;
		for (int j = low ;j<high ;j++) {
			if (arr[j]< pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i]= arr[high] ;
		arr[high] = temp;
		return i;
	}
	static void quickSort(int[] arr, int low , int high) {
		if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
//		if (low<high) {
//			int pivot = partition(arr, low , high);
//			quickSort(arr, low , pivot-1);
//			quickSort(arr , pivot+1, high); // for higher value then pivot
//		}
	}

	public static void main(String[] args) {
		int [] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		display(arr);
	}

}
