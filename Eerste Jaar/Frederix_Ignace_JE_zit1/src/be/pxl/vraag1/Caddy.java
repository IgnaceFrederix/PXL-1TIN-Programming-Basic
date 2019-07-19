package be.pxl.vraag1;
//Ignace frederix
import java.time.LocalDate;

public class Caddy implements Printable {

	private int caddyId;
	private LocalDate date = LocalDate.now();
	private int numerofUnits[];
	private int numberOfArticles;
	private static final int MAXIMUM_NUMBER_OF_ARTICLES = 50;
	private static int countId;
	
	{
		countId++;
	}
	
	public Caddy(Customer customer){
		
	}
	
	public void addArticle(Article article, int numberOfArticles){
		
		for (int i = 0; i < numerofUnits.length;i++ ){
		//	if(article.getArticleId().equals(numerofUnits[]. && MAXIMUM_NUMBER_OF_ARTICLES < 50 ))
		}
	}
	
	
	public void print() {
		

	}

}
