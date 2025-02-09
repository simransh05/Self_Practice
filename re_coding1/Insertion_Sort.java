package re_coding1;

public class Insertion_Sort {
    public static void InsertLastElements(int[] arr ,int i) {
		int item = arr[i];
		int j=i-1; 
		while(j>=0 && arr[j]>item) { 
			arr[j+1]=arr[j]; 
			j--;
		}arr[j+1]=item;
	}
    public static void sort(int []arr) {
    	for(int i=1;i<arr.length;i++) {
    		InsertLastElements(arr,i);
    	}
    }


	public static void main(String[] args) {
		int[]arr = {3,4,2,1,7,-1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}System.out.println();
//		InsertLastElements(arr,arr.length-1);
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}

	}

}
