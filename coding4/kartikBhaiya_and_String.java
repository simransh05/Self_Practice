package coding4;

public class kartikBhaiya_and_String {
	public static int Kartik(String str ,int k ,char ch) {
		int start =0; int ans =0; int flip =0;
		for(int end=0;end<str.length();end++) {
			if(str.charAt(end)==ch) {
				flip++;
				while(flip>k) {
					if(str.charAt(start)==ch) {
						flip--;
					}start++;
				}
			}ans =Math.max(ans, (end-start+1));
		}return ans;
	}

	public static void main(String[] args) {
		String str= "abaaabaabbaaa";
		int k=2;
		int flipA= Kartik(str,k,'a');
		int flipB =Kartik(str,k,'b');
		System.out.println(Math.max(flipA, flipB));
		

	}

}
