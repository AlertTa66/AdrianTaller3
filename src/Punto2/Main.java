package Punto2;

import Punto2.PilaGui;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;


public class Main {
	public static void main(String[] args){
        PilaGui pg = new PilaGui();
        pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pg.setLayout(new FlowLayout());        
        pg.pack();
        pg.setVisible(true);
    }
}
