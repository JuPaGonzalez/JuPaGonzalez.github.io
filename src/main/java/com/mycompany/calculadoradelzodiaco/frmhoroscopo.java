/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadoradelzodiaco;

import javax.swing.ImageIcon;

/**
 *
 * @author juaga
 */
public class frmhoroscopo extends javax.swing.JFrame {

    ImageIcon Signo=new ImageIcon (); 
    
    /**
     * Creates new form frmhoroscopo
     */
    public frmhoroscopo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        otro = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        eldia = new javax.swing.JTextField();
        elmes = new javax.swing.JComboBox<>();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Ingresa el dia");

        jLabel2.setText("Ingresa el mes");

        calcular.setText("Calcular signo");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        otro.setText("Otro");
        otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        eldia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eldiaActionPerformed(evt);
            }
        });

        elmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Elige uno-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        resultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Horoscopo"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eldia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calcular)
                                .addGap(18, 18, 18)
                                .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(salir)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elmes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calcular)
                            .addComponent(otro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir))
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroActionPerformed
        eldia.setText("");
        elmes.setSelectedIndex(0);
        resultado.setText("");
        resultado.setIcon(null);
    }//GEN-LAST:event_otroActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // Aqui declaro las variables:
        
        int dia=Integer.parseInt(eldia.getText());
        String mes=(String)elmes.getSelectedItem();
        
        if(dia >= 21 && mes.equals("Marzo")||dia<=20 && mes.equals("abril")){
            resultado.setText("Aries");
        }else if(dia>=21 && mes.equals("Abril")||dia<=20 && mes.equals("Mayo")){
            resultado.setText("Tauro");
        }else if(dia>=21 && mes.equals("Mayo")||dia<=21 && mes.equals("Junio")){
        resultado.setText("Geminis");    
        }else if(dia>=22 && mes.equals("Junio")||dia<=22 && mes.equals("Julio")){
        resultado.setText("Cancer"); 
        }else if(dia>=23 && mes.equals("Julio")||dia<=22 && mes.equals("Agosto")){
        resultado.setText("Leo"); 
        }else if(dia>=23 && mes.equals("Agosto")||dia<=22 && mes.equals("Septiembre")){
        resultado.setText("Virgo"); 
        }else if(dia>=23 && mes.equals("Septiembre")||dia<=22 && mes.equals("Octubre")){
        resultado.setText("Libra"); 
        }else if(dia>=23 && mes.equals("Octubre")||dia<=21 && mes.equals("Noviembre")){
        resultado.setText("Escorpio"); 
        }else if(dia>=22 && mes.equals("Noviembre")||dia<=21 && mes.equals("Diciembre")){
        resultado.setText("Sagitario"); 
        }else if(dia>=22 && mes.equals("diciembre")||dia<=20 && mes.equals("Enero")){
        resultado.setText("Capricornio");
        }else if(dia>=21 && mes.equals("Enero")||dia<=21 && mes.equals("Febrero")){
        resultado.setText("Acuario"); 
        }else if(dia>=21 && mes.equals("Febrero")||dia<=21 && mes.equals("Marzo")){
        resultado.setText("piscis"); 
        }
        
        //Signo=new ImageIcon(getClass().getResource("/imagenes/"+resultado.getText()+".png"));
        //resultado.setIcon(Signo);
        
    }//GEN-LAST:event_calcularActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void eldiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eldiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eldiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmhoroscopo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField eldia;
    private javax.swing.JComboBox<String> elmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton otro;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
