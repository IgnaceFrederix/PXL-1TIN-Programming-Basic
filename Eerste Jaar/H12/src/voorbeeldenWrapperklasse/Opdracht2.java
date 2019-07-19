package voorbeeldenWrapperklasse;
public class Opdracht2 {
	  public static void main (String args []){

			System.out.println ("min.value = " + Integer.MIN_VALUE);
			System.out.println ("max.value = " + Integer.MAX_VALUE);
			//minimum en maximum waarde van Integer

			Integer iObj = new Integer("1234567"),
				  jObj = new Integer(1234567);
			//methot overloading

			System.out.println("waarden van de integer objecten vergeleken : "
						+ iObj.equals(jObj));
			//waardes van de integers vergelijken

			System.out.println("referenties vergeleken : "
					+ (iObj == jObj));
			//waarde opvragen

			System.out.println("int-waarden vergeleken met constante: "
						+ (iObj.intValue()== 1234567));
			//vergelijkne van int waardes

			System.out.println("int-waarden vd objecten vergeleken : "
					+ (iObj.intValue()== jObj.intValue()));
			//vergelijken van int waardes

			int k=-255;
			Integer kObj=new Integer(k);
			System.out.println(k);
			System.out.println(kObj.toString());
			//zet het object om naar een string
			System.out.println(Integer.toString(k));
			//
			System.out.println(Integer.toString(k,2));
			//
			System.out.println(Integer.toBinaryString(k));
			//
			System.out.println(Integer.toHexString(k));
			//
			System.out.println(Integer.toString(k, 16));
		}

}
