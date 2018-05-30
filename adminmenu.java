
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamza
 */
public class adminmenu extends javax.swing.JFrame {

    /**
     * Creates new form adminmenu
     */
    public adminmenu() {
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
        add_student = new javax.swing.JButton();
        delete_student = new javax.swing.JButton();
        show_student = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Menu");

        add_student.setText("Add a new student");
        add_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_studentActionPerformed(evt);
            }
        });

        delete_student.setText("Delete Existing students");
        delete_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_studentActionPerformed(evt);
            }
        });

        show_student.setText("Show Current Students");
        show_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_studentActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Student info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(show_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_student, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(add_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(add_student)
                .addGap(18, 18, 18)
                .addComponent(delete_student)
                .addGap(18, 18, 18)
                .addComponent(show_student)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_studentActionPerformed


        this.setVisible(false);
        // TODO add your handling code here:
        addingstudent newstudent = null;
        try {
            newstudent = new addingstudent();
        } catch (SQLException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        newstudent.setVisible(true);
        
    }//GEN-LAST:event_add_studentActionPerformed

    private void delete_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_studentActionPerformed
        this.setVisible(false);
        
        deletingstudent newdelete = null;
        try {
            newdelete = new deletingstudent();
        } catch (SQLException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        newdelete.setVisible(true);
 
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_studentActionPerformed

    private void show_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_studentActionPerformed
        this.setVisible(false);
        viewingstudent newview = null;
        try {
            newview = new viewingstudent();
        } catch (SQLException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        newview.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_show_studentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        adminlogin newadminlogin = null;
        try {
            newadminlogin = new adminlogin();
        } catch (SQLException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        newadminlogin.setVisible(true);
        this.setVisible(false);
            // TODO add your handling code here:;
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            this.setVisible(false);
        try {
            new changeadminpass().setVisible(true);
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(adminmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        String user_id = JOptionPane.showInputDialog("Enter the Student ID", "ID");
        
        
        try {
            new changename(user_id).setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(showdetails.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_student;
    private javax.swing.JButton back;
    private javax.swing.JButton delete_student;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton show_student;
    // End of variables declaration//GEN-END:variables
}
