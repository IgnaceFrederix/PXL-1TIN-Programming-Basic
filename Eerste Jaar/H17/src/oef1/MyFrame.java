package oef1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
    private JLabel celsius;
    private JTextField txtcel;
    private JButton convert;
    private JLabel fahrenheit;
    private JLabel conversies;
    private JLabel converts;
    
    public MyFrame(){
        super("Converter");
        initComponents();
        layoutComponents();
        initListeners();
        setVisible(true);
    }


    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        celsius = new JLabel("Celsius: ");
        txtcel = new JTextField();
        convert = new JButton("Convert");
        fahrenheit = new JLabel("0");
        conversies = new JLabel("Aantal conversies: ");
        converts = new JLabel("0");
        
    }

    private void layoutComponents() {
        setLocation(20,20);
        setSize(300,150);
        setLayout(new GridLayout(3,2));
        add(celsius);
        add(txtcel);
        add(convert);
        add(fahrenheit);
        add(conversies);
        add(converts);
        
    }
    
    private void initListeners() {
        ActionListener action = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent av) {
                double hulp = 32 + (Integer.parseInt(txtcel.getText())*1.80);
                fahrenheit.setText(hulp+"");
                int prevConv = Integer.parseInt(converts.getText());
                converts.setText(prevConv+1 + "");
                
            }
            
        };
        
            convert.addActionListener(action);
            
        
        
    }
    
}