package re_coding21;

import java.util.Arrays;

public class Aggressive_Cows {
	public static int sitting(int[] stall, int cow) {
		int low = 1;
		int high = stall[stall.length-1]-stall[0];
		int ans = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (canSit(stall, cow, mid)) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

	private static boolean canSit(int[] stall, int c, int dis) {
		int cow =1 ;
		int pos = stall[0];
		for (int i=1;i<stall.length;i++) {
			if((stall[i]-pos)>=dis) {
				cow++;
				pos = stall[i];
			}if(cow==c) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int [] stall = {1,2,8,4,9};
		int cow = 3;
		Arrays.sort(stall);
		System.out.println(sitting(stall,cow));
	}

}
