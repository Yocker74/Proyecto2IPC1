package com.mycompany.src.torreshanoiydamas;

import com.mycompany.src.torreshanoiydamas.ui.CheckersWindow;
import com.mycompany.src.torreshanoiydamas.Principal;
import com.mycompany.src.torreshanoiydamas.principalMenu;


/**
 *
 * @author mdyoc
 */
public class principalMenu extends javax.swing.JFrame {

   
    /**
     * Creates new form principalMenu
     */
    public principalMenu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jButton1.setText("Jugar Torres de Hanoi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 170, 170, 50);

        jButton2.setText("Jugar Damas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 240, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal Hanoi = new Principal();
        Hanoi.setVisible(true);
        Hanoi.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
        Hanoi.setLocationRelativeTo(null);
this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	    CheckersWindow checkers = new CheckersWindow(500,500, "Damas");	
        checkers.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
		checkers.setLocationRelativeTo(null);
		checkers.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
