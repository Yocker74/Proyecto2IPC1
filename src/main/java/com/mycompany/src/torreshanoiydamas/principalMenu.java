package com.mycompany.src.torreshanoiydamas;

import com.mycompany.src.torreshanoiydamas.ui.CheckersWindow;
import com.mycompany.src.torreshanoiydamas.Principal;
import com.mycompany.src.torreshanoiydamas.principalMenu;
import com.mycompany.src.torreshanoiydamas.users.Users;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author mdyoc
 */
public class principalMenu extends javax.swing.JFrame {
int x=0;
    ArrayList<Users> users= new ArrayList<>(); 
   
    /**
     * Creates new form principalMenu
     */
    public principalMenu() {
        users.add(new Users("NoUser"));

        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        hanoi = new javax.swing.JButton();
        checkers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        statistics = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torres de Hanoi y Damas");
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        hanoi.setText("Jugar Torres de Hanoi");
        hanoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoiActionPerformed(evt);
            }
        });

        checkers.setText("Jugar Damas");
        checkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkersActionPerformed(evt);
            }
        });

        jLabel1.setText("Usted se ha identificado como");

        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("NoUser");

        statistics.setText("Estadisticas de Juego");
        statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsActionPerformed(evt);
            }
        });

        jMenu1.setText("Usuarios");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Crear Usuario");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu2.setText("Cargar Usuario");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hanoi, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(checkers, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(statistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(hanoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(checkers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hanoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoiActionPerformed
        Principal Hanoi;
        Hanoi = new Principal(this, users.get(x));
        
        Hanoi.setVisible(true);
        
        Hanoi.setTitle("Torres de Hanoi");
        Hanoi.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
        Hanoi.setLocationRelativeTo(null);

    }//GEN-LAST:event_hanoiActionPerformed

    private void checkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkersActionPerformed
	    CheckersWindow checkers = new CheckersWindow(500,500, "Damas", users.get(x));	
        checkers.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
		checkers.setLocationRelativeTo(null);
		checkers.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_checkersActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        users.add(new Users(JOptionPane.showInputDialog("Ingrese el nombre del jugador")));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

String[] builder = new String[users.size()];
 for (int a = 0; a < users.size(); a++) {
        builder[a]= users.get(a).getName();
    }
 x = JOptionPane.showOptionDialog(null, "Elija cual de los usuarios desea ingresa", "Clickee el usuario que desea", WIDTH, HEIGHT, null, builder, DO_NOTHING_ON_CLOSE);
System.out.println(x);
userName.setText(users.get(x).getName());
//String input = JOptionPane.showInputD  int x =JOptionPane.showOptionDialog(null, userName, "Elija su usuario", 200, 40, null, null, EXIT_ON_CLOSE);
//        String[] names = new String[users.size()];
//        for(int a = 0; a < users.size(); a++)
//    {
//        String numberInput = JOptionPane.showInputDialog
//                (null, "Enter a number: ");
//        
//        names[a] = users.get(a).getName();
//    }
//        userName.setText(users.get(0).getName());// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void statisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticsActionPerformed
Statistics stats = new Statistics(users);
this.setVisible(false);
stats.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_statisticsActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkers;
    private javax.swing.JButton hanoi;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton statistics;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
