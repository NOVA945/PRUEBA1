package laboratorio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author termi
 */
public class INTENTO2 extends javax.swing.JFrame {

    /**
     * Creates new form INTENTO2
     */
    public INTENTO2() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        INTENTO2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        salario2 = new javax.swing.JMenuItem();
        cuadratica = new javax.swing.JMenu();
        CUADRATICAS = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        SALARIO = new javax.swing.JMenu();
        salario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        INTENTO2.setText("CALCULADORA");
        INTENTO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INTENTO2ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("calculadora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        INTENTO2.add(jMenuItem1);

        salario2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        salario2.setText("salario");
        salario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salario2ActionPerformed(evt);
            }
        });
        INTENTO2.add(salario2);

        jMenuBar1.add(INTENTO2);

        cuadratica.setText("CUADRATICA");

        CUADRATICAS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CUADRATICAS.setText("CUADRA");
        CUADRATICAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUADRATICASActionPerformed(evt);
            }
        });
        cuadratica.add(CUADRATICAS);

        jMenuItem4.setText("jMenuItem4");
        cuadratica.add(jMenuItem4);

        jMenuBar1.add(cuadratica);

        SALARIO.setText("SALARIO");

        salario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salario.setText("SALARIO");
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });
        SALARIO.add(salario);

        jMenuBar1.add(SALARIO);

        jMenu5.setText("jMenu5");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INTENTO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INTENTO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INTENTO2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CALCULADORA verventana= new CALCULADORA();
       escritorio.add(verventana);
       verventana.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CUADRATICASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUADRATICASActionPerformed
            CUADRATICAS verventana3= new CUADRATICAS();
       escritorio.add(verventana3);
       verventana3.show();
    }//GEN-LAST:event_CUADRATICASActionPerformed

    private void salario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salario2ActionPerformed
             PLANILLA verventana2= new PLANILLA();
       escritorio.add(verventana2);
       verventana2.show();
    }//GEN-LAST:event_salario2ActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
              PLANILLA verventana2= new PLANILLA();
       escritorio.add(verventana2);
       verventana2.show();   
        
        
    }//GEN-LAST:event_salarioActionPerformed

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
            java.util.logging.Logger.getLogger(INTENTO2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTENTO2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTENTO2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTENTO2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTENTO2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CUADRATICAS;
    private javax.swing.JMenu INTENTO2;
    private javax.swing.JMenu SALARIO;
    private javax.swing.JMenu cuadratica;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem salario;
    private javax.swing.JMenuItem salario2;
    // End of variables declaration//GEN-END:variables
}
