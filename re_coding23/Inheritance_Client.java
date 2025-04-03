package re_coding23;

public class Inheritance_Client {

	public static void main(String[] args) {
//		case 1
		/*Parent p = new Parent();
		System.out.println(p.d);
		System.out.println(p.d1);
		p.fun();
		p.fun1();
		*/
//		case 2
		/*Parent obj = new Child();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(((Child)(obj)).d2);
		System.out.println(((Child)(obj)).d);
		obj.fun();
		obj.fun1();
		((Child)(obj)).fun2();
		*/
//		case 3
//		Child obj = new Parent(); error because space only for parent class 
		
//		case 4
		Child obj = new Child();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(((Parent)(obj)).d);
		obj.fun();
	}

}
