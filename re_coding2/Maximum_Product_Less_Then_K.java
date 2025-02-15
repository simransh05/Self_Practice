package re_coding2;

public class Maximum_Product_Less_Then_K {
	public static int Maximum(int[] arr, int k) {
		int si  =0 ; int ei=0;int p=1;int ans =0;
		while(ei<arr.length) {
			//grow
			p=p*arr[ei];
			while(p>=k && si<=ei) {
				// srink
				p=p/arr[si];
				si++;
			}ans +=(ei-si+1);
			ei++;
		}return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int k=0;
		System.out.println(Maximum(arr,k));
	}

}
