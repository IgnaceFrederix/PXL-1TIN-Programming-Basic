package be.px.h82.oef1;

public class autoApp {

	public static void main(String[] args) {
		
		auto auto1 = new auto("testmerk","testmodel",1995,"geel",150);
		auto auto2 = new auto ("test","testmodel",1950,"rood",200);
		auto auto3 = new auto ("test3","testmodel2",1588,"blauw",200);
		System.out.println(auto.getCount());
		System.out.printf("%.1f %% \n",100-((double)auto.getPerc()/auto.getCount()*100.0));
		//auto []lijst = new auto[3];
		auto[] lijst = {auto1,auto2,auto3};
		lijst[0] = auto1;
		lijst[1]= auto2;
		lijst[2]= auto3;
		for(auto Auto : lijst){
			Auto.print();
	
		}
	}

}
