/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import javax.swing.JOptionPane;


public class Lista 
{
   private Nodo cabeza;
   private Nodo ultimoNodo;
   private String nombre; //se utiliza para imprimir

   public Lista(){//constructor que crea una lista vacía
    
      this( "lista" );  
   } 

   // constrcutro crea una lista vacía, recibe un nombre
   public Lista( String nombreLista ) {
      nombre = nombreLista;
      cabeza = ultimoNodo = null; //inicializa primer y ultimo nodo en null
   } 

   // inserta el Nodo de primero
   public void insertarCima(String cedula, String nombres, String apellidos, String salario )
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new Nodo(cedula, nombres, apellidos, salario );
      else // cabeza hace referencia al nuevo nodo
         cabeza = new Nodo(cedula,nombres,apellidos,salario, cabeza );
   } 

   // inserta objeto Object al final del la Lista
   public void insertarAlFinal( String cedula, String nombres, String apellidos, String salario )
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new Nodo( cedula, nombres, apellidos, salario );
      else // el siguienteNodo de ultimoNodo hace referencia al nuevo nodo
         ultimoNodo = ultimoNodo.siguienteNodo = new Nodo( cedula, nombres, apellidos, salario );
   } // fin del m�todo insertarAlFinal

   // elimina el primer nodo de la Lista
   public Nodo eliminarCima() 
   {
      if ( estaVacia() ){ 
          JOptionPane.showMessageDialog(null, "La lista está vacía");
          return null;
      }
      Nodo nodoEliminado =cabeza;
      nodoEliminado.siguienteNodo = null; //eliminar t odo lo que corresponde a la lista que era la cabeza

      // actualiza las referencias cabeza y ultimoNodo 
      if ( cabeza == ultimoNodo )
         cabeza = ultimoNodo = null;
      else
         cabeza = cabeza.siguienteNodo;

      return nodoEliminado; // devuelve los datos del nodo eliminado
   } // fin del m�todo eliminarDelFrente

   // elimina el �ltimo nodo de la Lista
//   public Object eliminarDelFinal() 
//   {
//      if ( estaVacia() ) // lanza excepci�n si la Lista est� vac�a
//         JOptionPane.showMessageDialog(null, "La lista está vacía");
//
//      Object elementoEliminado = ultimoNodo.datos; // obtiene los datos que se van a eliminar
//
//      // actualiza las referencias cabeza y ultimoNodo
//      if ( cabeza == ultimoNodo )
//         cabeza = ultimoNodo = null;
//      else // localiza el nuevo �ltimo nodo
//      { 
//         Nodo actual = cabeza;
//
//         // itera mientras el nodo actual no haga referencia a ultimoNodo
//         while ( actual.siguienteNodo != ultimoNodo )
//            actual = actual.siguienteNodo;
//   
//         ultimoNodo = actual; // actual el nuevo ultimoNodo
//         actual.siguienteNodo = null;
//      } // fin de else
//
//      return elementoEliminado; // devuelve los datos del nodo eliminado
//   } // fin del m�todo eliminarDelFinal

   // determina si la lista est� vac�a
   public boolean estaVacia()
   { 
      return cabeza == null; // devuelve true si la lista est� vac�a
   } // fin del m�todo estaVacia

   // imprime el contenido de la lista
   public String imprimir()
   {
      String impresion=" ";
   
//      impresion += "La pila es: "+ nombre ;
      Nodo actual = cabeza;

      // mientras no est� al final de la lista, imprime los datos del nodo actual
      while ( actual != null ) 
      {
         impresion += "Cedula: "+ actual.getCedula()+"-  Nombre: "+ actual.getNombres()+"-  Apellidos: " +actual.getApellidos()+"-  Salario:"+ actual.getSalario()+"\n";
         actual = actual.siguienteNodo;
      } // fin de while

      impresion += "\n" ;
      
      return impresion;
   } // fin del m�todo imprimir
} // fin de la clase Lista
