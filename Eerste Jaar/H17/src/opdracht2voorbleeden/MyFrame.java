package opdracht2voorbleeden;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JLabel label;
	
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon ok = new ImageIcon("ok-icon.png");
		label = new JLabel("OK",ok,JLabel.LEFT);
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		add(label);
	}
	

	

}
