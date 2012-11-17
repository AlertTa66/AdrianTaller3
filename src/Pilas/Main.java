package Pilas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;


public class Main {
	public static void main(String[] args){
        PilaGui pg = new PilaGui();
        pg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pg.setLayout(new GridLayout(5,1));
        pg.setSize(200, 400);
        pg.setVisible(true);
    }
}
