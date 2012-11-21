package Punto3_Colas;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class EntidadBancariaGui extends javax.swing.JFrame {

    ColaCliente clientes;
    int caja;
    Lista caja1;
    Lista caja2;
    Lista caja3;
    int numClientes;

    public EntidadBancariaGui() {
        clientes = new ColaCliente();
        caja1 = new Lista("Caja 1");
        caja2 = new Lista("Caja 2");
        caja3 = new Lista("Caja 3");
        numClientes = 0;
        clientes.enqueue(++numClientes);
        clientes.enqueue(++numClientes);
        clientes.enqueue(++numClientes);


        initComponents();
        lbCaja1.setOpaque(true);
        lbCaja2.setOpaque(true);
        lbCaja3.setOpaque(true);
        lbCaja1.setBackground(Color.red);
        lbCaja2.setBackground(Color.red);
        lbCaja3.setBackground(Color.red);
        btnIngresarDatos.setEnabled(false);
        areaClientes.setText(clientes.imprimir());
        
        Random rCaja = new Random();
            caja = rCaja.nextInt(3) + 1;
            btnAtenderCliente.setEnabled(true);
            switch(caja){
                case 1:
                    lbCaja1.setBackground(Color.GREEN);
                    break;
               case 2:
                    lbCaja2.setBackground(Color.GREEN);
                    break;
              case 3:
                    lbCaja3.setBackground(Color.GREEN);
                    break;
                    
            }

        //while (!clientes.estaVacia()) { 


        //}


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaClientes = new javax.swing.JTextArea();
        lbCaja1 = new javax.swing.JLabel();
        lbCaja2 = new javax.swing.JLabel();
        lbCaja3 = new javax.swing.JLabel();
        btnAtenderCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCuenta = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();
        tfMonto = new javax.swing.JTextField();
        cbTransaccion = new javax.swing.JComboBox();
        cbCuenta = new javax.swing.JComboBox();
        btnIngresarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco AH");

        areaClientes.setColumns(20);
        areaClientes.setRows(5);
        jScrollPane1.setViewportView(areaClientes);

        lbCaja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaja1.setText("Caja 1");
        lbCaja1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCaja1.setName("labelCaja1"); // NOI18N

        lbCaja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaja2.setText("Caja 2");
        lbCaja2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCaja2.setName("labelCaja2"); // NOI18N

        lbCaja3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCaja3.setText("Caja 3");
        lbCaja3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCaja3.setName("labelCaja3"); // NOI18N

        btnAtenderCliente.setText("Atender Cliente");
        btnAtenderCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Nº Cuenta");

        jLabel5.setText("Fecha");

        jLabel6.setText("Tipo Transacción");

        jLabel7.setText("Tipo Cuenta");

        jLabel8.setText("Monto");

        tfCuenta.setName("tfCuenta"); // NOI18N

        tfFecha.setName("tfFecha"); // NOI18N

        tfMonto.setName("tfMonto"); // NOI18N
        tfMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMontoActionPerformed(evt);
            }
        });

        cbTransaccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consignación", "Retiro" }));
        cbTransaccion.setName("ComboTransaccion"); // NOI18N

        cbCuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahorro", "Corriente" }));
        cbCuenta.setName("comboCuenta"); // NOI18N

        btnIngresarDatos.setText("Ingresar Datos");
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtenderCliente)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCaja2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCuenta)
                            .addComponent(tfMonto)
                            .addComponent(tfFecha)
                            .addComponent(cbCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnIngresarDatos)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCaja2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtenderCliente))
                        .addGap(18, 18, 18)
                        .addComponent(lbCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresarDatos)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderClienteActionPerformed
        btnAtenderCliente.setEnabled(false);
        btnIngresarDatos.setEnabled(true);
        clientes.dequeue();
        areaClientes.setText(clientes.imprimir());
        lbCaja1.setBackground(Color.red);
        lbCaja2.setBackground(Color.red);
        lbCaja3.setBackground(Color.red);
    }//GEN-LAST:event_btnAtenderClienteActionPerformed

    private void tfMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMontoActionPerformed

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed

        btnIngresarDatos.setEnabled(true);
        String nCuenta = tfCuenta.getText();
        String fecha = tfFecha.getText();
        String tipoTransaccion = (String) cbTransaccion.getSelectedItem();
        String tipoCuenta = (String) cbCuenta.getSelectedItem();
        int monto ;
        try{
        monto = Integer.parseInt(tfMonto.getText());
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico en el campo Monto");
            return;
        }
        
        if(nCuenta.equals("")||fecha.equals("")||tipoTransaccion.equals("")||tipoCuenta.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        
        switch (caja) {
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

        if (!clientes.estaVacia()) {
            Random rCliente = new Random();
            int ingresaCliente = rCliente.nextInt(10);
            if (ingresaCliente > 5) {// se usa para que haya mas probabilidad de que no lleguen mas clientes a que lleguen
                clientes.enqueue(++numClientes);
            }

            areaClientes.setText(clientes.imprimir());
            Random rCaja = new Random();
            caja = rCaja.nextInt(3) + 1;
            btnAtenderCliente.setEnabled(true);
            switch(caja){
                case 1:
                    lbCaja1.setBackground(Color.GREEN);
                    break;
               case 2:
                    lbCaja2.setBackground(Color.GREEN);
                    break;
              case 3:
                    lbCaja3.setBackground(Color.GREEN);
                    break;
                    
            }
            
        }else{
            btnIngresarDatos.setEnabled(false);
        }
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

    public static void main(String args[]) {

//        ColaCliente clientes = new ColaCliente();
//        Lista caja1 = new Lista("Caja 1");
//        Lista caja2 = new Lista("Caja 2");
//        Lista caja3 = new Lista("Caja 3");
//        int numClientes = 1;
//        
//        clientes.enqueue(numClientes++);
//        clientes.enqueue(numClientes++);
//
//        
//        while (!clientes.estaVacia()) { 
//            Random rCliente = new Random();
//            int ingresaCliente = rCliente.nextInt(10);
//            if(ingresaCliente>7){// se usa para que haya mas probabilidad de que no lleguen mas clientes a que lleguen
//                clientes.enqueue(numClientes++);
//                
//            }
//            
//           }




        EntidadBancariaGui ebg = new EntidadBancariaGui();
        ebg.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaClientes;
    private javax.swing.JButton btnAtenderCliente;
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbCuenta;
    private javax.swing.JComboBox cbTransaccion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCaja1;
    private javax.swing.JLabel lbCaja2;
    private javax.swing.JLabel lbCaja3;
    private javax.swing.JTextField tfCuenta;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfMonto;
    // End of variables declaration//GEN-END:variables
}
