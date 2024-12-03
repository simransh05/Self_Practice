package coding7;

import java.util.Random;

public class Randomize_Quick_Sort {
	public static void QuickSort(int[] arr , int si, int ei) {
		if(si>=ei) {
			return ;
		}
		int index = partition(arr,si,ei);
		QuickSort(arr,si,index-1);
		QuickSort(arr,index+1,ei);
	}
	public static int partition(int [] arr ,int si,int ei) {
		Random rn = new Random();
		int p = rn.nextInt(ei-si+1)+si;
		int temp1 = arr[p];
		arr[p]=arr[ei];
		arr[ei]=temp1;
		int item = arr[ei]; int index=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<item) {
				int temp= arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}int temp=arr[ei];
		arr[ei]=arr[index];
		arr[index]=temp;
		return index;
	}
	

	public static void main(String[] args) {
		

	}

}
