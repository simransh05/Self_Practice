package Practice1;
import java.util.ArrayList;
public class Permutation {
	static void PermutationPrint(String str , String permutation) {
		if (str.length()==0) {
			System.out.println(permutation);
			return;
		} 
		for (int i =0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			String newStr = str.substring(0,i)+str.substring(i+1);
			PermutationPrint(newStr,permutation+currentChar);
		}
	}
	static int path(int i , int j , int m , int n) {
		if (i==m || j ==n) {
			return 0;
		}
		if (i==m-1 && j==n-1) {
			return 1;
		}
		return path(i+1, j, m, n) + path(i, j+1, m, n);
	}
	static int tiles(int n , int m) {
		if (n==m) {
			return 2;
		}
		if (n<m) {
			return 1;
		}
		int vertical = tiles(n-m,m);
		int horizontal = tiles(n-1,m);
		return vertical + horizontal ;
	}
	static int pairs(int n) {
		if (n<=1) {
			return 1;
		}
		int single = pairs(n-1);
		int pairs = (n-1) *pairs(n-2);
		return single + pairs;
	}
	static void printSubset(ArrayList<Integer> subset) {
		for (int i =0;i<subset.size();i++) {
			System.out.print(subset.get(i)+ "  ");
		}System.out.println();
	}
	static void subset (int n, ArrayList<Integer> subset) {
		if(n==0) {
			printSubset(subset);
			return;
		}
		subset.add(n);
		subset(n-1,subset);
		subset.remove(subset.size()-1);
		subset(n-1,subset);

	}
	
	public static void main(String[] args) {
		String str = "abc";
//		HashSet <String> set = new HashSet<>();
//		PermutationPrint(str,"");
//		int n = 4, m = 2;
//		System.out.println(path(0,0,m,n));
//		System.out.println(tiles(n,m));
//		int n = 4;
//		System.out.println(pairs(n));
		ArrayList<Integer> subsets = new ArrayList<>();
		subset(3,subsets);
	}

}
