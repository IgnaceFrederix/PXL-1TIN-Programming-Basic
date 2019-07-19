package be.pxl.student.vraag2;

import java.awt.Point;
import java.util.Scanner;

public class Vraag2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 Point p1 = new Point();
		 Point p2 = new Point();
		 StringBuilder punt1 = new StringBuilder();
		 StringBuilder punt2 = new StringBuilder();
		 int [] pos = new int [4];
				
				System.out.print("Punt 1 x:");
				pos[0] = input.nextInt();
				
				System.out.print("Punt 1 y:");
				pos[1] = input.nextInt();
				
				System.out.print("Punt 2 x:");
				pos[2] = input.nextInt();
				
				System.out.print("Punt 2 y:");
				pos[3] = input.nextInt();
			
			p1.x = pos[0];
			p1.y = pos[1];
			p2.x = pos[2];
			p2.y = pos[3];
			for(int i= 1; i< p1.y; i++){
				punt1 = punt1.append("\n");
			}
			for(int i= 1; i< p1.x; i++){
				punt1 = punt1.append(" ");
			}
			
			for(int i= 1; i< p2.y; i++){
				punt2 = punt2.append("\n");
			}
			for(int i= 1; i< p2.x; i++){
				punt2 = punt2.append(" ");
			}
			
			punt1 = punt1.append("p");
			punt2 = punt2.append("p");
			System.out.println("Resultaat:");
			
			if(p1.x > p2.x || p1.y > p2.y){
				System.out.print(punt2);
				System.out.print(punt1);
			}else if(p1.equals(p2)){
				System.out.print(punt1);
			}else{
				System.out.print(punt1);
				System.out.print(punt2);
				
			}
			
			
			
			input.close();

	}

}
