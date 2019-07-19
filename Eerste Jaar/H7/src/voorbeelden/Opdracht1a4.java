package voorbeelden;

public class Opdracht1a4 {

	public static void main(String[] args) {
		int [] nummer = new int [10];
		for(int i = 0; i < nummer.length; i++){
			nummer [i] = i*2+1;
		}
		for(int i = 0; i< nummer.length; i++){
			System.out.print(nummer[i] +" ");
		}
		System.out.println();
		for (int i = nummer.length -1; i >=0; i--){
			System.out.print(nummer[i]+" ");
		}
		

	}

}
