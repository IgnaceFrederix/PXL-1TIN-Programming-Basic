package opdracht5;

import java.awt.BorderLayout;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JTextField txtField;
	private JTextArea txtArea;
	private JButton btn;
	
	public MyFrame(){
		super("Borderlayout");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		txtField = new JTextField("hier type je een naam");
		txtArea = new JTextArea("hier kan je comentaar typen");
		btn = new JButton("Send");
	}
	private void layoutComponets(){//toevoegen van de componeten
		// layout bepalen sta,daard bij JFrame borderlayout
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		add(txtField, BorderLayout.NORTH);
		add(txtArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}
	

	

}
