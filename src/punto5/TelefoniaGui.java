
package punto5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelefoniaGui extends JFrame implements ActionListener
{
    private JLabel labelArea;
    private JLabel labelTelefono;
    private JLabel labeDuracion;
    private JLabel labelCabina;
    private JTextField campoTelefono;
    private JTextField campoDuracion;
    private JComboBox comboArea;
    private JComboBox comboCabina;
    private JButton botonRegistrar;
    private JButton botonCalcularTotal;
    private ListaMinxArea llamadaxMinuto;
    private ListaLlamada llamada;
   
    public TelefoniaGui()
    {
     super ("Telefonia");  
     
     setLayout(new FlowLayout());
     
     labelArea = new JLabel("Código de Área");
     labelTelefono = new JLabel("Teléfono Destino");
     labeDuracion = new JLabel("Duración Llamada");
     labelCabina = new JLabel("Número de Cabina");
     
     campoTelefono = new JTextField();
     campoDuracion = new JTextField();
     
     String areas[] = {"1", "2","3","4"};
     String cabinas[] = {"Cabina 1", "Cabina 2", "Cabina 3"};
     comboArea = new JComboBox(areas);
     comboCabina = new JComboBox(cabinas);
     llamada = new ListaLlamada("llamada");     
     botonRegistrar =  new JButton("Registrar Llamada");
     botonRegistrar.addActionListener(this);
     
     botonCalcularTotal = new JButton("Calcular Total");
     botonCalcularTotal.addActionListener(this);
     
     JPanel panel =  new JPanel(new GridLayout(5,2,5,5)); //gridlayout recibe num col, filas, espacio horizont, y vertical
     panel.add(labelArea);
     panel.add(comboArea);
     panel.add(labelTelefono);
     panel.add(campoTelefono);
     panel.add(labeDuracion);
     panel.add(campoDuracion);
     panel.add(labelCabina);
     panel.add(comboCabina); 
//     panel.add(botonRegistrar); 
     
    add(panel);  
    add(botonRegistrar); 
    add(botonCalcularTotal); 
     
     asignarTarifaxCabina();
         
    }
     
    public void asignarTarifaxCabina()
    {
        llamadaxMinuto = new ListaMinxArea("llamada x minuto");
        llamadaxMinuto.insertarCima(01, 100);
        llamadaxMinuto.insertarCima(02, 200);
        llamadaxMinuto.insertarCima(03, 300);
        llamadaxMinuto.insertarCima(04, 1000);
        
    }
    
    public void registrarLlamada()
    {   
        
        int codigoArea;
        String telefono;
        int duracion;
        String nroCabina;           
                            
             codigoArea = Integer.parseInt((String)comboArea.getSelectedItem()); //casting a string y parseo a integer
             telefono =  campoTelefono.getText();
             duracion =  Integer.parseInt(campoDuracion.getText());
             nroCabina = String.valueOf(comboCabina.getSelectedIndex()+1); // mas uno por que el index empieza en 0
           
            llamada.insertarCima(codigoArea, telefono, telefono, duracion, nroCabina);
            NodoMinxArea nodoMinxArea = llamadaxMinuto.buscarNodo(codigoArea);
            nodoMinxArea.getValorMinuto();

            // Calcular valor Llamada

            int valorLlamar = duracion * nodoMinxArea.getValorMinuto();
             System.out.print("cantidad de nodos "+llamada.cantidadNodos());
            JOptionPane.showMessageDialog(null, "El valor de la llamada es " + valorLlamar);
            limpiarCampos();
        }
    
    public void calcularTotal()
    {
        int minLlamadaArea1 = 0;
        int minLlamadaArea2 = 0;
        int minLlamadaArea3 = 0;
        int minLlamadaArea4 = 0;

        int minLlamadaCabina1 = 0;
        int minLlamadaCabina2 = 0;
        int minLlamadaCabina3 = 0;

        int dineroLlamadasCabina1 = 0;
        int dineroLlamadasCabina2 = 0;
        int dineroLlamadasCabina3 = 0;
        int TotalDineroRecolectado = 0;
        
        System.out.print("cantidad de nodos "+llamada.cantidadNodos());
        while (llamada.next()) {
            int codigoArea;
            codigoArea = (llamada.getActual()).getCodigoA();
            NodoMinxArea nodoMinxArea = llamadaxMinuto.buscarNodo(codigoArea);
            
            //Cantidad de dinero recolectado.
            TotalDineroRecolectado += nodoMinxArea.getValorMinuto() * llamada.getActual().getDuracion();
            System.out.println(TotalDineroRecolectado);
            
            System.out.println("Codigo area "+llamada.getActual().getCodigoA());
            //Cantidad de dinero recolectado por área.
            if (llamada.getActual().getCodigoA() == 01) {
                minLlamadaArea1 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().getCodigoA() == 02) {
                minLlamadaArea2 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().getCodigoA() == 03) {
                minLlamadaArea3 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().getCodigoA() == 04) {
                minLlamadaArea4 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }

            if (Integer.parseInt(llamada.getActual().nroCabina) == 1) {
                minLlamadaCabina1 += llamada.getActual().duracion;
                dineroLlamadasCabina1 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (Integer.parseInt(llamada.getActual().nroCabina) == 2) {
                minLlamadaCabina2 += llamada.getActual().duracion;
                dineroLlamadasCabina2 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (Integer.parseInt(llamada.getActual().nroCabina) == 3) {
                minLlamadaCabina3 += llamada.getActual().duracion;
                dineroLlamadasCabina3 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
       }
        String resultado ="Cantidad de dinero recolectado :  $"+TotalDineroRecolectado
                + "\n\nCantidad de dinero recolectado por área"
                + "\n    Area 1 :  $"+minLlamadaArea1
                + "\n    Area 2 :  $"+minLlamadaArea2
                + "\n    Area 3 :  $"+minLlamadaArea3
                + "\n    Area 4 :  $"+minLlamadaArea4
                + "\n\nCantidad de minutos llamados por cabina"
                + "\n    Cabina 3 :  "+minLlamadaCabina1+" min"
                + "\n    Cabina 3 :  "+minLlamadaCabina2+" min"
                + "\n    Cabina 3 :  "+minLlamadaCabina3+" min"
                + "\n\nCantidad de dinero recolectado por cabina"
                + "\n    Cabina 1 :  $"+dineroLlamadasCabina1
                + "\n    Cabina 2 :  $"+dineroLlamadasCabina2
                + "\n    Cabina 3 :  $"+dineroLlamadasCabina3
                + "";

        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void limpiarCampos()
    {
           campoTelefono.setText("");
           campoDuracion.setText("");
           comboArea.setSelectedIndex(0);
           comboCabina.setSelectedIndex(0);     
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == botonRegistrar)
        {  
            try {
                registrarLlamada();
            }catch(NumberFormatException npe) 
            {
               JOptionPane.showMessageDialog(null, "Revision de llamada debe ser entero"); 
            }         
        }        
        if (e.getSource() == botonCalcularTotal)
        {   
            try {
                if (!llamada.estaVacia())
                {   calcularTotal();
                     System.exit(0);}
                else{
                  JOptionPane.showMessageDialog(null, "No se han registrado llamadas");   
                }
                    
            }catch(NullPointerException npe) 
            {
               JOptionPane.showMessageDialog(null, "No se han registrado llamadas"); 
            }
        }
    }
    
}
