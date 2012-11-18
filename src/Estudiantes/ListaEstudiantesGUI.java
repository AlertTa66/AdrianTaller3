/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

/**
 *
 * @author aDRiaN
 */
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ListaEstudiantesGUI extends JFrame implements ActionListener   {
 private Estudiantes lista;
 private JLabel lbCodigoEst, lbApel1, lbApel2,lbNombre;
 private JTextField tfCodigoEst, tfApel1, tfApel2,  tfNombre; 
 private JPanel panelPrincipal, panelContenedor, panelInicio, panelAgregar, panelEliminar, panelBuscar, panelOrdenar, panelMostrar;
 private CardLayout cardLayout;  // manejador de paneles
 private JButton botonAgregar, botonEliminar, botonBuscar, botonOrdenarNombre,botonOrdenarCodigo;
 private JTextArea tAListaOrdenada;
 private JTextArea areaMostrar;
 private JTextField tfNombre2;
    private JTextField tfCodigoEst2;
 
 public ListaEstudiantesGUI() //COnstructor de la Clase
   {
   
       super("Lista de Estudiantes");  // llama al constructor de JFrame, pone titulo a la ventana
       
       lista =new Estudiantes(); // inicailizamos objteo LIstas
       panelPrincipal = new JPanel(); //inicializo panel principal y el manejador cardlayoud
       cardLayout = new CardLayout();
       construyePanelInicio (); // llamo al metodo que construye el panel de inicio que solo pinta el fondo de blanco
       
       construyePanelAgregar(); // construye el panel de agregar departament
       construyePanelEliminar();
       construyePanelBuscar();
       construyePanelOrdenar();
       construyePanelMostrar();
       
       construyePanelPrincipal(); // construye el panel que me maneja los paneles 
       
       this.add(panelPrincipal); 
       
       // Crear MENU
       JMenu menuArchivo = new JMenu("Archivo"); // crea menu archivo
       menuArchivo.setMnemonic('A');  // establece el nemónico a A
                        
   
       //crear elementos del Menu
       
       //manejar elemento Agregar Departamento
       JMenuItem elementoAgregar = new JMenuItem("Agregar Estudiante");
       menuArchivo.add(elementoAgregar); //agrega elemento al Menu archivo
       elementoAgregar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) 
            {

             cardLayout.show(panelPrincipal, "Panel 2"); // si hacen clic en Archivo, muestra panel 2, es decir, panelAgregar
              
            }
        });
       
       JMenuItem elementoEliminar = new JMenuItem("Eliminar Estudiante");
       menuArchivo.add(elementoEliminar); //agrega elemento al Menu archivo
       elementoEliminar.addActionListener(
               new ActionListener() { //clase interna anónima

                   public void actionPerformed(ActionEvent e) {
                  cardLayout.show(panelPrincipal, "Panel 3"); // si hacen clic en Archivo, muestra panel 2, es decir, panelELiminar
                   }
               });
       
        JMenuItem elementoBuscar = new JMenuItem("Buscar Capital");
       menuArchivo.add(elementoBuscar); //agrega elemento al Menu archivo
       elementoBuscar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) {
                
                cardLayout.show(panelPrincipal, "Panel 4");
             
            }
        });
       
       JMenuItem elementoOrdenar = new JMenuItem("Ordenar");
       menuArchivo.add(elementoOrdenar); //agrega elemento al Menu archivo
       elementoOrdenar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) {
            cardLayout.show(panelPrincipal, "Panel 5");
            }
        });
       
       JMenuItem elementoMostrar = new JMenuItem("Mostrar Lista");
       menuArchivo.add(elementoMostrar); //agrega elemento al Menu archivo
       elementoMostrar.addActionListener(
               new ActionListener() { //clase interna anónima

          
            public void actionPerformed(ActionEvent e) {
             cardLayout.show(panelPrincipal, "Panel 6");
             
            String listado = lista.mostrarLista();
            areaMostrar.setText(listado);
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
        panelPrincipal.add(panelEliminar,"Panel 3");
        panelPrincipal.add(panelBuscar, "Panel 4");
        panelPrincipal.add(panelOrdenar, "Panel 5");
        panelPrincipal.add(panelMostrar, "Panel 6");

    }
    
    private void construyePanelAgregar()
    {       
        panelAgregar = new JPanel(); // manejador grid 3 filas y dos columnas, acomoda los elemetos
       JPanel  panelAux = new JPanel(new GridLayout(4,2));
        panelAgregar.setBackground(Color.WHITE);
        panelAux.setBackground(Color.WHITE);   
        //en orden que se agrega
        
        panelAgregar.setBorder(BorderFactory.createEmptyBorder( 40,50,50,50));  // pone borde
        lbCodigoEst = new JLabel("Codigo Del Estudiante");
        tfCodigoEst = new JTextField();
        lbApel1 = new JLabel("Primer Apellido");       
        tfApel1 = new JTextField();
        lbApel2 = new JLabel("Segundo Apellido");       
        tfApel2 = new JTextField();
        lbNombre = new JLabel("Nombre Del Estudiante");
        tfNombre = new JTextField();
        
        
        botonAgregar  = new JButton("Agregar");
        botonAgregar.addActionListener(this); //agregar escucha al boton
        
        panelAux.add(lbCodigoEst);
        panelAux.add(tfCodigoEst);
        
        panelAux.add(lbApel1);
        panelAux.add(tfApel1);
        
        panelAux.add(lbApel2);
        panelAux.add(tfApel2);
        
        panelAux.add(lbNombre);
        panelAux.add(tfNombre);
        
        panelAgregar.add(panelAux);
        panelAgregar.add(botonAgregar);
              
    }
    
     private void construyePanelEliminar ()
     {
         panelEliminar = new JPanel(new GridLayout(2,1));
         panelEliminar.setBackground(Color.WHITE);        
         panelEliminar.setBorder(BorderFactory.createEmptyBorder( 60,50,80,50));  // pone borde
         lbCodigoEst = new JLabel("Codigo del Estudiante");
         tfCodigoEst2 = new JTextField();
         
         botonEliminar = new JButton("Eliminar");
         botonEliminar.addActionListener(this); //agregar escucha al boton
         panelEliminar.add(lbCodigoEst);    
         panelEliminar.add(tfCodigoEst2);      
         panelEliminar.add(botonEliminar);
                  
     }
     
     
     private void construyePanelBuscar()
   {
         
       panelBuscar = new JPanel(new GridLayout(2, 1));
       panelBuscar.setBackground(Color.WHITE);
       panelBuscar.setBorder(BorderFactory.createEmptyBorder(60, 50, 80, 50));  // pone borde
       lbNombre = new JLabel("Nombre del Estudiante");
       tfNombre2 = new JTextField();
       botonBuscar = new JButton("Buscar Cod");
       botonBuscar.addActionListener(this); //agregar escucha al boton
       panelBuscar.add(lbNombre);
       panelBuscar.add(tfNombre2);
       panelBuscar.add(botonBuscar);
     
             
   }

    private void construyePanelOrdenar() 
    // ordena la lista de departamentos, de acuerdo al código o nombre según el usuario haya determinado.
    {
        panelOrdenar = new JPanel();
        JPanel aux = new JPanel(new GridLayout(2, 1));
        //   panelOrdenar.setBorder(BorderFactory.createEmptyBorder(60, 50, 50, 50));  // pone borde
        botonOrdenarNombre = new JButton("Ordenar por Nombre");
        botonOrdenarCodigo = new JButton("Ordenar por Codigo");

        botonOrdenarNombre.addActionListener(this); //agregar escucha al boton
        botonOrdenarCodigo.addActionListener(this); //agregar escucha al boton
        tAListaOrdenada = new JTextArea(6, 40);

        aux.add(botonOrdenarNombre);
        aux.add(botonOrdenarCodigo);
        panelOrdenar.add(aux);
        panelOrdenar.add(tAListaOrdenada);
                   
          }

    private void construyePanelMostrar() 
    {
    
        panelMostrar = new JPanel();
        areaMostrar = new JTextArea(8,40);
        
        panelMostrar.add(areaMostrar);

    }
    
    public void limpiarCampos()
    { //Limpia los jtexfFields
        tfCodigoEst.setText("");
        tfNombre.setText("");
        tfApel1.setText("");
        tfApel2.setText("");      
        
        
    }
 public static void main (String arg[])
   {
       ListaEstudiantesGUI lista = new ListaEstudiantesGUI();
       lista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       lista.setSize(500, 250);
       lista.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== botonAgregar)
        {   
            
           
                   
            
            try{ //para capturar la excpecion,..encierra el código donde puede ocurrir una excepcion
            if (!tfCodigoEst.getText().equals("")|| !tfNombre.getText().equals("") ||  //valida que los campos no esten vacios
                  !tfApel1.getText().equals("")|| !tfApel2.equals("") ){
                int codigo = Integer.parseInt(tfCodigoEst.getText());
                String apellido1 = tfApel1.getText();
                String apellido2 = tfApel2.getText();
                String nombre = tfNombre.getText();
                lista.insertarFinal(codigo, nombre, apellido1, apellido2);
                JOptionPane.showMessageDialog(null, "Estudiante agregado a la LIsta");
                limpiarCampos();
            }
            }catch(NumberFormatException nfe)  //excepción que captura si el codigo no es numero NumberFormatException
            {
               JOptionPane.showMessageDialog(null, "Codigo estudiante debe ser un numero");
            }
                                
        }
        
       if (e.getSource() == botonBuscar){
           String nombreEst = tfNombre2.getText();
           Nodo estudiante = lista.buscarNodoXNombre(nombreEst);
           
           if(estudiante == null){
               JOptionPane.showMessageDialog(null, "No existe el Estudiante "+nombreEst);
           } else {
               String datos = "Cod: "+estudiante.dato+" - "+estudiante.dato2+" "+estudiante.dato3+" "+estudiante.dato4+" ";
               JOptionPane.showMessageDialog(null, "Se encontro el estudiante \n "+ datos);
           }
       }
       
       if (e.getSource() == botonEliminar){
           int codigoDep = Integer.parseInt(tfCodigoEst2.getText());
           if(lista.buscarNodo(codigoDep)==null){
               JOptionPane.showMessageDialog(null, "El Estudiante con codigo "+codigoDep+" no existe");
           }else {
                lista.eliminarPosicion(lista.obtenerPosXcod(Integer.parseInt(tfCodigoEst2.getText())));    
                    JOptionPane.showMessageDialog(null, "Eliminado");    // mensaje de confirmacion
           }
       }
       
       if (e.getSource() == botonOrdenarCodigo){
           lista.ordenarXCodigo();
           tAListaOrdenada.setText(lista.mostrarLista());
       }

        if (e.getSource() == botonOrdenarNombre){
            lista.ordenarXApellido();
           tAListaOrdenada.setText(lista.mostrarLista());
       }
    }
    
}
