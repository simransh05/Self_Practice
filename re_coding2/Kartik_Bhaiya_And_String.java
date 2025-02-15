package re_coding2;
import java.util.*;
public class Kartik_Bhaiya_And_String {

	public static void main(String[] args) {
		String s ="abaaabaabbaa";
		int k=2;
		int flipA = MaximumLength(s,k,'a');
		int flipB = MaximumLength(s,k,'b');
		System.out.println(Math.max(flipA, flipB));
	}

	private static int MaximumLength(String s, int k, char ch) {
		int si =0;int ei=0;
		int ans=0;int flip=0;
		while(ei<s.length()) {
			if(s.charAt(ei)==ch) {
				flip++;
			}while(flip>k) {
				if(s.charAt(si)==ch) {
					flip--;
				}si++;
			}
			ans =Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
