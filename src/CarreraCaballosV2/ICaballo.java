package CarreraCaballosV2;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

public class ICaballo extends javax.swing.JFrame {

    //meta final
    static int meta = 855;
    static boolean movimiento = true;

    static Thread hilo;
    //caballo1
    static int contador = 0;
    static int posicion;
    static int suma = 0, total = 0;
    static int i = 0, j = 0;

    //caballo 2
    static Thread hilo2;
    static int contador2 = 0;
    static int posicion2;
    static int suma2 = 0, total2 = 0;
    static int j2 = 0;

    //caballo 3
    static Thread hilo3;
    static int contador3 = 0;
    static int posicion3;
    static int suma3 = 0, total3 = 0;
    static int j3 = 0;
    //caballo 4
    static Thread hilo4;
    static int contador4 = 0;
    static int posicion4;
    static int suma4 = 0, total4 = 0;
    static int j4 = 0;
    //caballo5
    static Thread hilo5;
    static int contador5 = 0;
    static int posicion5;
    static int suma5 = 0, total5 = 0;
    static int j5 = 0;

    public ICaballo() {
        initComponents();
        // etiC.setIcon(new ImageIcon(getClass().getResource("caballo1.gif")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        etiC2 = new javax.swing.JLabel();
        etiC3 = new javax.swing.JLabel();
        etiC4 = new javax.swing.JLabel();
        etiC5 = new javax.swing.JLabel();
        etiC1 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRenaudar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setText("INICIAR");
        btnIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarKeyPressed(evt);
            }
        });

        etiC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/caballo5.gif"))); // NOI18N
        etiC2.setAlignmentY(0.0F);

        etiC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/caballo1.gif"))); // NOI18N

        etiC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/caballo5.gif"))); // NOI18N

        etiC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/caballo1.gif"))); // NOI18N

        etiC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/caballo1.gif"))); // NOI18N
        etiC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnPausar.setText("PAUSAR");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarreraCaballosV2/meta.png"))); // NOI18N

        btnRenaudar.setText("RENAUDAR");
        btnRenaudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenaudarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiC5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiC2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiC3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiC4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiC1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnPausar)
                .addGap(18, 18, 18)
                .addComponent(btnRenaudar)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIniciar)
                            .addComponent(btnPausar)
                            .addComponent(btnRenaudar)
                            .addComponent(btnReiniciar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(etiC1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(etiC2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(etiC3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(etiC4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(etiC5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarKeyPressed
        // movimiento=true;
        if (evt.getKeyCode() == 65) {
            if (movimiento != false) {
                hilo = new Thread(new Caballo1());
                hilo.start();

                if (contador >= meta) {
                    movimiento = false;
                     
                    //JOptionPane.showMessageDialog(null, "El caballo 1 ha ganado");
                    /*
                    movimiento = false;
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();
                     */
                }

            }
        }
        if (evt.getKeyCode() == 83) {
            if (movimiento != false) {
                hilo2 = new Thread(new Caballo2());
                hilo2.start();

                if (j2 >= meta) {
                    movimiento = false;
                 
                   // JOptionPane.showMessageDialog(null, "El caballo 2 ha ganado");
                   
                    /*
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();
                     */
                }

            }
        }
        if (evt.getKeyCode() == 68) {
            if (movimiento != false) {
                hilo3 = new Thread(new Caballo3());
                hilo3.start();

                if (j3 >= meta) {
                    movimiento = false;
                   // JOptionPane.showMessageDialog(null, "El caballo 3 ha ganado");
                   
                    /*
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();
                     */
                }
            }
        }
        if (evt.getKeyCode() == 70) {
            if (movimiento != false) {
                hilo4 = new Thread(new Caballo4());
                hilo4.start();
                if (j4 >= meta) {
                      movimiento = false;
                   // JOptionPane.showMessageDialog(null, "El caballo 4 ha ganado");
                  
                    /*
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();*/
                }
            }
        }
        if (evt.getKeyCode() == 71) {
            if (movimiento != false) {
                hilo5 = new Thread(new Caballo5());
                hilo5.start();

                if (j5 >= meta) {
                    movimiento = false;
                   
                   // JOptionPane.showMessageDialog(null, "El caballo 5 ha ganado");
                  
                    /*
                    hilo.stop();
                    hilo2.stop();
                    hilo3.stop();
                    hilo4.stop();
                    hilo5.stop();
                     */
                }

            }
        }
    }//GEN-LAST:event_btnIniciarKeyPressed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        movimiento = false;
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
       // this.btnIniciarKeyPressed(java.awt.event.KeyEvent evt);
      
        contador = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        contador5 = 0;
        i = 0;
        j2 = 0;
        j3 = 0;
        j4 = 0;
        j5 = 0;
        suma = 0;
        suma2 = 0;
        suma3 = 0;
        suma4 = 0;
        suma5 = 0;
        posicion = 0;
        posicion2 = 0;
        posicion3 = 0;
        posicion4 = 0;
        posicion5 = 0;
        total = 0;
        total2 = 0;
        total3 = 0;
        total4 = 0;
        total5 = 0;
        etiC1.setLocation(contador, 50);
        etiC2.setLocation(j2, 190);
        etiC3.setLocation(j3, 290);
        etiC4.setLocation(j4, 420);
        etiC5.setLocation(j5, 570);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnRenaudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenaudarActionPerformed
        movimiento = true;
    }//GEN-LAST:event_btnRenaudarActionPerformed

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
            java.util.logging.Logger.getLogger(ICaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICaballo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICaballo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnRenaudar;
    protected static javax.swing.JLabel etiC1;
    protected static javax.swing.JLabel etiC2;
    protected static javax.swing.JLabel etiC3;
    protected static javax.swing.JLabel etiC4;
    protected static javax.swing.JLabel etiC5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
