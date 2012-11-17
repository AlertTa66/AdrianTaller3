package Punto3_Colas;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo cabeza;
    private Nodo ultimoNodo;
    private String nombre; //se utiliza para imprimir
    private Nodo nodoActual;

    public Lista() {//constructor que crea una lista vacía

        this("lista");
    }

    public boolean next() {
        if (cabeza == null) {
            return false;
        }
        if (nodoActual == null) {
            nodoActual = cabeza;
            return true;
        } else {
            if (nodoActual.siguienteNodo != null) {
                nodoActual = nodoActual.siguienteNodo;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean first() {
        if (cabeza == null) {
            return false;
        }
        nodoActual = cabeza;
        return true;

    }
    
    public Nodo getActual(){
        return nodoActual;
    }

    public void Add(Lista lista2) {

        Nodo actual = lista2.cabeza;

        // mientras no est� al final de la lista, imprime los datos del nodo actual
        while (actual != null) {
            insertarAlFinal(actual.nroCuenta, actual.fecha, actual.tipoTransaccion, actual.tipoCuenta, actual.monto);
            actual = actual.siguienteNodo;
        } // fin de while
    }

    // constrcutro crea una lista vacía, recibe un nombre
    public Lista(String nombreLista) {
        nombre = nombreLista;
        cabeza = ultimoNodo = null; //inicializa primer y ultimo nodo en null
    }

    // inserta el Nodo de primero
    public void insertarPrimero(String nroCuenta, String fecha, String tipoTransaccion, String tipoCuenta, int monto) {
        if (estaVacia()) // cabeza y ultimoNodo hacen referencia al mismo objeto
        {
            cabeza = ultimoNodo = new Nodo(nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
        } else // cabeza hace referencia al nuevo nodo
        {
            cabeza = new Nodo(nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto, cabeza);
        }
    }

    // inserta objeto Object al final del la Lista
    public void insertarAlFinal(String nroCuenta, String fecha, String tipoTransaccion, String tipoCuenta, int monto) {
        if (estaVacia()) // cabeza y ultimoNodo hacen referencia al mismo objeto
        {
            cabeza = ultimoNodo = new Nodo(nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
        } else // el siguienteNodo de ultimoNodo hace referencia al nuevo nodo
        {
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(nroCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
        }
    } // fin del m�todo insertarAlFinal

    // elimina el primer nodo de la Lista
    public Nodo eliminarPrimero() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return null;
        }
        Nodo nodoEliminado = cabeza;
        //nodoEliminado.siguienteNodo = null; //eliminar todo lo que corresponde a la lista que era la cabeza

        // actualiza las referencias cabeza y ultimoNodo 
        if (cabeza == ultimoNodo) {
            cabeza = ultimoNodo = null;
        } else {
            cabeza = cabeza.siguienteNodo;
        }

        return nodoEliminado; // devuelve los datos del nodo eliminado
    }

    // determina si la lista est� vac�a
    public boolean estaVacia() {
        return cabeza == null; // devuelve true si la lista est� vac�a
    } // fin del m�todo estaVacia

    // imprime el contenido de la lista
    public String imprimir() {
        String impresion = " ";

//      impresion += "La pila es: "+ nombre ;
        Nodo actual = cabeza;

        // mientras no est� al final de la lista, imprime los datos del nodo actual
        while (actual != null) {
            impresion += "Nro Cuenta: " + actual.getNroCuenta() + "-  Fecha: " + actual.getFecha() + "-  Tipo Transaccion: " + actual.getTipoTransaccion() + "-  Tipo de cuenta:" + actual.getTipoCuenta()
                    + "-Monto :" + actual.getMonto() + "\n";
            actual = actual.siguienteNodo;
        } // fin de while

        impresion += "\n";

        return impresion;
    } // fin del m�todo imprimir
} // fin de la clase Lista
