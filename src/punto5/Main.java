
package punto5;

import javax.swing.JFrame;

public class Main 
{
    

  public static void main (String args[]){
        TelefoniaGui telefonia = new TelefoniaGui();
        telefonia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telefonia.setSize(300,250);
        telefonia.setResizable(false); //no se pueda cambiar el tamaño al frame
        telefonia.setVisible(true);
    }
}
