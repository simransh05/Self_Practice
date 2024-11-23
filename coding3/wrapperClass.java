package coding3;

public class wrapperClass {

	public static void main(String[] args) {
		int a = 9; // Primitive data type
		Integer a1 =91; // wrapper class
		System.out.println(a);
		System.out.println(a1);
		// auto boxing
		a1=a;
		System.out.println(a1);
		
		// on boxing 
		int b =19;
		Integer b1= 123;
		b=b1;
		System.out.println(b);
		Integer c1 = 18;
		Integer c2 =18;
		Integer c3 =189;
		Integer c4 = 189;
		System.out.println(c1==c2); // true  
//		Cache(no duplicate) range(-128 to 127) 
		System.out.println(c3==c4); // false

	}
}
