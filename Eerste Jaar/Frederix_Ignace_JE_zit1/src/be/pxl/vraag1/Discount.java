package be.pxl.vraag1;
//Ignace frederix
public enum Discount {
	D5(5),
	NONE(0),
	D_NEW(15),
	D20_MIN50(20),
	D30_MIN100(30);
	
	private int discountRate;
	
	private Discount(int discountRate){
		this.discountRate = discountRate;
	}
	
	public int getDiscountRate(){
		return discountRate;
	}
	
	public double getMinimumPurchaseAmount(){
		if(this.name().contains("MIN50")){
			return 50;
		}else if(this.name().contains("MIN100")){
			return 100;
			
		}else{
			return 0;
		}
	}
	
	public String getDiscountDescription(){
		if(getMinimumPurchaseAmount() == 0){
			return "Kortingsinfo"+ this.name()+ "("+discountRate+ "% korting)";
		}else{
			return "Kortingsinfo"+ this.name()+ "("+discountRate+ "% korting bij een minimum aankoopbedrag van "+getMinimumPurchaseAmount()+")";
		}
		
	}

}
