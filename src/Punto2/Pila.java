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
   public void push(int cedula, String nombres, String apellidos, int salario)
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
 	 

   // determina si la pila est� vac�a
 	 	
   public boolean estaVacia() 
 	 
   { 
	 	
      return listaPila.estaVacia(); 
 	 
   } // fin del m�todo estaVacia


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
 	
 	 
   // imprime el contenido de la pila
 	 	
   public String imprimir() 
 	 	
        { 
 	 	
      return listaPila.imprimir(); 
 		
   } // fin del m�todo imprimir



} 