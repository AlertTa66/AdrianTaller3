
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

//~--- JDK imports ------------------------------------------------------------

/**
 *
 * @author aDRiaN
 */


import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Taller_No_3 {
    private JTextArea pantalla = new JTextArea(5, 10);
    int               arr[];

    /**
     * @param args the command line arguments
     */
    Nodo cabeza;
    int  x;

    public static void main(String[] args) {
        Estudiantes lista = new Estudiantes();    // para usar las listas
        String      op    = "";                   // variable para el switch

        do {    // comienzo del ciclo
            op = JOptionPane.showInputDialog(
                "1. Agregar un nuevo Estudiante.\n "
                    + "2. Eliminar un Estudiante\n "
                    + "3. Modificar un Estudiante.\n "
                    + "4. Ordenar.\n "
                    + "5. Mostrar Lista.\n "
                    + "6. Salir.");

            // se usa un cuadro de dialogo de tipo entrada el cual recibira la opcion
            switch (op) {
            case "1" :

                // si se elige la opcion a se muestra el siguiente mensaje
                
                // Define variable entero x la cual se agrega en un cuadro de dialogo
                int x = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo de Estudiante"));
                
                // Define variable cadena y la cual se agrega en un cuadro de dialogo
                String y = (JOptionPane.showInputDialog("Digite Primer Apellido"));

                // Define variable cadena z la cual se agrega en un cuadro de dialogo
                String z = (JOptionPane.showInputDialog("Digite Segundo apellido"));

                // Se añaden los datos registrados a la cadena en su respectivo orden x,y y z
                String aa = (JOptionPane.showInputDialog("Digite Nombre"));

                // Se añaden los datos registrados a la cadena en su respectivo orden x,y y z

                lista.insertarFinal(x, y, z, aa);

                /*// Agrega unos datos extras, no vi donde mas poner esto
                String y2  = "Garcia";
                int    x2  = 1;
                String z2  = "Bolaños";
                String aa2 = "Diana";

                lista.insertarFinal(x2, y2, z2, aa2);

                String y3  = "Salcedo";
                int    x3  = 2;
                String z3  = "Perez";
                String aa3 = "Carlos";

                lista.insertarFinal(x3, y3, z3, aa3);*/

                break;

            case "2" :

                // Llama a eliminar posicion el cual con el codigo busca y elimina
                lista.eliminarPosicion(
                    Integer.parseInt(
                        JOptionPane.showInputDialog("Que Estudiante desea eliminar?  \nDigite su posicion")));    /* llama al metodo para eliminar posicion3 */
                JOptionPane.showMessageDialog(null, "Eliminado");    // mensaje de confirmacion

                break;

            case "3" :
                String texto = "";
                // llama al metodo buscar nodo, pregunta primero el codigo del estudiante
                int codigo =Integer.parseInt(
                                   JOptionPane.showInputDialog(
                                       "Digite el codigo del Estudiante a buscar"));
                Nodo nodo = lista.buscarNodo(codigo);
                // lo guarda en una variable nodo la busqueda y la imprime en el siguiente mensaje
                
                if(nodo != null){
                    texto+="codigo\t - Nombres y apellidos\n";
                    texto=nodo.dato+" \t- "+nodo.dato2+ " " + nodo.dato3+ " " + nodo.dato4+"\n";
                } else {
                    texto+="No se encontro el estudiante con codigo "+codigo;
                }

                JOptionPane.showMessageDialog(null, texto);

                break;

            case "4" :

                
                JOptionPane.showMessageDialog(null, "No de Elementos de la lista.");

                // Crea un entero n1 el cual guarda la consulta de listacantidad de nodos
                int n1 = lista.cantidadNodos();

                JOptionPane.showMessageDialog(null, n1);    // imprime la busqueda

                // lista.iniciar(); //llama a iniciar donde registra los codigos no supe como pasarselos sin que los pidiera
                // lista.despliega();//despliega los datos desordenados y luego ordenados
                break;

            case "5" :
                JOptionPane.showMessageDialog(null, lista.mostrarLista());    // muestra la lista

                break;

            case "6" :

                // si se elige la opcion d se cierra o finaliza la aplicacion
                System.exit(0);    // comando para cerrar las aplicaciones

                break;

            default :

                // si la opcion ingresada es diferente a las mostradas se muestra el siguiente mensaje
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");

                break;
            }
        } while (!op.equals("d"));    // finaliza el ciclo con la condicional que hay dentro del while

        System.exit(0);    /* sale del sistema al ejecutar el main */
    }    /* De aqui para abajo puede tener codigos y llamarlos sin ningun problema */

    /* 5.       Creamos una parte de eliminar */
    public void eliminarPrimero() {
        cabeza = cabeza.siguiente;

        /* Decimos que la cabeza sea cabeza.siguiente */
        /* Osea que el primer cabeza ya no existiria en los nodos */
    }

    /* 6. Creamos una parte de eliminar ultimo */
    public void eliminarFinal() {
        Nodo ant = cabeza;              /* El nodo anterior es igual a cabeza */
        Nodo aux = cabeza.siguiente;    /* el auxiliar ahora es uno mas adelante */

        /* que la cabeza */
        while (aux.siguiente != null) {    /* Ciclo  hasta siguiente ser null */
            ant = ant.siguiente;           /* el anterior es el anterior con el siguiente */
            aux = aux.siguiente;           /* Asi se mueve al siguiente nodo */
        }

        ant.siguiente = null;    /* se le pone que al terminar el ciclo */

        /* osea al ser anterior el penultimo se le dice que el siguiente */
        /*  */
    }

    /* 7. Creamos una parte de eliminar posicion dada */
    public void eliminarPosicion(int x) {    /* dise que insertaremos x */

        /* ese x lo insertamos mas adelante en el main */
        if (x == 1) {                                 /* si x es igual a 1 entonces */
            eliminarPrimero();                        /* llame al metodo eliminar primero */
        } else {
            if (x == 8) {                             /* si es igual a 8 siendo 8 el numero de nodos */
                eliminarFinal();                      /* llama al metodo eliminar final */
            } else {                                  /* si no entonces haga lo siguiente */
                Nodo ant       = cabeza;              /* decimos que anterior es igual a cabeza */
                Nodo actual    = cabeza.siguiente;    /* actual es el que sigue de cabeza */
                Nodo siguiente = actual.siguiente;    /* y siguiente es despues de actual */
                int  can       = 2;                   /* cantidad 2 osea empieza desde la posicion 2 */

                while (can != x) {                    /* ciclo hasta que cantidad sea diferente de x */
                    can++;                            /* cantidad aumenta de 1 en uno */
                    ant = ant.siguiente;              /* cuando eso entonces se movera asi */

                    /* anterior sera anterior siguiente */
                    actual    = actual.siguiente;       /* actual sera el que sigue */
                    siguiente = siguiente.siguiente;    /* siguiente sera el que sigue */
                }                                       /* cuando se termine anterior */

                ant.siguiente = siguiente;              /* anterior.siguiente sera siguiente */

                /* osea se salta uno y lo borra y ese sera el numero que el damos */
            }
        }
    }

    /* 8. Creamos metodo para ver la cantidad de nodos */
    public int cantidadNodos() {
        int  can = 0;         /* empezamos con cantidad igual a 0 */
        Nodo aux = cabeza;    /* decimos que el auxiliar es igual a cabeza osea posicion1 */

        while (aux != null) {       /* ciclo hasta que el auxiliar sea nulo */
            can++;                  /* aumente la cantidad */
            aux = aux.siguiente;    /* y el auxiliar sea de siguiente en siguiente */
        }                           /* cantidad lo que hace es contar el numero de veces que auxiliar se mueve */

        return can;    /* retorna el valor de cantidad */
    }

    /* 9. Creamos metodo para buscar un nodo */
    public String buscarNodo(int n) {    /* le vamos a pasar en main el valor n */
        int    can        = 1;         /* Iniciamos con la cantidad igual a 1 */
        Nodo   aux        = cabeza;    /* Decimos que auxiliar esta desde la posicion 1 */
        String encontrado = null;

        while (aux.dato != 0) {     /* Ciclo hasta que el dato de auxiliar sera diferente de n */
            can++;                  /* Cantidad se aumenta de 1 en 1 contando la posicion de auxiliar */

            if (aux.dato == n) {
                encontrado = aux.dato3;

                return encontrado;
            }

            aux = aux.siguiente;    /* Auxiliar sera siguiente en siguiente */
        }

        return encontrado;    /* retorna el valor de cantidad osea donde esta el dato buscado */
    }

//  inicia la parte de ordenar    
    public void iniciar() {
        capturaArreglo();
        despliega();
        ordenar(arr, 0);
        despliega();
    }

    public void capturaArreglo() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero anterior"));

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo Departamento[" + i + "]"));
        }
    }

    public void ordenar(int v[], int in)    /* int [] v, int cant */
    {
        if (in < v.length) {
            int men = v[in];
            int pos = in;

            for (int i = in; i < v.length; i++) {
                if (v[i] < men) {
                    men = v[i];
                    pos = i;

                    int aux = v[in];

                    v[in]  = men;
                    v[pos] = aux;
                }
            }

            ordenar(v, in + 1);
        }
    }

    public void despliega() {
        pantalla.append("Codigos departamentos\n");

        for (int i = 0; i < arr.length; i++) {
            pantalla.append(arr[i] + "\t");
        }

        pantalla.append("\n");
        JOptionPane.showMessageDialog(null, pantalla);
    }    // TODO code application logic here
}


//~ Formatted by Jindent --- http://www.jindent.com
