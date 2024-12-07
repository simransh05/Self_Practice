package coding10;

public class Client {
	public static void main(String[] args) {
		// case 1
//		Parent p = new Parent();
//		System.out.println(p.d);
//		System.out.println(p.d1);
//		p.fun();
//		p.fun2();
		

		// case 2 use when update the code for payment method in paytm 
//		Parent p = new Child();
//		System.out.println(p.d); //1
//		System.out.println(p.d1); // 10
//		System.out.println(((Child)(p)).d2);// type casting //20
//		System.out.println(((Child)(p)).d); //  2
//		p.fun(); // common in both use the child class then override for 100%  
//		p.fun2();
//		((Child)(p)).fun1();
		
		
		// case 3 child ->parent XXXX
//		Child c = new Parent(); // *java does not allow this case* 
//		System.out.println(c.d);
//		System.out.println(c.d1);
//		System.out.println(c.d2); //( run time error ) 
		
		// case 4
		Child c = new Child();
		System.out.println(c.d); // 2
		System.out.println(c.d1);
		System.out.println(c.d2);
		System.out.println(((Parent)(c)).d); //1
		c.fun(); //fun in child class
		c.fun1();
		c.fun2();
		((Parent)(c)).fun(); //fun in child class because 

		
	}
}
