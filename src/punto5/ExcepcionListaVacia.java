
package punto5;


public class ExcepcionListaVacia extends RuntimeException 
{
  
   public ExcepcionListaVacia()
   {
      this( "Lista" ); 
   } // fin del constructor de ExcepcionListaVacia sin argumentos

   // constructor con un argumento
   public ExcepcionListaVacia( String nombre )
   {
      super( nombre + " esta vacia" ); // llama al constructor de la superclase
   } // fin del constructor de ExcepcionListaVacia con un argumento
} 
