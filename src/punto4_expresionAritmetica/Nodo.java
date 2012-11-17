/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4_expresionAritmetica;

class Nodo
{
   Object datos; 
   Nodo siguienteNodo; 
   Nodo( Object objeto ) 
   { 
      this( objeto, null ); 
   } 
   Nodo( Object objeto, Nodo nodo )
   {
      datos = objeto;    
      siguienteNodo = nodo;  
   }
   Object obtenerObject() 
   { 
      return datos; 
   } 

  
   Nodo obtenerSiguiente() 
   { 
      return siguienteNodo; 
   } 
} 