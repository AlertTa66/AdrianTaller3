/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_Colas;


class NodoCliente 
{
 
   int numeroCliente;
   NodoCliente siguienteNodo; // referencia al siguiente nodo en la lista

   
   NodoCliente(int numCliente) 
   { 
      this(numCliente, null ); 
   } 
   
// el constructor que enlaza con el nodo siguiente
   
   NodoCliente(int numCliente, NodoCliente nodo )
   {
      this.numeroCliente = numCliente;
      siguienteNodo = nodo;  
   }        
    
    public NodoCliente getSiguienteNodo() {
        return siguienteNodo;
    }

    // obtiene el siguiente nodo

   NodoCliente obtenerSiguiente() 
   { 
      return siguienteNodo; 
   } 
} 
