package re_coding24;

public class Abstract_Client {

	public static void main(String[] args) {
//		Abstract_Demo ad = new Abstract_Demo();
//		ad.payment();
//		Abstract_Inherit ai = new Abstract_Inherit();
		
		Abstract_Demo ad = new Abstract_Demo() {

			@Override
			public void payment() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int no_of_items() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		ad.no_of_items();

	}

}
