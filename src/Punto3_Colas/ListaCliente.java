
package Punto3_Colas;

import javax.swing.JOptionPane;


public class ListaCliente 
{
   private NodoCliente cabeza;
   private NodoCliente ultimoNodo;
   private String nombre; //se utiliza para imprimir

   public ListaCliente(){//constructor que crea una lista vacía
      this( "lista" );  
   } 

   // constrcutro crea una lista vacía, recibe un nombre
   public ListaCliente( String nombreLista ) {
      nombre = nombreLista;
      cabeza = ultimoNodo = null; //inicializa primer y ultimo nodo en null
   } 

   // inserta el Nodo de primero
   public void insertarPrimero(int numCliente)
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new NodoCliente(numCliente );
      else // cabeza hace referencia al nuevo nodo
         cabeza = new NodoCliente(numCliente, cabeza );
   } 

   // inserta objeto Object al final del la Lista
   public void insertarAlFinal(int numCliente)
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new NodoCliente( numCliente);
      else // el siguienteNodo de ultimoNodo hace referencia al nuevo nodo
         ultimoNodo = ultimoNodo.siguienteNodo = new NodoCliente(  numCliente);
   } // fin del m�todo insertarAlFinal

   // elimina el primer nodo de la Lista
   public NodoCliente eliminarPrimero() 
   {
      if ( estaVacia() ){ 
          JOptionPane.showMessageDialog(null, "La lista está vacía");
          return null;
      }
      NodoCliente nodoEliminado =cabeza;
      //nodoEliminado.siguienteNodo = null; //eliminar todo lo que corresponde a la lista que era la cabeza

      // actualiza las referencias cabeza y ultimoNodo 
      if ( cabeza == ultimoNodo )
         cabeza = ultimoNodo = null;
      else
         cabeza = cabeza.siguienteNodo;

      return nodoEliminado; // devuelve los datos del nodo eliminado
   } 

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
      NodoCliente actual = cabeza;

      // mientras no est� al final de la lista, imprime los datos del nodo actual
      while ( actual != null ) 
      {
         impresion = "Nro de Clientes: "+ actual.numeroCliente;
         actual = actual.siguienteNodo;
      } // fin de while

      impresion += "\n" ;
      
      return impresion;
   } // fin del m�todo imprimir
} 