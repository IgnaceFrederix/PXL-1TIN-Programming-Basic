package opdracht2;
public class Opdracht2 {
	  public static void main (String args []){

			System.out.println ("min.value = " + Integer.MIN_VALUE);
			System.out.println ("max.value = " + Integer.MAX_VALUE);
			//minimale en maximale waarde -2^31 en 2^32-1

			Integer iObj = new Integer("1234567");
			
			Integer jObj = new Integer(1234567);
			// 2 construros =consturctor overloading

			System.out.println("waarden van de integer objecten vergeleken : "
						+ iObj.equals(jObj));
			//true inhoud word vergeleken

			System.out.println("referenties vergeleken : "
					+ (iObj == jObj));
			//false refernatie sworden vergelijken

			System.out.println("int-waarden vergeleken met constante: "
						+ (iObj.intValue()== 1234567));
			//intvalue integer int hoeft eigenlijk niet omwille van autounboxing

			System.out.println("int-waarden vd objecten vergeleken : "
					+ (iObj.intValue()== jObj.intValue()));
			//

			int k=255;
			Integer kObj=new Integer(k);
			System.out.println(k);
			System.out.println(kObj.toString());
			//waarde afgdrukt
			System.out.println(Integer.toString(k));
			//int => String gemakkelijker k+""
			System.out.println(Integer.toString(k,2));
			//binaire voorstelling van k < 0 bvb -45 binaiere voorstelliing van 45 met - der voor
			System.out.println(Integer.toBinaryString(k));
			//binairae voorsteliing van k (2 complimentsvooiorstelling
			System.out.println(Integer.toHexString(k));
			//hexaddeciiamel voorstelling van k (2 complimenscoorstelling
			System.out.println(Integer.toString(k, 16));
			//hexadecimeale voorstelling van k < 0 bvb -45 binaiere voorstelliing van 45 met - der voor
		}

}
