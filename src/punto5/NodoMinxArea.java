/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;


  class NodoMinxArea 
{
   int codigoA;  
   int valorMinuto;

   NodoMinxArea siguienteNodo; 

   NodoMinxArea(int codigoA, int valorMinuto) 
   { 
      this(codigoA, valorMinuto, null); 
   } 

   NodoMinxArea( int codigoA, int valorMinuto, NodoMinxArea nodo )
   {
      this.codigoA = codigoA;    
      this.valorMinuto = valorMinuto;
    
      
      siguienteNodo = nodo;  
   } 
   
   
    public int getCodigoA() {
        return codigoA;
    }

    public NodoMinxArea getSiguienteNodo() {
        return siguienteNodo;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }
    
    NodoMinxArea obtenerSiguiente() 
   { 
      return siguienteNodo; 
   }
  }