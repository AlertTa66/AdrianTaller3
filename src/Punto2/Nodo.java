/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


class Nodo 
{
 
   String cedula;  
   String nombres;
   String salario;
   String apellidos;
   Nodo siguienteNodo; // referencia al siguiente nodo en la lista

   // el constructor crea un Nodo que hace referencia al objeto (sin enlazarlo),
   //llama al constructor de abajo.
   Nodo(String cedula, String nombres, String apellidos, String salario) 
   { 
      this(cedula, nombres, apellidos, salario, null ); 
   } 
   
// el constructor que enlaza con el nodo siguiente
   
   Nodo(String cedula, String nombres, String apellidos, String salario, Nodo nodo )
   {
      this.cedula = cedula;
      this.nombres = nombres;
      this.apellidos = apellidos;
      this.salario = salario;
      siguienteNodo = nodo;  
   } 
// métodos para obtener los datos del Nodo 
    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getSalario() {
        return salario;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }
    
    // obtiene el siguiente nodo

   Nodo obtenerSiguiente() 
   { 
      return siguienteNodo; 
   } 
} 
