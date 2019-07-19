package be.pxl.vraag2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;
import javax.swing.*;

public class MyFrame  extends JFrame {
	private JTextField uitkomst;
	private JButton [] sym;
	private JPanel west;
	private JPanel oost;
	private JComboBox combo;
	private JButton ok;
	private final static char[] SYMBOLEN= {'a','b','c','d','+','"'};
	private final static int AANTALRIJEN = 3;
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		initListeners();
		setVisible(true);
		
	}
	
	

	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		sym = new JButton[5];
		
		for(int i =0; i< sym.length; i++){
			sym[i]= new JButton(SYMBOLEN[i]);
			
		}
		west = new JPanel();
		uitkomst = new JTextField();
		String [] mogelijkheden = {"verdubbel","wis","hoofdletters"};
		combo = new JComboBox<String>(mogelijkheden);
		
		
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(400,300);
		ok = new JButton("ok");
		west.setLayout(new GridLayout(3,2));
		for(int i = 0; i<sym.length;i++){
			west.add(sym[i]);
		}
		oost.add(combo,ok);
		add(west,BorderLayout.WEST);
		add(uitkomst, BorderLayout.NORTH);
		add(oost, BorderLayout.EAST);
		
	}
	
	private void initListeners() {
		ActionListener action = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = e.getActionCommand();
					uitkomst.setText(uitkomst.getText()+txt);
					if(combo.toString().equals("wis")){
						uitkomst.setText(" ");	
					}
					if(combo.toString().equals("verdubbel")){
						uitkomst.setText(uitkomst + uitkomst.toString()+"");
					}
					if(combo.toString().equals("hoofdletters"){
						uitkomst.setText(uitkomst.toString().toUpperCase());
					}
			
	};
	for(int i = 0; i < sym.length; i++){
		sym[i].addActionListener(action);
		sym[i].setActionCommand(SYMBOLEN[i]);
	}
	
		

		}
	}
}


