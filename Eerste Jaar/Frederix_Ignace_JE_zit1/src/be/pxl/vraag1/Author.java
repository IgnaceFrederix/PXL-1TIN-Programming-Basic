package be.pxl.vraag1;
//Ignace frederix
public class Author extends Person implements Printable {
	
	private String authorId;

	public Author(String firstName, String lastName) {
		super(firstName, lastName);
		
	}
	
	public String getAuthorId(){
		StringBuilder naamMaken = new StringBuilder();
		naamMaken.append(getFirstName().substring(0,2)).append(getLastName().substring(0,2));
		authorId = naamMaken.toString();
		return authorId;
	}

	
	public void print() {
		System.out.println("Auteur: "+ super.getFirstName() + super.getLastName()+" (" + authorId +")" );
		
	}
	
	

}
