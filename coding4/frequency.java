package coding4;

public class frequency {

	public static void main(String[] args) {
		String s = "annjefknaajbbknwbbjbibfijbjnwfiib";
		int freq[]=new int[26]; // a=97,b=98
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			freq[ch-'a']++;
		}for(int i=0;i<freq.length;i++) {
			System.out.print(freq[i]+" ");
		}

	}

}
