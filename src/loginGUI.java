
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ferrando Carlos
 */
public class loginGUI extends javax.swing.JFrame {

    /**
     * Creates new form loginGUI
     */
    public loginGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground2 = new javax.swing.JPanel();
        jLtexto1 = new javax.swing.JLabel();
        jLtexto2 = new javax.swing.JLabel();
        jpnlBackground1 = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jSeparatorEmail = new javax.swing.JSeparator();
        jLabelPass = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jSeparatorPass = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab I  - LOG IN");
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlBackground2.setBackground(new java.awt.Color(21, 5, 120));

        jLtexto1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLtexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLtexto1.setText("LOG IN");

        jLtexto2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLtexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLtexto2.setText("LABORATORIO I");

        javax.swing.GroupLayout jpnlBackground2Layout = new javax.swing.GroupLayout(jpnlBackground2);
        jpnlBackground2.setLayout(jpnlBackground2Layout);
        jpnlBackground2Layout.setHorizontalGroup(
            jpnlBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackground2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLtexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(167, 167, 167))
            .addGroup(jpnlBackground2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLtexto2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlBackground2Layout.setVerticalGroup(
            jpnlBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackground2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLtexto1)
                .addGap(33, 33, 33)
                .addComponent(jLtexto2)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        getContentPane().add(jpnlBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        jpnlBackground1.setBackground(new java.awt.Color(249, 247, 243));

        jLabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.img/llave.png"))); // NOI18N
        jLabelEmail.setText("jLabel1");

        jTextEmail.setBackground(new java.awt.Color(249, 247, 243));
        jTextEmail.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextEmail.setBorder(null);

        jSeparatorEmail.setBackground(new java.awt.Color(70, 54, 179));
        jSeparatorEmail.setForeground(new java.awt.Color(70, 54, 179));

        jLabelPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.img/sobre.png"))); // NOI18N
        jLabelPass.setText("jLabel1");

        jPassword.setBackground(new java.awt.Color(249, 247, 243));
        jPassword.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPassword.setBorder(null);

        jSeparatorPass.setBackground(new java.awt.Color(70, 54, 179));
        jSeparatorPass.setForeground(new java.awt.Color(70, 54, 179));

        jButton1.setBackground(new java.awt.Color(21, 5, 120));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBackground1Layout = new javax.swing.GroupLayout(jpnlBackground1);
        jpnlBackground1.setLayout(jpnlBackground1Layout);
        jpnlBackground1Layout.setHorizontalGroup(
            jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackground1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlBackground1Layout.createSequentialGroup()
                        .addGroup(jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparatorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlBackground1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jpnlBackground1Layout.setVerticalGroup(
            jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlBackground1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlBackground1Layout.createSequentialGroup()
                        .addGroup(jpnlBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        getContentPane().add(jpnlBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Constantes de control
        String DOMINIO = "@ulp.edu.ar";
        String PASS = "12345678";
        //Variables 
        String email, password;

        //Se obtienen los valores de los campos
        email = jTextEmail.getText();
        password = new String(jPassword.getPassword());

        //Control y muestra de credenciales correctas o incorrectas
        if (email.contains(DOMINIO) && password.equals(PASS)) {
            JOptionPane.showMessageDialog(this, "Bienvenido, las credenciales son correctas!!");
        } else {
            JOptionPane.showMessageDialog(this, "Email o Contraseña incorrecta!!");
        }
        
        //Se borran los campos 
        jTextEmail.setText("");
        jPassword.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLtexto1;
    private javax.swing.JLabel jLtexto2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorPass;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JPanel jpnlBackground1;
    private javax.swing.JPanel jpnlBackground2;
    // End of variables declaration//GEN-END:variables
}
