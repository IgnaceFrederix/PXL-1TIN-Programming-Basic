package opdracht6;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JRadioButton rbtnS,rbtnM,rbtnL;
	
	public MyFrame(){
		super("FlowLayout");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		rbtnS = new JRadioButton("Small");
		rbtnM = new JRadioButton("Medium");
		rbtnL = new JRadioButton("Large");
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnS);
		group.add(rbtnM);
		group.add(rbtnL);
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		setLayout(new FlowLayout());
		add(rbtnS);
		add(rbtnM);
		add(rbtnL);
	}
	

	

}
