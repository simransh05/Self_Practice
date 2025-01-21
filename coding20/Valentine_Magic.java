package coding20;

import java.util.Arrays;

public class Valentine_Magic {
	public static int magic(int[] boy ,int []girl ,int i,int j) {
		if(i==boy.length) {
			return 0;
		}
		if(j==girl.length) {
			return 1000000;
		}
		int select = Math.abs(boy[i]-girl[j])+magic(boy,girl,i+1,j+1);
		int no = magic (boy,girl,i,j+1);
		return Math.min(select, no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boy = {2,11,3};
		int[] girl = {5,7,3,2};
		Arrays.sort(boy);
		Arrays.sort(girl);
		System.out.println(magic(boy,girl,0,0));

	}

}
