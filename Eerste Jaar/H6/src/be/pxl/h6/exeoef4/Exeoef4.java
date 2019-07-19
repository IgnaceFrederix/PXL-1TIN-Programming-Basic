package be.pxl.h6.exeoef4;

public class Exeoef4 {

	public static void main(String[] args) {
		StringBuilder abc = new StringBuilder();
		StringBuilder aBc = new StringBuilder();
		char test;
		for(char i ='a'; i <= 'z'; i++)
		{
			abc = abc.append(i);
			
			if( i =='h')
			{
				aBc = aBc.append('X');
				i++;
			}
			if(abc.length()%2 ==0)
			{
				test = Character.toUpperCase(i);
				aBc = aBc.append(test);
			
			}
		
			
		}
		System.out.println(abc);
	

	}

}
