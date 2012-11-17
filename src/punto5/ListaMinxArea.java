
package punto5;


public class ListaMinxArea {
   
   private NodoMinxArea cabeza;
 
   private NodoMinxArea ultimoNodo;
   private NodoMinxArea primerNodo;
   private NodoMinxArea actualNodo;
 
   private String nombre; 

    public ListaMinxArea(String nombreLista) {
        nombre = nombreLista;
        cabeza = ultimoNodo = null;
    }

    public void insertarCima(int codigoA,  int valorMinuto) {
        if (estaVacia()) {
            cabeza = ultimoNodo = new NodoMinxArea(codigoA,  valorMinuto);
        } else {
            cabeza = new NodoMinxArea(codigoA, valorMinuto, cabeza);
        }
    }

    public void insertarAlFinal(int codigoA, int valorMinuto) {
        if (estaVacia()) {
            cabeza = ultimoNodo = new NodoMinxArea(codigoA, valorMinuto );
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new NodoMinxArea(codigoA, valorMinuto);
        }
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public String imprimir() {
        String impresion = " ";

//      impresion += "La pila es: "+ nombre ;
        NodoMinxArea actual = cabeza;

        // mientras no est� al final de la lista, imprime los datos del nodo actual
        while (actual != null) {
            impresion += "Codigo Area: " + actual.getCodigoA() +  "-  Valor minuto: " + actual.getValorMinuto() +"\n";
            actual = actual.siguienteNodo;
        } // fin de while

        impresion += "\n";

        return impresion;
    } 
    
    public NodoMinxArea buscarNodo(int cod) {
        
        NodoMinxArea aux = cabeza; 

        while (aux != null) { 
            if (aux.getCodigoA() == cod) {
                return aux;
            }
            aux = aux.siguienteNodo; 
        }
        return null; 
    }
     public int cantidadNodos() {
        int can = 0; /* empezamos con cantidad igual a 0  */
        NodoMinxArea aux = primerNodo; /* decimos que el auxiliar es igual a cabeza osea posicion1  */
        while (aux != null) { /* ciclo hasta que el auxiliar sea nulo  */
            can++; /* aumente la cantidad  */
            aux = aux.siguienteNodo; /* y el auxiliar sea de siguiente en siguiente  */
        }/* cantidad lo que hace es contar el numero de veces que auxiliar se mueve  */
        System.out.println("cant " + can);
        return can; /*  retorna el valor de cantidad */

    }
   
   public NodoMinxArea getActual(){
       return actualNodo;
   }
   
   public boolean ultimo(){
       actualNodo = ultimoNodo;
       return true;
   }
   
   public boolean first(){
       actualNodo = primerNodo;
       return true;
   }
   
   public boolean anterior() {
       NodoMinxArea antNodo = primerNodo;
        if (ultimoNodo == null) {
            return false;
        }
        if(actualNodo == primerNodo){
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
        if (primerNodo == null) {
            return false;
        }
        if (actualNodo == null) {
            actualNodo = primerNodo;
            return true;
        } else {
            if (actualNodo.siguienteNodo != null) {
                actualNodo = actualNodo.siguienteNodo;
                return true;
            } else {
                return false;
            }
        }
    }
    
    
}
