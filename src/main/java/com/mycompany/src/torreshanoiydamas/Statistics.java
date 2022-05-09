/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.src.torreshanoiydamas;

import com.mycompany.src.torreshanoiydamas.users.Users;
import java.util.ArrayList;

/**
 *
 * @author mdyoc
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form Statistics
     */
    ArrayList<Users> users= new ArrayList<>(); 
    
    public Statistics(ArrayList<Users> users) {
        this.users=users;
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

        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Reportes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {users.get(0).getName(),  users.get(0).getjJHanoi(), users.get(0).getjGHanoi(), (users.get(0).getjJHanoi()-users.get(0).getjGHanoi()),  users.get(0).getJugadasRealizadasHanoi(), users.get(0).getTiempoHanoi(), users.get(0).getjJDamas(), users.get(0).getjGDamas(), (users.get(0).getjJDamas()-users.get(0).getjGDamas()), users.get(0).getJugadasRealizadasDamas()},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Jugador", "Juegos Hanoi", "Juegos ganados", "Juegos perdidos", "Movimientos", "Tiempo Hanoi", "Juegos Damas", "Partidas ganadas", "Partidas perdidas", "Tiempo Damas", "Movimientos Damas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}