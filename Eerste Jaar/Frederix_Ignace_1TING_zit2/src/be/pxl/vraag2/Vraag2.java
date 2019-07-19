
package be.pxl.vraag2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Vraag2 extends JFrame {
	
	  private JTextField[] inputtext; 
	  private JLabel[] cijfers;
	  private JPanel LeftPanel;
	  private JPanel RightPanel;
	  private JLabel Southpannel;
	  
	  private JPanel Mid;
	    private JButton bgem;
	    private JButton bhoogste;
	    private JButton blaagste;

	   
	    private int aantal;
	    public Vraag2( int aantal) {
	    	this.aantal = aantal;
	    
	       

	        initComponents();
	        setLayout();
	        initActionListeners();

	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	        pack();
	    }
	    
	    private void initComponents() {
	    	 
	         
	       
	       
	    }
	    private void setLayout() {
	    	
	    	LeftPanel = new JPanel();
	         for(int i = 0; i < aantal; i++) {
	            JLabel j = new JLabel(aantal+":");
	         }
	         RightPanel = new JPanel();
	         for(int i = 0; i < aantal; i++) {
	            JTextField j = new JTextField();
	         }
	         Southpannel = new JLabel();
	    
	        setLayout(new BorderLayout());
	        Mid = new JPanel();
	        Mid.setLayout(new GridLayout(1, 3));
	        Mid.add(bgem);
	        Mid.add(bhoogste);
	        Mid.add(blaagste);
	      
	        add(Southpannel, BorderLayout.SOUTH);
	        add(Mid, BorderLayout.CENTER);
	        add(LeftPanel, BorderLayout.WEST);
	        add(LeftPanel, BorderLayout.EAST);
	      
	        
	        
	    }
	    

	        private void initActionListeners() {
	            

	            bgem.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                	
	                Southpannel.setText("5");
	                }
	                
	                }
	            bhoogste.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                Southpannel.setText("5");
	                }
	            }
	                blaagste.addActionListener(new ActionListener() {
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                Southpannel.setText("5");
		                }
		                
		                }
	                
	                }
	            
	                }

}
}
