/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


public class Pila 
{
   private Lista listaPila;

   // constructor sin argumentos
   public Pila() 
   { 
      listaPila = new Lista( "pila" ); 
   } // fin del constructor de Pila sin argumentos

   // agrega objeto a la pila
   public void push(String cedula, String nombres, String apellidos, String salario)
   { 
      listaPila.insertarCima(cedula, nombres, apellidos, salario); 
   } // fin del m�todo push

   // elimina objeto de la pila
   public Nodo pop() 
   { 
       if (!estaVacia()){
           return listaPila.eliminarCima();
       }else           
           return null;
      
   } // fin del m�todo pop

   public void ordenarDesc()
   {
       listaPila.ordenarXCedulaAsc();
   }
   
   public void ordenarAsc()
   {
       listaPila.ordenarXCedulaDesc();
   }
   
   public void invertir()
   {
       listaPila.invertir();
   }
   
   // determina si la pila est� vac�a
   public boolean estaVacia() 
   { 
      return listaPila.estaVacia(); 
   } // fin del m�todo estaVacia

   // imprime el contenido de la pila
   public String imprimir() 
   { 
      return listaPila.imprimir(); 
   } // fin del m�todo imprimir
} 