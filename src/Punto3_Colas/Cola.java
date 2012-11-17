/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_Colas;


public class Cola 
{
   private Lista listaCola;

  
   public Cola() 
   { 
      listaCola = new Lista(); 
   } 

   // agrega objeto a la cola
   public void enqueue(String nroCuenta, String fecha, String tipoTransaccion, String tipoCuenta, int monto )
   { 
      listaCola.insertarAlFinal( nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto ); 
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

   public void imprimir()
   {
      listaCola.imprimir();
   } 
} 
