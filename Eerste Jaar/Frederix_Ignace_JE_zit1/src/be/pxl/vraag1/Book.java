package be.pxl.vraag1;
//Ignace frederix
public class Book extends Article {
	
	private String isbn;
	private String title;

	public Book(String id, double price, String isbn, String title, Author author) {
		super(id, price);
		this.isbn = isbn;
		this.title = title;
		
		
	}
	
	public void print(){
		super.print();
		System.out.println("isbn: "+ isbn);
		System.out.println("titel: "+ title);
		
	}

}
