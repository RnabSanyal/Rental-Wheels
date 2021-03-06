
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import AppPackage.*;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RNV
 */
public class mainscreen extends javax.swing.JFrame {

    /**
     * Creates new form mainscreen
     */
    public mainscreen() {
        initComponents();
        //this.setSize(800,520);
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        new_cust = new javax.swing.JLabel();
        ret = new javax.swing.JLabel();
        view_data = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(800, 520));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(701, 473, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rod.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 510, 880, 10);

        new_cust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/butt_1.png"))); // NOI18N
        new_cust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_custMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_custMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_custMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new_custMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_custMouseReleased(evt);
            }
        });
        getContentPane().add(new_cust);
        new_cust.setBounds(210, 120, 590, 110);

        ret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/butt_2.png"))); // NOI18N
        ret.setText("jLabel1");
        ret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                retMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                retMouseReleased(evt);
            }
        });
        getContentPane().add(ret);
        ret.setBounds(280, 220, 520, 120);

        view_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/butt_3.png"))); // NOI18N
        view_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_dataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_dataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_dataMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                view_dataMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                view_dataMouseReleased(evt);
            }
        });
        getContentPane().add(view_data);
        view_data.setBounds(210, 330, 590, 110);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainscreen.jpg"))); // NOI18N
        bg.setText("jLabel1");
        bg.setMaximumSize(new java.awt.Dimension(1000, 1000));
        bg.setMinimumSize(new java.awt.Dimension(1000, 1000));
        bg.setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(bg);
        bg.setBounds(0, 0, 800, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_custMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_custMouseEntered
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(210,205,1,1,new_cust);
    }//GEN-LAST:event_new_custMouseEntered

    private void new_custMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_custMouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(205,210,1,1,new_cust);
    }//GEN-LAST:event_new_custMouseExited

    private void view_dataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseEntered
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(210,205,1,1,view_data);
    }//GEN-LAST:event_view_dataMouseEntered

    private void view_dataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXRight(205,210,1,1,view_data);
    }//GEN-LAST:event_view_dataMouseExited

    private void retMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMouseEntered
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(280,275,1,1,ret);
    }//GEN-LAST:event_retMouseEntered

    private void retMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMouseExited
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelXLeft(275,280,1,1,ret);
    }//GEN-LAST:event_retMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void new_custMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_custMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_1_pr.png"));
        new_cust.setIcon(II);
    }//GEN-LAST:event_new_custMousePressed

    private void new_custMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_custMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_1.png"));
        new_cust.setIcon(II);
    }//GEN-LAST:event_new_custMouseReleased

    private void retMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_2_pr.png"));
        ret.setIcon(II);
    }//GEN-LAST:event_retMousePressed

    private void retMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_2.png"));
        ret.setIcon(II);
    }//GEN-LAST:event_retMouseReleased

    private void view_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_3_pr.png"));
        view_data.setIcon(II);
    }//GEN-LAST:event_view_dataMousePressed

    private void view_dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/butt_3.png"));
        view_data.setIcon(II);
    }//GEN-LAST:event_view_dataMouseReleased

    private void new_custMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_custMouseClicked
        // TODO add your handling code here:
        cust_sel s = new cust_sel();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_new_custMouseClicked

    private void retMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMouseClicked
        // TODO add your handling code here:
        return_car s = new return_car();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_retMouseClicked

    private void view_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseClicked
        // TODO add your handling code here:
        view_sel s = new view_sel();
        s.setVisible(true);
        close();
    }//GEN-LAST:event_view_dataMouseClicked

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
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel new_cust;
    private javax.swing.JLabel ret;
    private javax.swing.JLabel view_data;
    // End of variables declaration//GEN-END:variables
}
