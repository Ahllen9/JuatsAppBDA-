/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entidades.Usuario;
import Implementaciones.ConexionBD;
import Implementaciones.UsuarioDAO;
import Interfaces.IUsuarioDAO;
import com.sun.corba.se.spi.ior.ObjectId;
import javax.swing.JOptionPane;

/**
 *
 * @author arturo
 */
public class UsuariosFrm extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioFrm
     */
    public UsuariosFrm() {
        initComponents();
        this.setVisible(rootPaneCheckingEnabled);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtConfirmarEmail = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jpPassword = new javax.swing.JPasswordField();
        jpConfirmarPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Email");

        jLabel2.setText("Confirmar email");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Confirmar contraseña");

        jLabel5.setText("Nombre de usuario");

        jLabel6.setText("Edad");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo");

        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Robot" }));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addComponent(jLabel8))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpConfirmarPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtConfirmarEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 213, Short.MAX_VALUE)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtConfirmarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpConfirmarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("JuatsApp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed
    
    public void limpiar(){
        this.txtNombreUsuario.setText("");
        this.txtEdad.setText("");
        this.txtEmail.setText("");
        this.txtConfirmarEmail.setText("");
        this.jpPassword.setText("");
        this.jpConfirmarPassword.setText("");
    }
    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (this.txtNombreUsuario.getText().equalsIgnoreCase("")&&this.txtEdad.getText().equalsIgnoreCase("")&&
                this.txtEmail.getText().equalsIgnoreCase("")&&this.txtConfirmarEmail.getText().equalsIgnoreCase("")
                    &&this.jpPassword.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Campos vacíos","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.txtNombreUsuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Ingrese nombre usuario","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.txtEdad.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Ingrese edad","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (Integer.parseInt(this.txtEdad.getText())<18) {
            JOptionPane.showMessageDialog(this,"No puede ser menor de 18 años","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.txtEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Ingrese email","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.txtConfirmarEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Confirme email","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.jpPassword.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Ingrese contraseña","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.jpConfirmarPassword.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this,"Confirme contraseña","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.jpConfirmarPassword.getPassword().equals(jpPassword.getPassword())) {
            JOptionPane.showMessageDialog(this,"Contraseña no coincide","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (this.jpPassword.getPassword().equals(jpConfirmarPassword.getPassword())) {
            JOptionPane.showMessageDialog(this,"Contraseña no coincide","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (!this.txtEmail.getText().equals(txtConfirmarEmail.getText())) {
            JOptionPane.showMessageDialog(this,"Email no coincide","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else if (!this.txtConfirmarEmail.getText().equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this,"Email no coincide","ERROR"
                    , JOptionPane.ERROR_MESSAGE);
        }
        else{
            IUsuarioDAO usuarioDao = new UsuarioDAO(new ConexionBD());
            Usuario usuario = new Usuario(this.txtNombreUsuario.getText(),this.jComboSexo.getSelectedItem().toString(), 
                    this.txtEmail.getText(),this.jpPassword.getText(), Integer.parseInt(this.txtEdad.getText()));
            if (usuarioDao.consultarEmail(txtEmail.getText()) == true) {
                JOptionPane.showMessageDialog(this,"El correo ya existe","información"
                    , JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usuarioDao.consultarEmail(txtNombreUsuario.getText())) {
                 JOptionPane.showMessageDialog(this,"El nombre de usuario ya existe","información"
                    , JOptionPane.INFORMATION_MESSAGE);
            }
            else if(usuarioDao.agregar(usuario)){
            JOptionPane.showMessageDialog(this,"Se registro el usuario correctamente","información"
                    , JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            }else{
                JOptionPane.showMessageDialog(this,"No se pudo registrar el usuario","error"
                        , JOptionPane.INFORMATION_MESSAGE);
            } 
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
        new MenuFrm();
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(UsuariosFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPasswordField jpConfirmarPassword;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextField txtConfirmarEmail;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}