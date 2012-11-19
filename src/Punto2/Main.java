package Punto2;

import java.awt.FlowLayout;
import javax.swing.JFrame;


public class Main {
	public static void main(String[] args){
        PilaGui2 pg = new PilaGui2();
        pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pg.setLayout(new FlowLayout());        
        pg.setSize(500, 250);
//        pg.pack();
        pg.setVisible(true);
    }
}
