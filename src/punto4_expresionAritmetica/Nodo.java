/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4_expresionAritmetica;

class Nodo
{
   char datos; 
   Nodo siguienteNodo; 
   Nodo( char objeto ) 
   { 
      this( objeto, null ); 
   } 
   Nodo( char objeto, Nodo nodo )
   {
      datos = objeto;    
      siguienteNodo = nodo;  
   }
   char obtenerChar() 
   { 
      return datos; 
   } 

  
   Nodo obtenerSiguiente() 
   { 
      return siguienteNodo; 
   } 
} 