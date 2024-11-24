package coding4;

public class dutch_National_Flag {
	public static void sortDNF(int[]arr) {
		int left=0; int right =arr.length-1;int i=0;
		while(i<=right) {
			if(arr[i] ==0) {
				int temp =arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
				left++;i++;
			}else if(arr[i]==1) {
				i++;
			}else {
				int temp =arr[i];
				arr[i]=arr[right];
				arr[right]=temp;
				right--;
			}
		}
	}
	static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int [] arr = {0,1,2,0,2,1,1,1,2,0,1};
		sortDNF(arr);
		display(arr);

	}

}
