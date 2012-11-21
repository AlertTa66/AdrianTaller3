    
package Punto2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PilaGui extends JFrame implements ActionListener

{
    //declaracion elementos de mi frame
    
    private JButton agregar, eliminar, ordenaMayoraMenor, ordenaMenorMayor, invertirLista, imprimir;
    private Pila pila;
    PilaGui() {
    
        super("Pilas"); // Llama al constructor de jframe que asigna titulo a la ventana
        
        //instanciamos los objetos y agregamos sus escuchas
         pila = new Pila();
        agregar = new JButton("Agregar");
        agregar.addActionListener(this);
        eliminar = new JButton("Eliminar");
        eliminar.addActionListener(this);
        ordenaMayoraMenor = new JButton("Ordenar de mayor a menor");
        ordenaMayoraMenor.addActionListener(this);
        ordenaMenorMayor = new JButton("Ordenar de menor a mayor");
        ordenaMenorMayor.addActionListener(this);
        invertirLista = new JButton("Invertir Lista");
        invertirLista.addActionListener(this);
        imprimir = new JButton("Imprimir");
        imprimir.addActionListener(this);
        
        Container contenedor = getContentPane();
        Panel panel = new Panel(new GridLayout(6,1));
       
        //agregar elementos al contenedor
        panel.add(agregar);
        panel.add(eliminar);
        panel.add(ordenaMayoraMenor);
        panel.add(ordenaMenorMayor);
        panel.add(invertirLista); 
        panel.add(imprimir);     
        
        contenedor.add(panel);
        
    }

    public void actionPerformed(ActionEvent e)
    {
    
        if (e.getSource() == agregar )
        {
          
           String cedula = JOptionPane.showInputDialog("Digite el numero de cedula");
           String nombre = JOptionPane.showInputDialog("Digite el numero de nombre");
           String apellidos = JOptionPane.showInputDialog("Digite el numero de apellidos");
           String salario = JOptionPane.showInputDialog("Digite el numero de salario");
           
           if(!cedula.equals("")&&!nombre.equals("")&&!apellidos.equals("")
                   &&!salario.equals("")){
//              pila.push(cedula, nombre, apellidos, salario); 
           }else{
           JOptionPane.showMessageDialog(null, "Objeto no insertado, debe insertar todos los datos, vuelva  intentarlo");
           }
        }
        
        if (e.getSource() == eliminar)
        {
              if (!pila.estaVacia()){
                  pila.pop();
              }
        }
        
        if (e.getSource()==imprimir)
        {
             if (!pila.estaVacia())
            JOptionPane.showMessageDialog(null, pila.imprimir());
             else {
                    JOptionPane.showMessageDialog(null, "Pila vacía");
             }
        }
        
        if (e.getSource()==ordenaMayoraMenor)
        {
             if (!pila.estaVacia())
                 pila.ordenarDesc();
             else {
                 JOptionPane.showMessageDialog(null, "Pila vacía");
             }
        }
        
        if (e.getSource()==ordenaMenorMayor)
        {
             if (!pila.estaVacia())
                 pila.ordenarAsc();
             else {
                 JOptionPane.showMessageDialog(null, "Pila vacía");
             }
        }
        
        if (e.getSource()==invertirLista)
        {
             if (!pila.estaVacia())
                 pila.invertir();
             else {
                 JOptionPane.showMessageDialog(null, "Pila vacía");
             }
        }
        
        
    }
}

