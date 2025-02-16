package re_coding3;

public class DNF {
	public static void dnf(int[] arr , int i) {
		int left = 0;int right = arr.length-1;
		while(i<=right) {
		    if(arr[i]==2) {
			    int temp = arr[right];
			    arr[right]=arr[i];
			    arr[i]=temp;
			    right--;
		    }else if(arr[i]==0) {
			    int temp = arr[left];
			    arr[left]=arr[i];
			    arr[i]=temp;
			    left++;
			    i++;
		    }else {
			    i++;
		    }
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,0,2,1,1,2,1,0,1,0};
		dnf(arr,0);
		for(int i:arr) {
			System.out.print(i+"  ");
		}
	}

}
