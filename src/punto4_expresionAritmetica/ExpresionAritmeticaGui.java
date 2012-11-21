/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4_expresionAritmetica;

public class ExpresionAritmeticaGui extends javax.swing.JFrame {

    /**
     * Creates new form ExpresionAritmeticaGui
     */
    public ExpresionAritmeticaGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAPosfijo = new javax.swing.JButton();
        botonAPrefijo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelInfijo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expresiones Aritmeticas");

        botonAPosfijo.setText("Convertir a Posfijo");
        botonAPosfijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAPosfijoActionPerformed(evt);
            }
        });

        botonAPrefijo.setText("Convertir a Prefijo");
        botonAPrefijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAPrefijoActionPerformed(evt);
            }
        });

        jLabel1.setText("Escriba la expresion Aritmética en Infijo");

        labelInfijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelInfijoActionPerformed(evt);
            }
        });

        resultadoJTextArea.setColumns(20);
        resultadoJTextArea.setRows(5);
        jScrollPane1.setViewportView(resultadoJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonAPosfijo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAPrefijo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(labelInfijo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelInfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAPosfijo)
                    .addComponent(botonAPrefijo))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelInfijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelInfijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelInfijoActionPerformed

    private void botonAPosfijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAPosfijoActionPerformed
      
        ConvertidorInfijoAPosfijo aPosfijo = new ConvertidorInfijoAPosfijo();
        String text = labelInfijo.getText();
        aPosfijo.convertidorInfijoAPosfijo(new StringBuffer(text));
        resultadoJTextArea.setText("Posfijo : "+ aPosfijo.posfijo.toString());
        
    }//GEN-LAST:event_botonAPosfijoActionPerformed

    private void botonAPrefijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAPrefijoActionPerformed
        ConvertidorInfijoAPrefijo aPrefijo = new ConvertidorInfijoAPrefijo();
        String text = labelInfijo.getText();
        aPrefijo.convertidorInfijoAPrefijo(new StringBuffer(text));
		
	resultadoJTextArea.setText("Prefijo : "+ aPrefijo.prefijo.toString());
    }//GEN-LAST:event_botonAPrefijoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExpresionAritmeticaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpresionAritmeticaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpresionAritmeticaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpresionAritmeticaGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ExpresionAritmeticaGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAPosfijo;
    private javax.swing.JButton botonAPrefijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelInfijo;
    private javax.swing.JTextArea resultadoJTextArea;
    // End of variables declaration//GEN-END:variables
}
