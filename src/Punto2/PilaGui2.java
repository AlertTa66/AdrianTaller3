/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author aDRiaN
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PilaGui2 extends JFrame implements ActionListener   {
 
    private JPanel panelPrincipal;
    private CardLayout cardLayout;
    private JPanel panelAgregar;
    private JLabel lbCedula, lbNombres, lbApellidos, lbSalario;
    private JTextField tfCedula, tfNombres, tfApellidos, tfSalario;
    private JButton botonAgregar;
    private JPanel panelContenedor;
    private JPanel panelInicio;
    private Pila pila;
    private JPanel panelOrdenar;
    private JButton botonOrdenarMayorAMenor;
    private JButton botonOrdenarMenorAMayor;
    private JTextArea tAListaOrdenada;
    private JPanel panelInvertir;
    private JButton botonInvertir;
    private JTextArea areaImprimir;

// 
 public PilaGui2() //COnstructor de la Clase
   {
   
       super("Lista de Empleados");  // llama al constructor de JFrame, pone titulo a la ventana
       
       pila = new Pila();    
       panelPrincipal = new JPanel(); //inicializo panel principal y el manejador cardlayoud
       cardLayout = new CardLayout();
       construyePanelInicio (); // llamo al metodo que construye el panel de inicio que solo pinta el fondo de blanco
       construyePanelAgregar(); 
       construyePanelOrdenar();
       construyePanelInvertir();
      
       
       
       construyePanelPrincipal(); // construye el panel que me maneja los paneles 
       
       this.add(panelPrincipal); 
       
       // Crear MENU
       JMenu menuArchivo = new JMenu("Archivo"); // crea menu archivo
       menuArchivo.setMnemonic('A');  // establece el nemónico a A
                        
   
       //crear elementos del Menu
       
       //manejar elemento Agregar Departamento
       JMenuItem elementoAgregar = new JMenuItem("Agregar Empleado");
       menuArchivo.add(elementoAgregar); //agrega elemento al Menu archivo
       elementoAgregar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) 
            {

             cardLayout.show(panelPrincipal, "Panel 2"); // si hacen clic en Archivo, muestra panel 2, es decir, panelAgregar
              
            }
        });
       
       JMenuItem elementoEliminar = new JMenuItem("Eliminar Empleado");
       menuArchivo.add(elementoEliminar); //agrega elemento al Menu archivo
       elementoEliminar.addActionListener(
               new ActionListener() { //clase interna anónima

                   public void actionPerformed(ActionEvent e) {
                     try{
                       if (!pila.estaVacia()) {
                           pila.pop();
                           JOptionPane.showMessageDialog(null, "Empleado eliminado");
                       }else{
                        JOptionPane.showMessageDialog(null, "pila esta vacia");
                        }                  
                   }catch(NullPointerException np){
                        JOptionPane.showMessageDialog(null, "pila esta vacia");
                   }
               }});
       
        JMenuItem elementoBuscar = new JMenuItem("Invertir Lista");
       menuArchivo.add(elementoBuscar); //agrega elemento al Menu archivo
       elementoBuscar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) {
                
                cardLayout.show(panelPrincipal, "Panel 4");
             
            }
        });
//       
       JMenuItem elementoOrdenar = new JMenuItem("Ordenar");
       menuArchivo.add(elementoOrdenar); //agrega elemento al Menu archivo
       elementoOrdenar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) {
            cardLayout.show(panelPrincipal, "Panel 3");
            }
        });

       
    JMenuBar barra = new JMenuBar();
    setJMenuBar(barra);
    barra.add(menuArchivo);
       
   }
   
   private void construyePanelInicio ()
   {   
       panelContenedor = new JPanel();
       panelContenedor.setBackground(Color.WHITE);    //pinta el fondo blanco    
       panelInicio = new JPanel (new FlowLayout());
       panelInicio.setBackground(Color.WHITE);
       panelContenedor.add(panelInicio);      
      
   }
   
    private void construyePanelPrincipal(){
        panelPrincipal.setLayout(cardLayout);
        panelPrincipal.add(panelContenedor, "Panel 1");
        panelPrincipal.add(panelAgregar, "Panel 2");
        panelPrincipal.add(panelOrdenar, "Panel 3");
       panelPrincipal.add(panelInvertir,"Panel 4");

    }
    
    private void construyePanelAgregar()
    {       
        panelAgregar = new JPanel(new GridLayout(5,2)); //
        panelAgregar.setBackground(Color.WHITE);
        //en orden que se agrega
              panelAgregar.setBorder(BorderFactory.createEmptyBorder( 40,50,50,50));  // pone borde
        lbCedula = new JLabel("Cedula");
        tfCedula = new JTextField();
        lbApellidos = new JLabel("Apellidos");       
        tfApellidos = new JTextField();
        lbNombres = new JLabel("Nombres");       
        tfNombres = new JTextField();
        lbSalario = new JLabel("Salario");
        tfSalario = new JTextField();
        
        
        botonAgregar  = new JButton("Agregar");
        botonAgregar.addActionListener(this); //agregar escucha al boton
        
        panelAgregar.add(lbCedula);
        panelAgregar.add(tfCedula);
        
        panelAgregar.add(lbNombres);
        panelAgregar.add(tfNombres);
        
        panelAgregar.add(lbApellidos);
        panelAgregar.add(tfApellidos);
        
        panelAgregar.add(lbSalario);
        panelAgregar.add(tfSalario);
        
        panelAgregar.add(botonAgregar);
              
    }
        private void construyePanelOrdenar() 
    {
        panelOrdenar = new JPanel(new BorderLayout());
        JPanel aux = new JPanel(new GridLayout(2, 1));
        botonOrdenarMayorAMenor = new JButton("Ordenar de Mayor a Menor");
        botonOrdenarMenorAMayor = new JButton("Ordenar Menor a Mayor");
         aux.setBorder(BorderFactory.createEmptyBorder(10,150,10,150)); 
        botonOrdenarMayorAMenor.addActionListener(this); //agregar escucha al boton
        botonOrdenarMenorAMayor.addActionListener(this); //agregar escucha al boton
        tAListaOrdenada = new JTextArea(6, 20);

        aux.add(botonOrdenarMayorAMenor);
        aux.add(botonOrdenarMenorAMayor);
        panelOrdenar.add(aux, BorderLayout.NORTH);
        panelOrdenar.add(tAListaOrdenada,BorderLayout.CENTER);
                   
   }
            
         private void construyePanelInvertir() 
    {
             
             panelInvertir= new JPanel(new BorderLayout());
             botonInvertir = new JButton("Invertir Lista");
             botonInvertir.addActionListener(this);
             areaImprimir =  new JTextArea(6,20);
             
             panelInvertir.add(botonInvertir, BorderLayout.NORTH);
             panelInvertir.add(areaImprimir, BorderLayout.CENTER);
        
    }
         
             
        private void limpiarCampos()
        {
            
            areaImprimir.setText("");
            tAListaOrdenada.setText("");
            tfApellidos.setText("");
            tfCedula.setText("");
            tfNombres.setText("");
            tfSalario.setText("");
                    
            
        }
        
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== botonAgregar)
        {          
           try{ 
            if (!tfCedula.getText().equals("") && !tfNombres.getText().equals("") &&  //valida que los campos no esten vacios
                  !tfApellidos.getText().equals("")&& !tfSalario.equals("") ){
                int cedula = Integer.parseInt(tfCedula.getText());
                String nombres = tfNombres.getText();
                String apellidos = tfApellidos.getText();
                int salario = Integer.parseInt(tfSalario.getText());                
                pila.push(cedula, nombres, apellidos, salario); 
                JOptionPane.showMessageDialog(null, "Empleado agregado a la Pila");
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no insertado, debe insertar todos los datos, vuelva  intentarlo");
            }
           }catch(NumberFormatException nfe){
               JOptionPane.showMessageDialog(null, "Codigo y salario deben ser Numeros Enteros.");
           }
            
            }
        
         if (e.getSource() == botonOrdenarMayorAMenor){
             
              if (!pila.estaVacia()){
                 pila.ordenarAsc();
                 tAListaOrdenada.setText(pila.imprimir());}
             else {
                 JOptionPane.showMessageDialog(null, "Pila vacía");
             }
            
        }
       

        if (e.getSource() == botonOrdenarMenorAMayor){
            if (!pila.estaVacia()) {
                pila.ordenarDesc();
                tAListaOrdenada.setText(pila.imprimir());
            } else {
                JOptionPane.showMessageDialog(null, "Pila vacía");
            }
        }
        
        if (e.getSource() == botonInvertir){
             if (!pila.estaVacia()){
                 pila.invertir();
                  areaImprimir.setText(pila.imprimir());}
             else {
                 JOptionPane.showMessageDialog(null, "Pila vacía");
             }
        }
    }

   
        
        
      
  
    
}
