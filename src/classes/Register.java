/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Register extends javax.swing.JFrame{
    FileManager userFile = new FileManager("user");

    /**
     * Creates new form Register
     */
    public Register() {
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

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblSurname = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblParole = new javax.swing.JLabel();
        pwParole = new javax.swing.JPasswordField();
        lblParoleatk = new javax.swing.JLabel();
        pwParoleatk = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setEnabled(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblSurname.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSurname.setText("Surname");

        txtSurname.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblParole.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblParole.setText("Password");

        pwParole.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblParoleatk.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblParoleatk.setText("Password again");

        pwParoleatk.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegister)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSurname)
                            .addComponent(lblName)
                            .addComponent(lblParole)
                            .addComponent(lblParoleatk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtSurname)
                            .addComponent(pwParole)
                            .addComponent(pwParoleatk))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSurname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParole)
                    .addComponent(pwParole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwParoleatk)
                    .addComponent(lblParoleatk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Client c = new Client(1, txtName.getText(), txtSurname.getText(), pwParoleatk.getText());
        c.saveToFile();
        
        txtName.setText("");
        txtSurname.setText("");
        pwParole.setText("");
        pwParoleatk.setText("");
        
        btnRegister.setEnabled(false);
        
        new Message(this, true, "You have been registered!").setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(Validator.isName(txtName.getText())){
            btnRegister.setEnabled(true);
            txtName.setBackground(Color.white);
        }else{
            btnRegister.setEnabled(false);
            txtName.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        if(btnRegister.isEnabled()){
            btnRegisterActionPerformed(evt);
        }
        
    }//GEN-LAST:event_txtNameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParole;
    private javax.swing.JLabel lblParoleatk;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JPasswordField pwParole;
    private javax.swing.JPasswordField pwParoleatk;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
