package voorbeelden;

import javax.swing.*;

public class MyFrame  extends JFrame {
	
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
	}
	

	

}
