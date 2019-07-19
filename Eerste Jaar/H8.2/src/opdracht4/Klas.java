package opdracht4;

public class Klas {

			private String naam;
			private int aant;
			public static final int max ;
			private static int count = 0;
			private static int totStudent=0;
			static {
				max =40;
			}
			public Klas(){
				this("1TINx",0);

			}
			
			{
				count++;
			}
			
			public Klas(String naam, int aant){
				this.naam = naam;
				setAant(aant);
			}

			public String getNaam() {
				return naam;
			}

			public void setNaam(String naam) {
				this.naam = naam;
			}

			public int getAant() {
				return aant;
			}

			public void setAant(int aant) {
				totStudent = totStudent-this.aant;
				if(aant > max){
					this.aant = max;
					}else{
						this.aant = aant;
					}
				totStudent = totStudent+this.aant;
				
			}
			public static int getCount(){
				return count;
			}
			public static int getTotStud(){
				return totStudent;
			}
			

}
