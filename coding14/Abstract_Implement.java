package coding14;

public class Abstract_Implement {

	public static void main(String[] args) {
//		Abstract_Demo ad = new Abstract_Demo(); // because of abstract u can't use it
//		Payment_Method pay = new Payment_Method(); // now u can use child class
//		pay.no_of_item();
		Abstract_Demo ad = new Abstract_Demo() { // we can use this by doing override on main method 
			
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int no_of_item() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};

	}

}
