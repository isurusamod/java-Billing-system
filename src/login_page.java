
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class login_page extends javax.swing.JFrame {

    /**
     * Creates new form login_page
     */
    public login_page() {
        initComponents();
        Icon i = icon1.getIcon();
        ImageIcon icon = (ImageIcon)i; 
        Image image = icon.getImage().getScaledInstance(icon1.getWidth(), icon1.getHeight(),Image.SCALE_SMOOTH);
        icon1.setIcon(new ImageIcon(image));
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
        icon1 = new javax.swing.JLabel();
        loginb = new javax.swing.JButton();
        usernme = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pngegg.png")); // NOI18N
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 56, 210, 110));

        loginb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginb.setText("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });
        jPanel1.add(loginb, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 362, 99, 40));
        jPanel1.add(usernme, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 215, 265, 35));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 276, 265, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 218, 137, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 288, 106, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\learning\\Java\\Assignment\\Billing System\\src\\3409297.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -79, 3210, 1220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
        String US,PW;
        US = usernme.getText();
        PW = Password.getText();
        
       if(US.equals("DKADMIN") && PW.equals("12345"))
       {
           setVisible(false);
           billInterface object = new billInterface();
           object.setVisible(true);
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Incorrect Username or Password");
       }
           
    }//GEN-LAST:event_loginbActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginb;
    private javax.swing.JTextField usernme;
    // End of variables declaration//GEN-END:variables
}
