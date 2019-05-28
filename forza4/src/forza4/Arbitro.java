package forza4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*; 

public class Arbitro {
	
	public class ButtonGrid
    {
    private JFrame griglia = new JFrame ("Forza4");
    
    public JFrame getGriglia() 
    {
        return griglia;
    }


    public void setGriglia(JFrame griglia) 
    {
        this.griglia = griglia;
        griglia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public ButtonGrid(int width, int length)
    {
        griglia.setLayout(new GridLayout(width,length));
        for(int y = width-1 ; y >= 0 ; y--)
        {
            for(int x = 0 ; x < length ; x++)
            {
                cella cella = new cella(0);
                griglia.add(cella);
                cella.setBackground(new Color (0 , 50 , 255));
                cella.setCol(x);
                cella.setRaw(y);
                cella.setBorderPainted(false);
                cella.setVisible(true);
                cella.addActionListener(new aggiornaCella());
                cellaList.add(cella);
            }
        }
    
    griglia.setResizable(false);
    larghezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    altezza = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    griglia.setSize(larghezza/2, altezza-altezza/5);
    griglia.setLocation(larghezza/4, altezza/10);
    griglia.setVisible(true);
    
    }
}}
