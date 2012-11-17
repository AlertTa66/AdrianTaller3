package punto4_expresionAritmetica;

public class Pila 
{
   private Lista listaPila;

   // constructor sin argumentos
   public Pila() 
   { 
      listaPila = new Lista( "pila" ); 
   }

   
   public void push( Object objeto )
   { 
      listaPila.insertarAlFrente( objeto ); 
   }
   public Object pop() throws ExcepcionListaVacia
   { 
      return listaPila.eliminarDelFrente(); 
   }

 
   public boolean estaVacia() 
   { 
      return listaPila.estaVacia(); 
   } 
   public void imprimir() 
   { 
      listaPila.imprimir(); 
   }
   
   public Object parteSuperiorPila(){
       Object operador = listaPila.parteSuperiorPila();
       return operador;
   }
} 
