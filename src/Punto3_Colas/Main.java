package Punto3_Colas;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ColaCliente clientes = new ColaCliente();
        Lista caja1 = new Lista("Caja 1");
        Lista caja2 = new Lista("Caja 2");
        Lista caja3 = new Lista("Caja 3");
        int numClientes = 1;
        
        clientes.enqueue(numClientes++);
        clientes.enqueue(numClientes++);

        
        while (!clientes.estaVacia()) { 
            Random rCliente = new Random();
            int ingresaCliente = rCliente.nextInt(10);
            if(ingresaCliente>7){// se usa para que haya mas probabilidad de que no lleguen mas clientes a que lleguen
                clientes.enqueue(numClientes++);
            }
           
            Random rCaja = new Random();
            int caja = rCaja.nextInt(3) + 1;
            
            JOptionPane.showMessageDialog(null, "La caja "+caja+" esta disponible");
            clientes.dequeue();
            
            String nCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
            String tipoTransaccion = JOptionPane.showInputDialog("Ingrese el tipo de transaccion\n1)consignacion\n2)retiro");
            String tipoCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta\n1)ahorros\n2)corriente");
            int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto"));
            
            System.out.println(monto);
            switch (caja){
                case 1:
                    caja1.insertarAlFinal(nCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
                    break;
                case 2:
                    caja2.insertarAlFinal(nCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
                    break;
                case 3:
                    caja3.insertarAlFinal(nCuenta, fecha, tipoTransaccion, tipoCuenta, monto);
                    break;
            }
        }
        
        Lista cajas = new Lista("Total");
        cajas.Add(caja1);
        cajas.Add(caja2);
        cajas.Add(caja3);

        JOptionPane.showMessageDialog(null, cajas.imprimir());
        
        int totalConsignado =0;
        int totalRetirado=0;
        int totalAhorros =0;
        int totalCorriente =0;
        int cantidadClientes=0;
        
        while(cajas.next()){
            if(cajas.getActual().tipoTransaccion.equals("1")){
                totalConsignado+=cajas.getActual().getMonto();
            }
            if(cajas.getActual().tipoTransaccion.equals("2")){
                totalRetirado+=cajas.getActual().getMonto();
            }
            
            if(cajas.getActual().tipoCuenta.equals("1")){
                totalAhorros+=cajas.getActual().getMonto();
            }
            if(cajas.getActual().tipoTransaccion.equals("2")){
                totalCorriente+=cajas.getActual().getMonto();
            }
            cantidadClientes++;
        }
        
        JOptionPane.showMessageDialog(null, "Total Consignado:"+totalConsignado+"\n"
                + "Total Retirado: "+totalRetirado+"\n"
                + "Total Ahorros:  "+totalAhorros+"\n"
                + "Total Corriente: "+totalAhorros+"\n"
                + "Total Corriente: "+totalCorriente+"\n"
                + "Num Clientes:" + cantidadClientes);
        
    }
}
