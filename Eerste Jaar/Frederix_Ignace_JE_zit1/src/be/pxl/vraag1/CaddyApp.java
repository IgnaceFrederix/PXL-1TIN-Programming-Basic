package be.pxl.vraag1;
//Ignace frederix
public class CaddyApp {

	public static void main(String[] args) {
		Customer klant1 = new Customer("testvoornaam", "testachternaam");
		Caddy caddy = new Caddy(klant1);
		Article artikel1 = new Article("testartikelnaam",10);
		Author auteur1 = new Author("voornaamauteur","achternaamauteur");
		Article boek1 = new Book("idvoorboek",10,"54464484","naamvoorboek",auteur1);
		caddy.addArticle(artikel1,10);
		caddy.addArticle(boek1, 1);
		//klant1.setDiscount(D20_MIN50);
		caddy.print();
		
		
		

	}

}
