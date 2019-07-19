package voorbeelden;

public class Opdracht1a4bis {

	public static void main(String[] args) {
		int [] nummer = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		for(int getal : nummer){
			System.out.print(getal +" ");
		}
		System.out.println();
		for (int i = nummer.length -1; i >=0; i--){
			System.out.print(nummer[i]+" ");
		}
		

	}

}
