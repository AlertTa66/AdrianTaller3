
package punto4_expresionAritmetica;



public class Lista 
{
   private Nodo primerNodo;
   private Nodo ultimoNodo;
   private String nombre; 

  
   public Lista() 
   { 
      this( "lista" ); 
   } 

   
   public Lista( String nombreLista )
   {
      nombre = nombreLista;
      primerNodo = ultimoNodo = null;
   } 
   public void insertarAlFrente( Object elementoInsertar )
   {
      if ( estaVacia() ) 
         primerNodo = ultimoNodo = new Nodo( elementoInsertar );
      else 
         primerNodo = new Nodo( elementoInsertar, primerNodo );
   } 

   
   public void insertarAlFinal( Object elementoInsertar )
   {
      if ( estaVacia() ) 
         primerNodo = ultimoNodo = new Nodo( elementoInsertar );
      else 
         ultimoNodo = ultimoNodo.siguienteNodo = new Nodo( elementoInsertar );
   } 

   
   public Object eliminarDelFrente() throws ExcepcionListaVacia
   {
      if ( estaVacia() ) 
         throw new ExcepcionListaVacia( nombre );

      Object elementoEliminado = primerNodo.datos; 

   
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;
      else
         primerNodo = primerNodo.siguienteNodo;

      return elementoEliminado;
   } 


   public Object eliminarDelFinal() throws ExcepcionListaVacia
   {
      if ( estaVacia() ) 
         throw new ExcepcionListaVacia( nombre );

      Object elementoEliminado = ultimoNodo.datos; 

    
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;
      else 
      { 
         Nodo actual = primerNodo;

         while ( actual.siguienteNodo != ultimoNodo )
            actual = actual.siguienteNodo;
   
         ultimoNodo = actual; 
         actual.siguienteNodo = null;
      } 

      return elementoEliminado; 
   } 

  
   public boolean estaVacia()
   { 
      return primerNodo == null; 
   }
   
   public Object parteSuperiorPila() //devuelve el valor de la parte superior de la pila sin sacarlo
   {
       Object valor = primerNodo.datos;
       return valor;
   }
   
   public void imprimir()
   {
      if ( estaVacia() ) 
      {
         System.out.printf( "%s vacia\n", nombre );
         return;
      }

      System.out.printf( "La %s es: ", nombre );
      Nodo actual = primerNodo;

   
      while ( actual != null ) 
      {
         System.out.printf( "%s ", actual.datos );
         actual = actual.siguienteNodo;
      } 

      System.out.println( "\n" );
   } 
}
