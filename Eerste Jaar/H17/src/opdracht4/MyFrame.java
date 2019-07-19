package opdracht4;

import javax.swing.*;

public class MyFrame  extends JFrame {
	
	private JScrollPane paneel;
	
	
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		String hulp = "gdfhfdhdfgdlgjflgsglrifsngjldgndlrgnsdlkgnfrtkgensglrgrlgdmhdthdhthdhdhdhdhthddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"+
		"fsxdvgxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdfdgfdgsgsgsgsgfsgsggsgsfgsgfrgrdgfgsdggsgfsgffgdggsfdgsgg"+
				"dfssssssssssssssssssssssss";
		JTextArea txt = new JTextArea(hulp);
		paneel = new JScrollPane(txt);
		
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		add(paneel);
	}
	

	

}
