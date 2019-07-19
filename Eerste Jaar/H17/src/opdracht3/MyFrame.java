package opdracht3;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JButton button;
	
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton(new ImageIcon("button1.png"));
		button.setPressedIcon(new ImageIcon("button2.png"));
		button.setToolTipText("Press me");
		
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		add(button);
	}
	

	

}
