/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

/**
 *
 * @author aDRiaN
 */
public class Estudiantes {
    
    Nodo cabeza; /* Nombre que referencia donde esta el objeto ej inicio*/

    Estudiantes() {
        cabeza = null; /* cabeza queda apuntando a nulo  */
    }
    
    public void insertarPrimero(int x, String y, String z,String aa) {
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        nuevo.dato2 = y;
        nuevo.dato3 = z;
        nuevo.dato4 = aa;
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void insertarPosicion(int x, int cod, String apel1, String apel2,String nom) {

        if (x == 1) {
        } else {
            if (x == 8) {
                insertarFinal(cod, apel1, apel2,nom);
            } else {
                Nodo ant = cabeza;
                Nodo actual = cabeza.siguiente;
                int can = 2;
                while (can != x) {

                    can++;
                    ant = ant.siguiente;
                    actual = actual.siguiente;


                }
                Nodo insertar = new Nodo();
                insertar.dato = cod;
                insertar.dato2 = apel1;
                insertar.dato3 = apel2;
                insertar.dato4 = apel2;
                ant.siguiente = insertar;
                insertar.siguiente = actual;
            }
        }
    }


    /*  4.	Ahora creamos una parte llamada insertar ultimo, para ello hay * que hacer 
     * forma de recorrer la lista o tener un apuntador que defina el ultimo nodo. */
    public void insertarFinal(int x, String y, String z, String aa) {
        Nodo aux = cabeza;  /*
         * Creamos una variable de tipo nodo
         */
        /*
         * apunta a donde apunta cabeza
         */
        Nodo ant = cabeza;  /*
         * creamos anterior
         */
        Nodo nuevo = new Nodo();
        nuevo.dato = x;
        nuevo.dato2 = y;
        nuevo.dato3 = z;
        nuevo.dato4 = aa;
        /*
         * insertar nuevo dato
         */
        if (aux == null) { // se verifica si es el primer elemento, 
            nuevo.siguiente = null;
            cabeza = nuevo;
        } else {
            while (aux.siguiente != null) {  
                /*asignele a aux siguiente ciclo hasta que sea nulo*/
                aux = aux.siguiente;  /*le da a aux el siguiente*/
            }
            nuevo.siguiente = null;  /*
             * el nuevo elemento sera el siguiente
             */
            aux.siguiente = nuevo;  /*
             * auxiliar seria el nuevo objeto
             */
        }

    }

    /* 4.1	Creamos método que imprima lo que insertamos en la lista  */
    public String mostrarLista() {
        //  JTextArea pantalla=new JTextArea(6,40); /* Creamos un recuadro de 6 x 40  */

        String pantalla = "";
        pantalla += "Listado de Estudiantes\n"; /* Abre el listado  */
        Nodo aux; /*  nodo auxiliar */
        aux = cabeza; /*  auxiliar sera la cabeza */
        pantalla+="Codigo - Nombre y Apellidos\n";
        while (aux != null) /*  ciclo hasta que auxiliar sea nulo */ {
            pantalla += aux.dato + " - " + aux.dato2 + " " + aux.dato3 + " " + aux.dato4 +"\n"; /*  pantalla tendra entonces */
            /*  los datos de auxiliar */
            aux = aux.siguiente;
        } 
           
    /* cuando termine el ciclo devolvera el mensaje con la pantalla de los datos  */
        return pantalla;
    }
    /* 4.2 Metodo para controlar todo lo que se hace en el proyecto  */

//    public static void main(String[] args) {
//        String nombre;
//        /*  Todo lo que esta con / no se ejecutara lo demas si */
//        Listas lista = new Listas();
////       JOptionPane.showMessageDialog(null,"Lista Vacia: "+lista.validarLista()); //
//         /*  llama el metodo que dice si esta vacia la lista */
////        JOptionPane.showMessageDialog(null,"Lista Vacia: "+lista.cantidadNodos());
//         /* llama el metodo que dice la cantidad de datos en la lista  */
//
//
//        String y = (JOptionPane.showInputDialog("Digite el Nombre del Primer Departamento"));
//        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo del Primer Departamento"));
//        String z = (JOptionPane.showInputDialog("Digite la Capital"));
//        lista.insertarPrimero(x, y, z);
//        String y1 = (JOptionPane.showInputDialog("Digite el Nombre del Segundo Departamento"));
//        int x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Codigo del Segundo Departamento"));
//        String z1 = (JOptionPane.showInputDialog("Digite la Capital"));
//        lista.insertarFinal(x1, y1, z1);
//
//
//        /* lista.mostrarLista();  /* llama al metodo que muestra la lista  */
//        // lista.eliminarPrimero(); /* llama al metodo de eliminar el primero  */
//
//        /* Aqui es donde ponemos que posicion queremos eliminar  */
//        // lista.eliminarFinal();    /* llama al metodo elimina el ultimo  */
//        // lista.insertarPosicion(4, 88);    /*  inserta dato 88 en posicion 4 */
//
//        //JOptionPane.showMessageDialog(null, posicion);    /*  mensaje */
//        lista.mostrarLista();    /* vuelve a mostrar la lista para ver cambios  */
//        //lista.eliminarPosicion(Integer.parseInt(JOptionPane.showInputDialog("Que Departamento desea eliminar?  \nDigite su posicion"))); /* llama al metodo para eliminar posicion3  */
//        //lista.mostrarLista();    /* vuelve a mostrar la lista para ver cambios  */
//        String n = lista.buscarNodo(Integer.parseInt(JOptionPane.showInputDialog("Que Capital busca? \n Digite el codigo del departamento")));    /* busca nodo 1  */
//        JOptionPane.showMessageDialog(null, n);
//        //JOptionPane.showMessageDialog(null,"Lista Vacia: "+lista.cantidadNodos());
//           /*  llama un mensaje lista vacia y cantidad de nodos */
//        //JOptionPane.showMessageDialog(null,"Lista Vacia: "+lista.validarLista());
//           /* llama un mensaje con lista vacia y validar lista   */
//
//        System.exit(0);    /* sale del sistema al ejecutar el main  */
//    }   /* De aqui para abajo puede tener codigos y llamarlos sin ningun problema  */

    /* 5.	Creamos una parte de eliminar primero */
    public void eliminarPrimero() {

        cabeza = cabeza.siguiente;
        /* Decimos que la cabeza sea cabeza.siguiente  */
        /* Osea que el primer cabeza ya no existiria en los nodos  */
    }

    /* 6. Creamos una parte de eliminar ultimo */
    public void eliminarFinal() {
        Nodo ant = cabeza;   /* El nodo anterior es igual a cabeza  */
        Nodo aux = cabeza.siguiente;   /* el auxiliar ahora es uno mas adelante  */
        /* que la cabeza  */
        while (aux.siguiente != null) {   /* Ciclo  hasta siguiente ser null*/
            ant = ant.siguiente; /* el anterior es el anterior con el siguiente  */
            aux = aux.siguiente; /* Asi se mueve al siguiente nodo  */
        }
        ant.siguiente = null; /* se le pone que al terminar el ciclo  */
        /* osea al ser anterior el penultimo se le dice que el siguiente  */
        /*   */
    }
    /* 7. Creamos una parte de eliminar posicion dada*/

    public void eliminarPosicion(int x) { /* dise que insertaremos x  */
        /* ese x lo insertamos mas adelante en el main  */
        if (x == 1) { /* si x es igual a 1 entonces */
            eliminarPrimero(); /*  llame al metodo eliminar primero */
        } else {
            if (x == cantidadNodos()) { /* si es igual a 8 siendo 8 el numero de nodos */
                eliminarFinal();/* llama al metodo eliminar final  */
            } else { /* si no entonces haga lo siguiente  */
                Nodo ant = cabeza; /* decimos que anterior es igual a cabeza  */
                Nodo actual = cabeza.siguiente; /* actual es el que sigue de cabeza  */
                Nodo siguiente = actual.siguiente; /* y siguiente es despues de actual  */
                int can = 2; /* cantidad 2 osea empieza desde la posicion 2  */
                while (can != x) { /* ciclo hasta que cantidad sea diferente de x  */
                    can++; /* cantidad aumenta de 1 en uno  */
                    ant = ant.siguiente; /* cuando eso entonces se movera asi  */
                    /* anterior sera anterior siguiente  */
                    actual = actual.siguiente; /* actual sera el que sigue  */
                    siguiente = siguiente.siguiente; /* siguiente sera el que sigue  */
                }/*  cuando se termine anterior */
                ant.siguiente = siguiente; /* anterior.siguiente sera siguiente  */
                /*  osea se salta uno y lo borra y ese sera el numero que el damos */
            }
        }
    }
    /* 8. Creamos metodo para ver la cantidad de nodos  */

    public int cantidadNodos() {
        int can = 0; /* empezamos con cantidad igual a 0  */
        Nodo aux = cabeza; /* decimos que el auxiliar es igual a cabeza osea posicion1  */
        while (aux != null) { /* ciclo hasta que el auxiliar sea nulo  */
            can++; /* aumente la cantidad  */
            aux = aux.siguiente; /* y el auxiliar sea de siguiente en siguiente  */
        }/* cantidad lo que hace es contar el numero de veces que auxiliar se mueve  */
        System.out.println("cant " + can);
        return can; /*  retorna el valor de cantidad */

    }
    /* 9. Creamos metodo para buscar un nodo  */

    public Nodo buscarNodo(int cod) { /* le vamos a pasar en main el valor n  */
        Nodo aux = cabeza; /* Decimos que auxiliar esta desde la posicion 1  */

        while (aux != null) { /* Ciclo hasta que el dato de auxiliar sera diferente de n  */
            if (aux.dato == cod) {
                return aux;/* retorna el valor de cantidad osea donde esta el dato buscado  */
            }
            aux = aux.siguiente; /* Auxiliar sera siguiente en siguiente  */
        }
        return null; // retorna null cuando no lo encuentra
    }

    public Nodo buscarNodoXDep(String dep) { /* le vamos a pasar en main el valor n  */
        int can = 1; /*  Iniciamos con la cantidad igual a 1 */
        Nodo aux = cabeza; /* Decimos que auxiliar esta desde la posicion 1  */

        Nodo encontrado = null;

        while (aux != null && aux.dato != 0) { /* Ciclo hasta que el dato de auxiliar sera diferente de n  */
            can++; /* Cantidad se aumenta de 1 en 1 contando la posicion de auxiliar  */
            if (aux.dato2.equalsIgnoreCase(dep)) {
                encontrado = aux;
                return encontrado;/* retorna la capital de el departamento que esta buscando  */
            }
            aux = aux.siguiente; /* Auxiliar sera siguiente en siguiente  */
        }
        return encontrado; // retorna null cuando no lo encuentra
    }

    public void ordenarXApellido() {

        Nodo aux1 = cabeza;
        Nodo aux2 = null;
        Nodo naux = new Nodo();

        while (aux1 != null) {
            aux2 = aux1;

            while (aux2.siguiente != null) {
                aux2 = aux2.siguiente;

                if (aux1.dato3.compareTo(aux2.dato3)>0) {// esto es para intercambiar 2 nodos
                    naux.dato = aux1.dato;
                    naux.dato2 = aux1.dato2;
                    naux.dato3 = aux1.dato3;
                     naux.dato4 = aux1.dato4;
                    aux1.dato = aux2.dato;
                    aux1.dato2 = aux2.dato2;
                    aux1.dato3 = aux2.dato3;
                     aux1.dato4 = aux2.dato4;
                    aux2.dato = naux.dato;
                    aux2.dato2 = naux.dato2;
                    aux2.dato3 = naux.dato3;
                    aux2.dato4 = naux.dato4;
                }
            }
            aux1 = aux1.siguiente;
        }
    }

    //no funciona ?
    public void ordenarXCodigo() {
        Nodo aux1 = cabeza;
        Nodo aux2 = null;
        Nodo naux = new Nodo();

        while (aux1 != null) {
            aux2 = aux1;

            while (aux2.siguiente != null) {
                aux2 = aux2.siguiente;

                if (aux1.dato > aux2.dato) {
                    naux.dato = aux1.dato;
                    naux.dato2 = aux1.dato2;
                    naux.dato3 = aux1.dato3;
                    naux.dato4 = aux1.dato4;
                    aux1.dato = aux2.dato;
                    aux1.dato2 = aux2.dato2;
                    aux1.dato3 = aux2.dato3;
                     aux1.dato4 = aux2.dato4;
                    aux2.dato = naux.dato;
                    aux2.dato2 = naux.dato2;
                    aux2.dato3 = naux.dato3;
                    aux2.dato4 = naux.dato4;
                    
                }
            }
            aux1 = aux1.siguiente;
        }

    }

    public Nodo obtenerNodoXPos(int pos) {
        if (pos < 1 || pos > cantidadNodos()) {
            return null;
        }
        if (pos == 1) {
            return cabeza;
        } else {
            Nodo ant = cabeza;
            Nodo actual = cabeza.siguiente;
            int can = 2;
            while (can != pos) {
                can++;
                ant = ant.siguiente;
                actual = actual.siguiente;
            }
            return actual;
        }
    }

    public int obtenerPosXcod(int cod) {
        int can = 1; /*  Iniciamos con la cantidad igual a 1 */
        Nodo aux = cabeza; /* Decimos que auxiliar esta desde la posicion 1  */

        while (aux != null) { /* Ciclo hasta que el dato de auxiliar sera diferente de n  */
            can++; /* Cantidad se aumenta de 1 en 1 contando la posicion de auxiliar  */
            if (aux.dato == cod) {
                return can;/* retorna la capital de el departamento que esta buscando  */
            }
            aux = aux.siguiente; /* Auxiliar sera siguiente en siguiente  */
        }
        return can; // retorna null cuando no lo encuentra

    }

    public Nodo minimo(int pos) {

        Nodo aux = obtenerNodoXPos(pos); /* Decimos que auxiliar esta desde la posicion 1  */

        Nodo encontrado = aux;// retornamos la posicion

        while (aux != null) { /* Ciclo hasta que el dato de auxiliar sera diferente de n  */
            if (aux.dato < encontrado.dato) {
                encontrado = aux;
                System.out.println("min" + encontrado.dato);
            }
            aux = aux.siguiente; /* Auxiliar sera siguiente en siguiente  */
        }
        return encontrado; // retorna el nodo menor

    }
//    public void ordenarXCodigo(Nodo nodo, int pos) {
//        if (pos < cantidadNodos()) {
//            Nodo min = nodo;
//            int aux = 0, posmin = pos;
//            while (min != null ) { /* Ciclo hasta que el dato de auxiliar sera diferente de n  */
//            pos++; /* Cantidad se aumenta de 1 en 1 contando la posicion de auxiliar  */
//            if (min.dato)) {
//                encontrado = aux.dato3;
//                return encontrado;/* retorna la capital de el departamento que esta buscando  */
//            }
//            aux = aux.siguiente; /* Auxiliar sera siguiente en siguiente  */
//        }
//            for (int i = pos; i < cantidadNodos(); i++) {
//                if (datos[i] < min) {
//                    posmin = i;
//                    min = datos[i];
//                }
//            }
//            aux = datos[pos];
//            datos[pos] = min;
//            datos[posmin] = aux;
//            ordenarXCodigo(datos, pos + 1);
//        }

    
}
