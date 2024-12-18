package coding15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			pair[]arr =new pair[n];
			for(int i=0;i<arr.length;i++) {
				int st = sc.nextInt();
				int ed = sc.nextInt();
				arr[i]=new pair(st,ed);
			}
			Arrays.sort(arr, new Comparator<pair> () {

				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.ei-o2.ei;
				}
				
			});
			int activity =1;
			int end = arr[0].ei;
			for(int i=1;i<arr.length;i++) {
				if(end<=arr[i].si) {
					end=arr[i].ei;
					activity++;
				}
			}
			System.out.println(activity);
		}
	}
	static class pair{
		int si;
		int ei;
		public pair(int si, int ei) {
			this.si = si;
			this.ei = ei;
		}
		
	}
//	3
//	3
//	3 9
//	2 8
//	6 9
//
//	4
//	1 7
//	5 8
//	7 8
//	1 8
//
//	6
//	7 9
//	0 10
//	4 5
//	8 9
//	4 10
//	5 7

}
