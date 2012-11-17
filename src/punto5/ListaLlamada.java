
package punto5;



public class ListaLlamada 
{
   private NodoLlamada cabeza;
   private NodoLlamada ultimoNodo;
   private NodoLlamada actualNodo;
   private String nombre; 

   
   public ListaLlamada(String nombreLista ) {
      nombre = nombreLista;
      cabeza = ultimoNodo = null; 
   } 

  
   public void insertarCima(int codigoA, String telefono, String destino, int duracion, String nroCabina)
   {
      if ( estaVacia() ) 
         cabeza = ultimoNodo = new NodoLlamada(codigoA, telefono,destino,duracion,nroCabina);
      else 
         cabeza = new NodoLlamada(codigoA, telefono,destino,duracion,nroCabina, cabeza );
      
   } 

   public void insertarAlFinal(int codigoA, String telefono, String destino, int duracion, String nroCabina )
   {
      if ( estaVacia() ) 
         cabeza = ultimoNodo = new NodoLlamada( codigoA, telefono,destino,duracion,nroCabina );
      else 
         ultimoNodo.siguienteNodo = new NodoLlamada( codigoA, telefono,destino,duracion,nroCabina  );
   } 

 
   public boolean estaVacia()
   { 
      return cabeza == null; 
   } 
   
    
   public int cantidadNodos() {
        int can = 0; /* empezamos con cantidad igual a 0  */
        NodoLlamada aux = cabeza; /* decimos que el auxiliar es igual a cabeza osea posicion1  */
        while (aux != null) { /* ciclo hasta que el auxiliar sea nulo  */
            can++; /* aumente la cantidad  */
            aux = aux.siguienteNodo; /* y el auxiliar sea de siguiente en siguiente  */
        }/* cantidad lo que hace es contar el numero de veces que auxiliar se mueve  */
        System.out.println("cant " + can);
        return can; /*  retorna el valor de cantidad */

    }
   
   public NodoLlamada getActual(){
       return actualNodo;
   }
   
   public boolean ultimo(){
       actualNodo = ultimoNodo;
       return true;
   }
   
   public boolean first(){
       actualNodo = cabeza;
       return true;
   }
   
   public boolean anterior() {
       NodoLlamada antNodo = cabeza;
        if (ultimoNodo == null) {
            return false;
        }
        if(actualNodo == cabeza){
            return false;
        }
        if (actualNodo == null) {
            actualNodo = ultimoNodo;
            return true;
        } else {
            while (antNodo.siguienteNodo != actualNodo) {  
                /*asignele a aux siguiente ciclo hasta que sea nulo*/
                antNodo = antNodo.siguienteNodo;  /*le da a aux el siguiente*/
            }
            actualNodo = antNodo;
            return true;
        }
    }
   
   public boolean next() {
        if (cabeza == null) {
            System.out.println("false1");
            return false;
        }
        if (actualNodo == null) {
            actualNodo = cabeza;
            System.out.println("True1");
            return true;
        } else {
            if (actualNodo.siguienteNodo != null) {
                actualNodo = actualNodo.siguienteNodo;
                System.out.println("True2");
                return true;
            } else {
                System.out.println("false2");
                return false;
            }
        }
    }
   

   
   
  
     public String imprimir()
   {
      String impresion=" ";
   
//      impresion += "La pila es: "+ nombre ;
      NodoLlamada actual = cabeza;

      // mientras no est� al final de la lista, imprime los datos del nodo actual
      while ( actual != null ) 
      {
         impresion += "Codigo Area: "+ actual.getCodigoA()+"-  Telefono Dest: "+ actual.getTelefono()+"-  Duracion: " +actual.getDuracion()+"-  Numero cabina:"+ actual.getNroCabina()+"\n";
         actual = actual.siguienteNodo;
      } // fin de while

      impresion += "\n" ;
      
      return impresion;
   } 
   
   
   
}