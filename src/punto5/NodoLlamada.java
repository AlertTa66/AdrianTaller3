/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

  class NodoLlamada 
{
   int codigoA;    
   String telefono;
   String destino;
   int duracion;
   String nroCabina;
   NodoLlamada siguienteNodo; 

   NodoLlamada(int codigoA, String telefono, String destino, int duracion, String nroCabina) 
   { 
      this(codigoA, telefono,destino,duracion,nroCabina, null); 
   } 

   NodoLlamada( int codigoA, String telefono, String destino, int duracion, String nroCabina, NodoLlamada nodo )
   {
      this.codigoA = codigoA;
      this.telefono = telefono;
      this.destino = destino;
      this.duracion = duracion;
      this.nroCabina= nroCabina;
      
      siguienteNodo = nodo;  
   } 

 
   public int getCodigoA() {
        return codigoA;
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNroCabina() {
        return nroCabina;
    }

    public NodoLlamada getSiguienteNodo() {
        return siguienteNodo;
    }

    public String getTelefono() {
        return telefono;
    }
   
   
   

   NodoLlamada obtenerSiguiente() 
   { 
      return siguienteNodo; 
   }
}  