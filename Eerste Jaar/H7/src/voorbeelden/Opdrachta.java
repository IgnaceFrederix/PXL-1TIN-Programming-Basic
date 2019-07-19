package voorbeelden;

public class Opdrachta {

	public static void main(String[] args) {
		int [] array = new int [20];	
		for(int i =0; i < array.length; i++)
		{
			array[i]= i*7;
		}
		for(int getal: array)
		{
			System.out.println(getal);
		}
		
		boolean [] array2 ={true,false,false,true,true};
		for(boolean b: array2){
			System.out.println(b);
		}

	}

}
