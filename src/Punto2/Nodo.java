/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;


class Nodo 
{
 
   int cedula;  
   String nombres;
   int salario;
   String apellidos;
   Nodo siguienteNodo; // referencia al siguiente nodo en la lista

   // el constructor crea un Nodo que hace referencia al objeto (sin enlazarlo),
   //llama al constructor de abajo.
   Nodo(int cedula, String nombres, String apellidos, int salario) 
   { 
      this(cedula, nombres, apellidos, salario, null); 
   } 
   
// el constructor que enlaza con el nodo siguiente
   
   Nodo(int cedula, String nombres, String apellidos, int salario, Nodo nodo )
   {
      this.cedula = cedula;
      this.nombres = nombres;
      this.apellidos = apellidos;
      this.salario = salario;
      this.siguienteNodo = nodo;  
   } 
// métodos para obtener los datos del Nodo 
    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public int getSalario() {
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
