/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_Colas;


public class ColaCliente 
{
   private ListaCliente listaCola;

  
   public ColaCliente() 
   { 
      listaCola = new ListaCliente(); 
   } 

   // agrega objeto a la cola
   public void enqueue( int numCliente )
   { 
      listaCola.insertarAlFinal(numCliente); 
   } // fin del m�todo enqueue

   // elimina objeto de la cola
   public Object dequeue() 
   { 
      return listaCola.eliminarPrimero();
   } 
   public boolean estaVacia()
   {
      return listaCola.estaVacia();
   }

   public String imprimir()
   {
      return listaCola.imprimir();
   } 
} 
