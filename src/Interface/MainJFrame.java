/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AccountInformation;
import Business.AddressInformation;
import Business.GeneralInformation;
import Business.LicenseInformation;
import Business.MedicalInformation;
import Business.PersonInformation;

/**
 *
 * @author Name
 */
public class MainJFrame extends javax.swing.JFrame {

    //private List<PersonInformation> personInformations = new ArrayList<>();
    /**
     * Creates new form MainJFrame
     */
    private AccountInformation accountInformation;
    private AddressInformation addressInformation;
    private GeneralInformation generalInformation;
    private MedicalInformation medicalInformation;
    private LicenseInformation licenseInformation;
    private PersonInformation personInformation;

    public MainJFrame() {
        initComponents();
        this.accountInformation = new AccountInformation();
        this.addressInformation = new AddressInformation();
        this.generalInformation = new GeneralInformation();
        this.medicalInformation = new MedicalInformation();
        this.licenseInformation = new LicenseInformation();
        this.personInformation = new PersonInformation(accountInformation, addressInformation, generalInformation, medicalInformation, licenseInformation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        displayJPanel = new javax.swing.JPanel();
        controljPanel = new javax.swing.JPanel();
        createjButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayJPanel.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displayJPanel);

        controljPanel.setBackground(new java.awt.Color(153, 255, 255));

        createjButton.setText("Create");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controljPanelLayout = new javax.swing.GroupLayout(controljPanel);
        controljPanel.setLayout(controljPanelLayout);
        controljPanelLayout.setHorizontalGroup(
            controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controljPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controljPanelLayout.setVerticalGroup(
            controljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controljPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );

        splitPanel.setLeftComponent(controljPanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        ViewInfoJPanel viewInfoJPanel = new ViewInfoJPanel(personInformation);
        splitPanel.setRightComponent(viewInfoJPanel);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        UserInputJPanel userInputJPanel = new UserInputJPanel(personInformation);
        splitPanel.setRightComponent(userInputJPanel);
    }//GEN-LAST:event_createjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controljPanel;
    private javax.swing.JButton createjButton;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
