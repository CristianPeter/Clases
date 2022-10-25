/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaces;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

/**
 *
 * @author dev
 */
public class Reproductorv1 extends javax.swing.JFrame {

    /**
     * Creates new form Reproductor
     */
    public Reproductorv1() {
        initComponents();
        
        on.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/on", on.getWidth(), on.getHeight()));
        play.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/play3", play.getWidth(), play.getHeight()));
        record.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/record", record.getWidth(), record.getHeight()));
        siguiente.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/siguiente2", siguiente.getWidth(), siguiente.getHeight()));
        anterior.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/anterior2", anterior.getWidth(), anterior.getHeight()));
        pause.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/pause", pause.getWidth(), pause.getHeight()));
        rebobinarAtras.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/rebobinaratras", rebobinarAtras.getWidth(), rebobinarAtras.getHeight()));
        rebobinarAlante.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/rebobinardelante", rebobinarAlante.getWidth(), rebobinarAlante.getHeight()));
        stop.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/stop", stop.getWidth(), stop.getHeight()));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        on = new javax.swing.JToggleButton();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        rebobinarAtras = new javax.swing.JButton();
        record = new javax.swing.JButton();
        rebobinarAlante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reproductor");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        on.setAlignmentY(0.0F);
        on.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onMouseExited(evt);
            }
        });
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel1.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 107, 83));

        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playMouseEntered(evt);
            }
        });
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        jPanel1.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 1, 107, 83));

        pause.setAlignmentY(0.0F);
        pause.setAutoscrolls(true);
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        jPanel1.add(pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 1, 107, 83));

        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 107, 83));

        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        jPanel1.add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 89, 107, 83));

        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 89, 107, 83));

        rebobinarAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rebobinarAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(rebobinarAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 107, 83));

        record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordActionPerformed(evt);
            }
        });
        jPanel1.add(record, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 177, 107, 83));

        rebobinarAlante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rebobinarAlanteActionPerformed(evt);
            }
        });
        jPanel1.add(rebobinarAlante, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 177, 107, 83));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rebobinarAlanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rebobinarAlanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rebobinarAlanteActionPerformed

    private void recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recordActionPerformed

    private void rebobinarAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rebobinarAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rebobinarAtrasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anteriorActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playActionPerformed

    private void playMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_playMouseEntered

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed

    }//GEN-LAST:event_onActionPerformed

    private void onMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseExited
        // TODO add your handling code here:
       on.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/on", on.getWidth(), on.getHeight()));
    }//GEN-LAST:event_onMouseExited

    private void onMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseEntered
        // TODO add your handling code here:
        on.setIcon(redimensionar("/home/dev/NetBeansProjects/Interfaces/on2", on.getWidth(), on.getHeight()));
       
    }//GEN-LAST:event_onMouseEntered

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
            java.util.logging.Logger.getLogger(Reproductorv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reproductorv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reproductorv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reproductorv1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductorv1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton on;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private javax.swing.JButton rebobinarAlante;
    private javax.swing.JButton rebobinarAtras;
    private javax.swing.JButton record;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    public static ImageIcon redimensionar(String txt, int width, int height) {

        ImageIcon icon = new ImageIcon(txt);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;

    }
}