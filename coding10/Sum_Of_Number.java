package coding10;

public class Sum_Of_Number {

	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2,3,7));
		System.out.println(sum(2,5,3,3,5,5,6,5,5,7,7,8,4,2,9,4,10));

	}/* method overloading
	same class
	same name
	but different any one(argument number or different datatype)
	*/
	
	public static int sum(int a ,int b) {
		return a+b;
	}
	public static int sum(int a ,int b ,int c) {
		return a+b+c;
	}
	public static int sum(int a ,int b , double c) {
		return (int) (a+b +c);
	}
	public static int sum(int... arr) { // for not knowing number of argument then triple dot argument
		int sum=0;			
		for(int i=0;i<arr.length;i++) { //  treated like array
			 sum+=arr[i];
		}return sum;
	}

}
