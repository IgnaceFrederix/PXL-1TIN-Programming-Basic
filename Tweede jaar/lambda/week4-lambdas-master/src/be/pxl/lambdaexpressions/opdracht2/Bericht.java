package be.pxl.lambdaexpressions.opdracht2;

public class Bericht {
	private String tekst;
	
	public Bericht(String tekst) {
		this.tekst = tekst;
	}
	
	public void setMessage(String tekst) {
		this.tekst = tekst;
	}
	
	public String encrypt(Encryptie encriptie) {
		return encriptie.apply(tekst);
	}
}
