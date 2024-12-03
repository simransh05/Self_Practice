package coding7;

public class Axis_Orbit {
	public static int Axis(String s) {
		int odd =0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;i-j>=0 && i+j<s.length();j++) {
				if(s.charAt(i-j)!=s.charAt(i+j)) {
					break;
				}odd++;
			}
		}int even=0;
		for(double i=0.5;i<s.length();i++) {
			for(double j=0.5;i-j>=0 && i+j<s.length();j++) {
				if(s.charAt((int)(i-j))!=s.charAt((int)(i+j))) {
					break;
				}even++;
			}
		}
		return odd+even;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaa";
		System.out.println(Axis(s));

	}

}
