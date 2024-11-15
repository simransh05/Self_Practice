package Practice1;

import java.util.*;
public class Recursion {
	static int factorial(int n) {
		if (n==0 || n ==1) {
			return 1;
		}return n*factorial(n-1);
	}
	static void print(int n) {
		if (n==6) {
			return;
		}System.out.println(n);
		print(n+1);
	}
	static int sum(int n, int sum) {
		if(n==0) {
			return sum;
		}sum+=n;
		return sum(n-1,sum);
	}
	static void fib(int a , int b,int n) {
		if (n==0) {
			return ;
		}System.out.println(a);
		fib (b,a+b,n-1);
	}
	static int pow(int x , int n) {
		if (n==1) {
			return x;
		} return x*pow(x,n-1);
	}
	static int powLogn(int x , int n) {
		if (n==0) {
			return 1;
		}if (n%2==0) {
			return powLogn(x,n/2) * powLogn(x,n/2);
		}else {
			return x*powLogn(x,n/2)*powLogn(x,n/2);
		}
	}
	static void printNum (int n) {
		for (int i =1;i<=n;i++) {
			System.out.println(i);
			}
	}
	static void printWhile(int n) {
		int i =1;
		while(i!=n+1)
		{
			System.out.println(i);
			i++;
		}
	}
	static void printDo(int n) {
		int i =7;
		do {
			System.out.println(i);
			i++;
		}while (i<=n);
	}
	static void printRev(String str , int indx) {
		if (indx==0) {
			System.out.print(str.charAt(indx));
			return;
		}System.out.print(str.charAt(indx));
		printRev(str , indx-1);
	}
	static int first =-1; static int last =-1;
	static void occurence(String s ,int indx, char target) {
		if (indx ==s.length()) {
			System.out.println(first );
			System.out.println(last );
			return ;
		}
		 char currentChar = s.charAt(indx);
		if (currentChar == target) {
			if (first == -1) {
				first = indx;
			}else {
				last = indx;
			}
		}occurence(s,indx+1,target);
	}
	public static boolean checkIfIncreasing(int arr[], int idx) {

		if(idx == arr.length-1) {
		return true;
		}
		if(!checkIfIncreasing(arr, idx+1)) {
		return false;
		}
		return arr[idx] < arr[idx + 1];
		}
	static void moveAllX(String str , int indx , int count , String newStr) {
		if (indx == str.length()) {
			for (int i =0;i<count;i++) {
				newStr +='x';
			}
			System.out.println(newStr);
			return ;
		}
		char currentChar = str.charAt(indx);
		if (currentChar == 'x') {
			count+=1;
			moveAllX(str,indx+1,count,newStr);
		}else {
			newStr+=currentChar;
			moveAllX(str,indx+1,count,newStr);
		}
	}
	static boolean[] map = new boolean[26];
	static void removeDup(String str , int indx , String newStr,HashSet<String>set) {
		if (indx == str.length()) {
			if (set.contains(newStr)) {
				return ;
			}else {
				set.add(newStr);
				System.out.println(newStr);
//				set.add(newStr);
				return;
			}
		}
		char currentChar = str.charAt(indx);
		if (map[currentChar-'a']) {
			removeDup(str,indx+1,newStr,set);
		}else {
			newStr +=currentChar;
			map[currentChar-'a'] = true;
			removeDup(str,indx+1,newStr,set);
		}
	}
	static void subsequence(String str , int indx , String newStr, HashSet<String> set) {
		if (indx == str.length()) {
			if (set.contains(newStr)) {
				return ;
			}else {
				set.add(newStr);
				System.out.println(newStr);
				return;
			}
		}
		char currentChar = str.charAt(indx);
		subsequence(str , indx+1,newStr+currentChar,set);
		subsequence(str,indx+1,newStr,set);
	}
	static String [] keyword = {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
	static void keywordPrint(String str , int indx , String combination) {
		if (indx == str.length()) {
			System.out.println(combination);
			return ;
		}
		char currentChar = str.charAt(indx);
		String mapping = keyword[currentChar-'0'];
		for (int k =0;k<mapping.length();k++) {
		keywordPrint(str,indx+1,combination+mapping.charAt(k));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the value : " );
//		int n = sc.nextInt();
		sc.close();
//		System.out.println(factorial(5));
//		print(1);
//		System.out.println(sum(5,0));
//		fib(0,1,5);
//		System.out.println(pow(2,10));
//		System.out.println(powLogn(2,10));
//		printNum(5);
//		printWhile(n);
//		printDo(n);
//		String str = "abcd";
//		printRev(str,str.length()-1);
//		occurence("ababcabac",0,'a');
//		int []arr = {1,2,3,4,5};
//		System.out.println(checkIfIncreasing(arr,0));
//		moveAllX("axbcxxd",0,0,"");
//		String str = "abbccda";
//		removeDup(str,0,"");
//		String str = "aaa";
//		HashSet <String>set= new HashSet<>();
//		subsequence(str,0,"",set);
		keywordPrint("23" , 0 ,"");
//		
	}

}
