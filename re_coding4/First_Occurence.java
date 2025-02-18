package re_coding4;

public class First_Occurence {
	public static int index(int[] arr,int val, int idx) {
		if(idx==arr.length-1) {
			return -1;
		}if(arr[idx]==val) {
			return idx;
		}return index(arr,val,idx+1);
	}

	public static void main(String[] args) {
		int[] arr = {2,2,4,1,6,3,5,3,7,3};
		int val = 1;
		System.out.println(index(arr,val,0));
	}

}
