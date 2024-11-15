package Nested;

public class LiberaryItem {
	private String id;
	private String author;
	private String title;
	
	public void checkout(String id) {
		System.out.println("checkout");

	}
	public void returnItem(String id){
		System.out.println("returned");
	}
	
	public class book{
		private String ISBN;
	}
	public class Magazine{
		private int issueNum;
	}
	public class DVD{
		private String duration;
	}

}
