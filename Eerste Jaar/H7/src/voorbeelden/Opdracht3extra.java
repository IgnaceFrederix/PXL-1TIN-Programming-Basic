package voorbeelden;

public class Opdracht3extra {

	public static void main(String[] args) {
		char[][] letter;
		letter = new char [5][];
		for(int i = 0; i < letter.length; i++){
			letter[i] = new char[i+1];
		}
		char hulp;
		for(int i = 0; i < letter.length; i++){
			hulp = 'A';
			for(int j =0; j <= i; j++){
				letter[i][j]= hulp++;
			}
		}
		for(int i = 0; i < letter.length; i++){
			
			for(int j =0; j <= i; j++){
				System.out.println(letter[i][j]);
			}
			System.out.println();
		}
	}

}
