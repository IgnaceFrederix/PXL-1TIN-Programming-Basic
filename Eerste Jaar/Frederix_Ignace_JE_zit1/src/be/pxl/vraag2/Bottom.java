package be.pxl.vraag2;
//Ignace frederix

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDate;

import javax.swing.*;

public class Bottom  extends JFrame  {
	
	private JButton eersteJarige;
	private JButton berekenLeeftijd;
	private JRadioButton injaren;
	private JRadioButton indagen;
	
	public Bottom(){
		initComponents();
		layoutComponets();
		initListeners();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	private void initComponents(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		eersteJarige = new JButton("eerste jarige");
		berekenLeeftijd = new JButton("bereken leeftijd");
		injaren = new JRadioButton("in jaren");
		indagen = new JRadioButton("in dagen");
		ButtonGroup group = new ButtonGroup();
		group.add(injaren);
		group.add(indagen);
		
		
		
		
	
		
	}
	private void layoutComponets(){
		setLayout(new FlowLayout());
		add(eersteJarige);
		add(berekenLeeftijd);
		add(injaren);
		add(indagen);
		
	}
	
	private void initListeners(){
		
		eersteJarige.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				LocalDate test[];
				int eerste=366;
				LocalDate vandaag =  LocalDate.now(); 
				int getal;
				for (LocalDate l : test){
					if((vandaag.getDayOfYear() - l.getDayOfYear())<0 ){
					getal =vandaag.getDayOfYear() - l.getDayOfYear() + 365;	
					}else{
						getal = vandaag.getDayOfYear() - l.getDayOfYear();
					}
				if(eerste > getal ){
					
				}
					eerste = getal;
				}
			//	eerste.Color.RED;
				

			}});
		
		berekenLeeftijd.addActionListener(new ActionListener() throws Execption{
			public void actionPerformed(ActionEvent event) {
				LocalDate vandaag =  LocalDate.now();
				if(l.toEpochDay() > vandaag.toEpochDay()){
					throw new Exception("datum 3 is in de toekomst");
				}
					
				
				LocalDate test[];
				
				int jaren;
				long dagen;
				Instant nu = Instant.now();
				Instant begin = Instant.EPOCH;
				
			
				for(LocalDate l : test){
					if(injaren.isSelected()){
						jaren = vandaag.getYear() - l.getYear();
					}else{
					
						dagen = l.toEpochDay() - vandaag.toEpochDay();
					}
				}
			}
		});
		
		
	}
	
	
	

	
	
	

}
