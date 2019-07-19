package be.pxl.opdracht8.shapes;

public class Drawing {
	private Shapes[]shapes;
	
	
		public Drawing( int aant){
			shapes = new Shapes[aant];
		}
		
		private boolean isPresent(Shapes s){
			for(int i=0; i < shapes.length; i++){
				if(s.equals(shapes[i]))
					return true;
			}
			return false;
		}
		
		private int getFreeLocation(){
			for(int i =0; i < shapes.length; i++){
				if(shapes[i] == null){
					return i;
				}
			}
			return -1;
		}

		public void add(Shapes s){
			if(!isPresent(s)){
				if(getFreeLocation() != -1){
					shapes[getFreeLocation()]=s;
				}else{
					System.out.println("geen beschikbare plaats gevonden");
				}
			}
			else{
				System.out.println("figuur komt reeds voor");
			}
		}
		public void remove(Shapes s){
			for(int i=0; i < shapes.length; i++){
				if(s.equals(shapes[i])){
					shapes[i]=null;
					i= shapes.length;
				}
			}
		}
		public void clear(){
			int gr = shapes.length;
			shapes = new Shapes[gr];
		}
		
		
		public void print(){
			for(Shapes s : shapes){
				if(s!= null){
					System.out.println(s);
				}
			}
		}
		
		
		
		
}
