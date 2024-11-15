package practice;
public class Book{
	static int totalBook;
	String title;
	String author;
	String bookNo;
	boolean isBorrowed;
	static {
		totalBook =0;
	}
	{
		totalBook++;
	}
	Book( String bookNo , String title , String author  ){
		this.author= author;
		this.bookNo = bookNo;
		this.title = title;
	}
	Book(String bookNo){
		this(bookNo , "unknown" , "unknown" );
	}
	static int totalNo(){
		return totalBook;
	}
	void borrowBook() {
		if (isBorrowed) {
			System.out.println("the book is already borrowed");
		}else {
			this.isBorrowed= true;
			System.out.println("enjoy the book");
		}
	}
	void returnBook() {
		if (isBorrowed) {
			isBorrowed = false;
			System.out.println("hope you enjoy it");
		}else {
			System.out.println("you have not return the book back");
		}
	}
	public static void main (String [] args) {
		Book designBook = new Book("12","design ","author");
		Book books = new Book("122");
		System.out.println(designBook.totalNo());
		designBook.borrowBook();
		designBook.borrowBook();
		designBook.returnBook();
		designBook.returnBook();
		
	}
}









