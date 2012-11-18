package punto5;

import javax.swing.JOptionPane;

public class NewMain {



    public static void main(String[] args) {
        int codigoArea;
        String telefono;
        int duracion;
        String nroCabina;
        int cantidadTotal = 0;


        ListaMinxArea llamadaxMinuto = new ListaMinxArea("llamada x minuto");
        llamadaxMinuto.insertarCima(01, 100);
        llamadaxMinuto.insertarCima(02, 200);
        llamadaxMinuto.insertarCima(03, 300);
        llamadaxMinuto.insertarCima(04, 1000);
        ListaLlamada llamada = new ListaLlamada("llamada");

        do {
            codigoArea = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el codigo del area (1-4)"));
            telefono = JOptionPane.showInputDialog("Numero telefonico de Destino");
            duracion = Integer.parseInt(JOptionPane.showInputDialog("Minutos de duracion"));
            nroCabina = JOptionPane.showInputDialog("Numero de cabina\n 1.Cabina 1 \n 2. cabina 2 \n 3. Cabina 3");

            llamada.insertarCima(codigoArea, telefono, telefono, duracion, nroCabina);
            NodoMinxArea nodoMinxArea = llamadaxMinuto.buscarNodo(codigoArea);
            nodoMinxArea.getValorMinuto();

            // Calcular valor Llamada

            int valorLlamar = duracion * nodoMinxArea.getValorMinuto();
            cantidadTotal += valorLlamar;  //  Cantidad de dinero recolectado.

            JOptionPane.showMessageDialog(null, "El valor de la llamada es " + valorLlamar);

        } while (JOptionPane.showConfirmDialog(null, "Ingresar otra llamada") == JOptionPane.YES_OPTION);

        //while para recorrer la lista
        // Cantidad de dinero recolectado por area.
        // Cantidad de minutos llamados por cabina.
        // Cantidad de dinero recolectado por cabina.
        int minLlamadaArea1 = 0;
        int minLlamadaArea2 = 0;
        int minLlamadaArea3 = 0;
        int minLlamadaArea4 = 0;

        int minLlamadaCabina1 = 0;
        int minLlamadaCabina2 = 0;
        int minLlamadaCabina3 = 0;

        int dineroLlamadasCabina1 = 0;
        int dineroLlamadasCabina2 = 0;
        int dineroLlamadasCabina3 = 0;
        int TotalDineroRecolectado = 0;

        while (llamada.next()) {
            codigoArea = llamada.getActual().codigoA;
            NodoMinxArea nodoMinxArea = llamadaxMinuto.buscarNodo(codigoArea);
            TotalDineroRecolectado += nodoMinxArea.getValorMinuto() * llamada.getActual().getDuracion();
            System.out.println(TotalDineroRecolectado);
            if (llamada.getActual().codigoA == 01) {
                minLlamadaArea1 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().codigoA == 02) {
                minLlamadaArea2 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().codigoA == 03) {
                minLlamadaArea3 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (llamada.getActual().codigoA == 04) {
                minLlamadaArea4 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }

            if (Integer.parseInt(llamada.getActual().nroCabina) == 1) {
                minLlamadaCabina1 += llamada.getActual().duracion;
                dineroLlamadasCabina1 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (Integer.parseInt(llamada.getActual().nroCabina) == 2) {
                minLlamadaCabina2 += llamada.getActual().duracion;
                dineroLlamadasCabina2 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;
            }
            if (Integer.parseInt(llamada.getActual().nroCabina) == 3) {
                minLlamadaCabina3 += llamada.getActual().duracion;
                dineroLlamadasCabina3 += llamada.getActual().duracion * nodoMinxArea.valorMinuto;

            }

        }

        String resultado ="Cantidad de dinero recolectado :  $"+TotalDineroRecolectado
                + "\n\nCantidad de dinero recolectado por área"
                + "\n    Area 1 :  $"+minLlamadaArea1
                + "\n    Area 2 :  $"+minLlamadaArea2
                + "\n    Area 3 :  $"+minLlamadaArea3
                + "\n    Area 4 :  $"+minLlamadaArea4
                + "\n\nCantidad de minutos llamados por cabina"
                + "\n    Cabina 3 :  "+minLlamadaCabina1+" min"
                + "\n    Cabina 3 :  "+minLlamadaCabina2+" min"
                + "\n    Cabina 3 :  "+minLlamadaCabina3+" min"
                + "\n\nCantidad de dinero recolectado por cabina"
                + "\n    Cabina 1 :  $"+dineroLlamadasCabina1
                + "\n    Cabina 2 :  $"+dineroLlamadasCabina2
                + "\n    Cabina 3 :  $"+dineroLlamadasCabina3
                + "";

        JOptionPane.showMessageDialog(null, resultado);

    }
}
