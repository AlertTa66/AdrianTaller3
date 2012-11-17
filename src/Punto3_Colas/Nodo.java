/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3_Colas;


class Nodo 
{
 
   String nroCuenta;   
   String fecha;
   String tipoTransaccion;
   String tipoCuenta;
   int monto;
   Nodo siguienteNodo; // referencia al siguiente nodo en la lista

   
   Nodo(String nroCuenta, String fecha, String tipoTransaccion, String tipoCuenta, int monto) 
   { 
      this(nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto, null ); 
   } 
   
// el constructor que enlaza con el nodo siguiente
   
   Nodo(String nroCuenta, String fecha, String tipoTransaccion, String tipoCuenta, int monto, Nodo nodo )
   {
      this.nroCuenta = nroCuenta;
      this.fecha = fecha;
      this.tipoCuenta = tipoCuenta;
      this.tipoTransaccion = tipoTransaccion;
      this.monto = monto;
      siguienteNodo = nodo;  
   }        
    public String getFecha() {
        return fecha;
    }

    public int getMonto() {
        return monto;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    // obtiene el siguiente nodo

   Nodo obtenerSiguiente() 
   { 
      return siguienteNodo; 
   } 
} 
