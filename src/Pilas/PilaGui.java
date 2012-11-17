
package Pilas;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class PilaGui extends JFrame

{
    //declaracion elementos de mi frame
    
    private JButton agregar, eliminar, ordenaMayoraMenor, ordenaMenorMayor, invertirLista;
    
    PilaGui() {
    
        super("Pilas"); // Llama al constructor de jframe que asigna titulo a la ventana
        
        //instanciamos los objetos
        
        agregar = new JButton("Agregar");
        eliminar = new JButton("Eliminar");
        ordenaMayoraMenor = new JButton("Ordenar de mayor a menor");
        ordenaMenorMayor = new JButton("Ordenar de menor a mayor");
        invertirLista = new JButton("Invertir Lista");
        
        Container contenedor = getContentPane();
        
        //agregar elementos al contenedor
        contenedor.add(agregar);
        contenedor.add(eliminar);
        contenedor.add(ordenaMayoraMenor);
        contenedor.add(ordenaMenorMayor);
        contenedor.add(invertirLista);
        
        
      
        
        
        
    }
}
