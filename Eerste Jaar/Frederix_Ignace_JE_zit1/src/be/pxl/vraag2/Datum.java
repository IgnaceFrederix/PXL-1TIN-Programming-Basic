package be.pxl.vraag2;
//Ignace frederix

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.*;

public class Datum  extends JFrame  {
	
	
	
	public Datum(){
		initComponents();
		layoutComponets();
		initListeners();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	private void initComponents(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	
		
	}
	private void layoutComponets(){

		setLocation(20,20);
		setSize(300,200);
		setLayout(new BorderLayout());
		add(Bottom,BorderLayout.SOUTH);
		add(Left, BorderLayout.WEST);
	}
	
	private void initListeners(){
		
	}
	
	
	

	
	
	

}
