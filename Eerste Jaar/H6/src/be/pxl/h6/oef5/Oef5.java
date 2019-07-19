package be.pxl.h6.oef5;
 
public class Oef5 {
 
        public static void main(String[] args) {
                double get = 0;
                System.out.printf("%20s %-20s %20s %20s \n","1. gewoon", "2. links",  "3. Rechts (met nul)", "4.Rechts met 3 dec");
                for(int i=1; i<=9; i++){
                        get = get * 10 + i;
                        System.out.printf("%20f %-20f %020f %20.3f \n", get, get, get, get);
                        
                }
        }
 
}