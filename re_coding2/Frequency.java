package re_coding2;

public class Frequency {

	public static void main(String[] args) {
		String s = "njnwjbkewbkbcekcebcuwqbcwbcbwjbwckjnknjknjnje";
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			arr[ch-'a']++; // frequency of index at that arr value and add by 1
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println((char)(i+'a')+"  "+ arr[i]+"   ");
		}
	}

}
