
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RNV
 */
public class car_select extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String cust_name;
    int cust_id;
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public void setNames(String cus_name, int cust_id)
    {
        cust_name = cus_name;
        this.cust_id = cust_id;
        JOptionPane.showMessageDialog(null,cust_name);
        JOptionPane.showMessageDialog(null,this.cust_id);
    }

    /**
     * Creates new form car_select
     */
    public car_select() {
        initComponents();
        String type1;
        con = MySqlConnection.ConnectDb();
        String sql = "SELECT DISTINCT type FROM vehicles WHERE avail>0;";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                type1 = rs.getString("type");
                type.addItem(type1);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        brand.removeAllItems();
        models.removeAllItems();
        //String sql2 = "SELECT brand FROM vehicles WHERE type = ?;";
        /*try{
            ps = con.prepareStatement(sql2);
            ps.setString(1,type.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }*/
        
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
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JButton();
        finalizee = new javax.swing.JButton();
        brand = new javax.swing.JComboBox();
        type = new javax.swing.JComboBox();
        models = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 520));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 520));
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(540, 120, 240, 210);

        img.setText("Get Image");
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        getContentPane().add(img);
        img.setBounds(620, 360, 90, 30);

        finalizee.setText("Finalize");
        finalizee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizeeActionPerformed(evt);
            }
        });
        getContentPane().add(finalizee);
        finalizee.setBounds(710, 440, 70, 30);

        brand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brandFocusGained(evt);
            }
        });
        brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandMouseClicked(evt);
            }
        });
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        getContentPane().add(brand);
        brand.setBounds(180, 210, 350, 28);

        type.setBorder(null);
        type.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type);
        type.setBounds(180, 120, 350, 28);

        models.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                modelsFocusGained(evt);
            }
        });
        models.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelsActionPerformed(evt);
            }
        });
        getContentPane().add(models);
        models.setBounds(180, 300, 350, 28);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 440, 60, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_sel.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 870, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void brandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandMouseClicked
        // TODO add your handling code here:
        /*String brand1;
        String sql2 = "SELECT brand FROM vehicles WHERE type = ?;";
        try{
        ps = con.prepareStatement(sql2);
        ps.setString(1,type.getSelectedItem().toString());
        rs = ps.executeQuery();
        brand.removeAllItems();
        while(rs.next())
        {
            brand1 = rs.getString("brand");
            brand.addItem(brand1);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }*/
        models.removeAllItems();
    }//GEN-LAST:event_brandMouseClicked

    private void brandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandFocusGained
        // TODO add your handling code here:
        String brand1;
        String sql2 = "SELECT brand FROM vehicles WHERE type = ?;";
        try{
        ps = con.prepareStatement(sql2);
        ps.setString(1,type.getSelectedItem().toString());
        rs = ps.executeQuery();
        brand.removeAllItems();
        while(rs.next())
        {
            brand1 = rs.getString("brand");
            brand.addItem(brand1);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_brandFocusGained

    private void modelsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelsFocusGained
        // TODO add your handling code here:
        String car;
        String sql2 = "SELECT name FROM vehicles WHERE type = ? AND brand = ?;";
        try{
        ps = con.prepareStatement(sql2);
        ps.setString(1,type.getSelectedItem().toString());
        ps.setString(2,brand.getSelectedItem().toString());
        rs = ps.executeQuery();
        models.removeAllItems();
        while(rs.next())
        {
            car = rs.getString("name");
            models.addItem(car);
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_modelsFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelsActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        // TODO add your handling code here:
        try{
            byte[] imageBytes;
            Image image;
            ps = con.prepareStatement("SELECT image FROM vehicles WHERE name = ?;");
            ps.setString(1,models.getSelectedItem().toString());
            rs = ps.executeQuery();
            while(rs.next())
            {
                imageBytes = rs.getBytes(1);
                image = getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel1.setIcon(icon);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_imgActionPerformed

    private void finalizeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizeeActionPerformed
        // TODO add your handling code here:
        Booking s = new Booking();
        s.setCar(brand.getSelectedItem().toString(),models.getSelectedItem().toString(), cust_name, cust_id);
        s.setVisible(true);
        close();
    }//GEN-LAST:event_finalizeeActionPerformed

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
            java.util.logging.Logger.getLogger(car_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new car_select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox brand;
    private javax.swing.JButton finalizee;
    private javax.swing.JButton img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox models;
    private javax.swing.JComboBox type;
    // End of variables declaration//GEN-END:variables
}
