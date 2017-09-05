/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RNV
 */

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import AppPackage.*;
import javax.swing.ImageIcon;

public class cust_sel extends javax.swing.JFrame {

    /**
     * Creates new form cust_sel
     */
    public cust_sel() {
        initComponents();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        butt2 = new javax.swing.JLabel();
        butt1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 520));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 520));
        setSize(new java.awt.Dimension(800, 520));
        getContentPane().setLayout(null);

        back.setFont(new java.awt.Font("Raleway SemiBold", 0, 14)); // NOI18N
        back.setText("Back");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(40, 470, 100, 30);

        butt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/old_cust.png"))); // NOI18N
        butt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butt2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butt2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                butt2MouseReleased(evt);
            }
        });
        getContentPane().add(butt2);
        butt2.setBounds(40, 270, 540, 170);

        butt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_cust.png"))); // NOI18N
        butt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butt1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butt1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                butt1MouseReleased(evt);
            }
        });
        getContentPane().add(butt1);
        butt1.setBounds(40, 100, 520, 160);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cust_sel.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 800, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt1MouseEntered
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(40,45,1,1,butt1);
    }//GEN-LAST:event_butt1MouseEntered

    private void butt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt1MouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(45,40,1,1,butt1);
    }//GEN-LAST:event_butt1MouseExited

    private void butt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt2MouseEntered
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(40,45,1,1,butt2);
    }//GEN-LAST:event_butt2MouseEntered

    private void butt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt2MouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(45,40,1,1,butt2);
    }//GEN-LAST:event_butt2MouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        mainscreen s = new mainscreen();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_backActionPerformed

    private void butt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt1MousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/new_cust_2.png"));
        butt1.setIcon(II);
    }//GEN-LAST:event_butt1MousePressed

    private void butt1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt1MouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/new_cust.png"));
        butt1.setIcon(II);
        cust_fill s = new cust_fill();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_butt1MouseReleased

    private void butt2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt2MousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/old_cust_2.png"));
        butt2.setIcon(II);
    }//GEN-LAST:event_butt2MousePressed

    private void butt2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butt2MouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/old_cust.png"));
        butt2.setIcon(II);
        old_cust s = new old_cust();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_butt2MouseReleased

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
            java.util.logging.Logger.getLogger(cust_sel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cust_sel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cust_sel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cust_sel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cust_sel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel butt1;
    private javax.swing.JLabel butt2;
    // End of variables declaration//GEN-END:variables
}