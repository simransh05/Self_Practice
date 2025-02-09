package re_coding1;

public class Bubble_Sort {
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) { // n-1 turn loop
			for(int j=0;j<arr.length-i;j++) { // last element is sorted so next time till n-1 sort
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,5,3,2,1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}System.out.println();
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}

	}

}
