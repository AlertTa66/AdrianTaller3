/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import javax.swing.JOptionPane;


public class Lista 
{
   private Nodo cabeza;
   private Nodo ultimoNodo;
   private String nombre; //se utiliza para imprimir

   public Lista(){//constructor que crea una lista vacía
    
      this( "lista" );  
   } 

   // constrcutro crea una lista vacía, recibe un nombre
   public Lista( String nombreLista ) {
      nombre = nombreLista;
      cabeza = ultimoNodo = null; //inicializa primer y ultimo nodo en null
   } 

   // inserta el Nodo de primero
   public void insertarCima(int cedula, String nombres, String apellidos, int salario )
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new Nodo(cedula, nombres, apellidos, salario );
      else // cabeza hace referencia al nuevo nodo
         cabeza = new Nodo(cedula,nombres,apellidos,salario, cabeza );
   } 

   // inserta objeto Object al final del la Lista
   public void insertarAlFinal( int cedula, String nombres, String apellidos, int salario )
   {
      if ( estaVacia() ) // cabeza y ultimoNodo hacen referencia al mismo objeto
         cabeza = ultimoNodo = new Nodo( cedula, nombres, apellidos, salario );
      else // el siguienteNodo de ultimoNodo hace referencia al nuevo nodo
         ultimoNodo = ultimoNodo.siguienteNodo = new Nodo( cedula, nombres, apellidos, salario );
   } // fin del m�todo insertarAlFinal

   // elimina el primer nodo de la Lista
   public Nodo eliminarCima() 
   {
      if ( estaVacia() ){ 
          JOptionPane.showMessageDialog(null, "La lista está vacía");
          return null;
      }
      Nodo nodoEliminado =cabeza;
      //nodoEliminado.siguienteNodo = null; //eliminar t odo lo que corresponde a la lista que era la cabeza

      // actualiza las referencias cabeza y ultimoNodo 
      if ( cabeza == ultimoNodo )
         cabeza = ultimoNodo = null;
      else
         cabeza = cabeza.siguienteNodo;

      return nodoEliminado; // devuelve los datos del nodo eliminado
   } 
   
   public void ordenarXCedulaAsc() {

        Nodo aux1 = cabeza;
        Nodo aux2 = null;
        Nodo naux ;

        while (aux1 != null) {
            aux2 = aux1;

            while (aux2.siguienteNodo != null) {
                aux2 = aux2.siguienteNodo;

                if (aux1.cedula > aux2.cedula) {// esto es para intercambiar 2 nodos
                    naux = new Nodo(aux1.cedula, aux1.nombres, aux1.apellidos, aux1.salario);
                     
                    aux1.cedula = aux2.cedula;
                    aux1.nombres = aux2.nombres;
                    aux1.apellidos = aux2.apellidos;
                     aux1.salario = aux2.salario;
                     
                     aux2.cedula = naux.cedula;
                    aux2.nombres = naux.nombres;
                    aux2.apellidos = naux.apellidos;
                     aux2.salario = naux.salario;
                }
            }
            aux1 = aux1.siguienteNodo;
        }
    }
   
   public void ordenarXCedulaDesc() {

        Nodo aux1 = cabeza;
        Nodo aux2 = null;
        Nodo naux ;

        while (aux1 != null) {
            aux2 = aux1;

            while (aux2.siguienteNodo != null) {
                aux2 = aux2.siguienteNodo;

                if (aux1.cedula < aux2.cedula) {// esto es para intercambiar 2 nodos
                    naux = new Nodo(aux1.cedula, aux1.nombres, aux1.apellidos, aux1.salario);
                     
                    aux1.cedula = aux2.cedula;
                    aux1.nombres = aux2.nombres;
                    aux1.apellidos = aux2.apellidos;
                     aux1.salario = aux2.salario;
                     
                     aux2.cedula = naux.cedula;
                    aux2.nombres = naux.nombres;
                    aux2.apellidos = naux.apellidos;
                     aux2.salario = naux.salario;
                }
            }
            aux1 = aux1.siguienteNodo;
        }
    }
   
   public int cantidadNodos() {
        int can = 0; /* empezamos con cantidad igual a 0  */
        Nodo aux = cabeza; /* decimos que el auxiliar es igual a cabeza osea posicion1  */
        while (aux != null) { /* ciclo hasta que el auxiliar sea nulo  */
            can++; /* aumente la cantidad  */
            aux = aux.siguienteNodo; /* y el auxiliar sea de siguiente en siguiente  */
        }/* cantidad lo que hace es contar el numero de veces que auxiliar se mueve  */
        System.out.println("cant " + can);
        return can; /*  retorna el valor de cantidad */

    }
   
   public void invertir() {

        Nodo aux1 = cabeza;
        Nodo aux2 = null;
        Nodo naux ;
        int contFinal = this.cantidadNodos();
        int cont = 1;
        int contInicio = 1;
        

        while (aux1 != null) {
            aux2 = aux1;

            while (aux2.siguienteNodo != null && cont<contFinal) {
                aux2 = aux2.siguienteNodo;
                cont++;
            }
            
            naux = new Nodo(aux1.cedula, aux1.nombres, aux1.apellidos, aux1.salario);
            aux1.cedula = aux2.cedula;
            aux1.nombres = aux2.nombres;
            aux1.apellidos = aux2.apellidos;
            aux1.salario = aux2.salario;
            aux2.cedula = naux.cedula;
            aux2.nombres = naux.nombres;
            aux2.apellidos = naux.apellidos;
            aux2.salario = naux.salario;
         
            aux1 = aux1.siguienteNodo;
            contInicio++;
            cont = contInicio;
            contFinal--;
        }
    }
   
   
   // determina si la lista est� vac�a
   public boolean estaVacia()
   { 
      return cabeza == null; // devuelve true si la lista est� vac�a
   } // fin del m�todo estaVacia

   // imprime el contenido de la lista
   public String imprimir()
   {
      String impresion=" ";
   
//      impresion += "La pila es: "+ nombre ;
      Nodo actual = cabeza;

      // mientras no est� al final de la lista, imprime los datos del nodo actual
      while ( actual != null ) 
      {
         impresion += "Cedula: "+ actual.getCedula()+"-  Nombre: "+ actual.getNombres()+"-  Apellidos: " +actual.getApellidos()+"-  Salario:"+ actual.getSalario()+"\n";
         actual = actual.siguienteNodo;
      } // fin de while

      impresion += "\n" ;
      
      return impresion;
   } // fin del m�todo imprimir
} // fin de la clase Lista
