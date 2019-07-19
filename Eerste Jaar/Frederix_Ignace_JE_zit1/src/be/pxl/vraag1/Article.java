package be.pxl.vraag1;

//Ignace frederix

public class Article implements Printable, Saleable  {
	
	private String articleId;
	private double price;
	private static final int BTW_PERCENTAGE = 6;
	
	public Article(String id, double price) {
		this.articleId = id;
		this.price = price;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print(){
		System.out.println("Artikel:" + articleId + "   "+ calculatePrice()+ " euro");
	}
	
	public double calculatePrice(){
		return price*1.06;
	}
	
	public boolean equals(Article artikel1, Article artikel2) {
		if(artikel1.articleId == artikel2.articleId){
			return true;
		}else{
			return false;
		}
		
		
	}

}
