/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.PersonInformation;

/**
 *
 * @author Name
 */
public class ViewInfoJPanel extends javax.swing.JPanel {

    private PersonInformation personInformation;

    /**
     * Creates new form ViewInfoPanel
     */
    public ViewInfoJPanel(PersonInformation personInformation) {
        initComponents();
        this.personInformation = personInformation;
        populateFields();
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
        panelNamejLabel = new javax.swing.JLabel();
        generalInformationjLabel = new javax.swing.JLabel();
        firstNamejLabel = new javax.swing.JLabel();
        firstNameTextField = new java.awt.TextField();
        lastNamejLabel = new javax.swing.JLabel();
        lastNameTextField = new java.awt.TextField();
        phoneNumberjLabel = new javax.swing.JLabel();
        phoneNumberTextField = new java.awt.TextField();
        ssnjLabel = new javax.swing.JLabel();
        ssnTextField = new java.awt.TextField();
        DoBjLabel = new javax.swing.JLabel();
        dobTextField = new java.awt.TextField();
        agejLabel = new javax.swing.JLabel();
        ageTextField = new java.awt.TextField();
        addressInformationjLabel = new javax.swing.JLabel();
        streetAddressTextField = new java.awt.TextField();
        cityjLabel1 = new javax.swing.JLabel();
        cityTextField = new java.awt.TextField();
        stateTextField = new java.awt.TextField();
        statejLabel = new javax.swing.JLabel();
        streetAddressjLabel1 = new javax.swing.JLabel();
        zipCodejLabel = new javax.swing.JLabel();
        zipCodeTextField = new java.awt.TextField();
        bankAccountInformationjLabel = new javax.swing.JLabel();
        bankNamejLabel = new javax.swing.JLabel();
        accountNumberjLabel = new javax.swing.JLabel();
        accountNumberTextField = new java.awt.TextField();
        bankNameTextField = new java.awt.TextField();
        accountTypejLabel = new javax.swing.JLabel();
        accountTypeTextField = new java.awt.TextField();
        accountBalancejLabel = new javax.swing.JLabel();
        accountBalanceTextField = new java.awt.TextField();
        routingNumberTextField = new java.awt.TextField();
        routingNumberjLabel = new javax.swing.JLabel();
        driverLicenseInformationjLabel = new javax.swing.JLabel();
        licenseNumberjLabel = new javax.swing.JLabel();
        bloodTypejLabel = new javax.swing.JLabel();
        licenseNumberTextField = new java.awt.TextField();
        dateOfIssuejLabel = new javax.swing.JLabel();
        dateOfIssuejTextField = new java.awt.TextField();
        dateOfExpirationjLabel2 = new javax.swing.JLabel();
        dateOfExpirationjTextField = new java.awt.TextField();
        bloodTypeTextField = new java.awt.TextField();
        medicalRecordInformationjLabel = new javax.swing.JLabel();
        medicalRecordNumberjLabel = new javax.swing.JLabel();
        medicalRecordNumberTextField = new java.awt.TextField();
        alergy1jLabel = new javax.swing.JLabel();
        alergy1TextField = new java.awt.TextField();
        alergy2jLabel = new javax.swing.JLabel();
        alergy2TextField = new java.awt.TextField();
        alergy3jLabel = new javax.swing.JLabel();
        alergy3TextField = new java.awt.TextField();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new java.awt.TextField();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new java.awt.TextField();

        panelNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        panelNamejLabel.setText("User Information");

        generalInformationjLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        generalInformationjLabel.setText("General Information");

        firstNamejLabel.setText("First Name:");

        firstNameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNamejLabel.setText("Last Name:");

        lastNameTextField.setText("\n");

        phoneNumberjLabel.setText("Phone #:");

        phoneNumberTextField.setText("\n");

        ssnjLabel.setText("SSN:");

        ssnTextField.setText("\n");
        ssnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnTextFieldActionPerformed(evt);
            }
        });

        DoBjLabel.setText("Date Of Birth:");

        dobTextField.setText("\n");

        agejLabel.setText("Age:");

        ageTextField.setText("\n");

        addressInformationjLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addressInformationjLabel.setText("Address Information");

        streetAddressTextField.setText("\n");

        cityjLabel1.setText("City:");

        cityTextField.setText("\n");

        stateTextField.setText("\n");

        statejLabel.setText("State:");

        streetAddressjLabel1.setText("Street Address:");

        zipCodejLabel.setText("Zip Code:");

        zipCodeTextField.setText("\n");

        bankAccountInformationjLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bankAccountInformationjLabel.setText("Bank Account Information");

        bankNamejLabel.setText("Bank Name:");

        accountNumberjLabel.setText("Account #:");

        accountNumberTextField.setText("\n");

        bankNameTextField.setText("\n");

        accountTypejLabel.setText("Account Type:");

        accountTypeTextField.setText("\n");

        accountBalancejLabel.setText("Account Balance:");

        accountBalanceTextField.setText("\n");

        routingNumberTextField.setText("\n");

        routingNumberjLabel.setText("Routing #:");

        driverLicenseInformationjLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        driverLicenseInformationjLabel.setText("Driver License Information");

        licenseNumberjLabel.setText("License #:");

        bloodTypejLabel.setText("Blood Type:");

        licenseNumberTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        licenseNumberTextField.setForeground(new java.awt.Color(0, 0, 0));
        licenseNumberTextField.setText("\n");
        licenseNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseNumberTextFieldActionPerformed(evt);
            }
        });

        dateOfIssuejLabel.setText("Date Of Issue:");

        dateOfIssuejTextField.setText("\n");

        dateOfExpirationjLabel2.setText("Date Of Expiration:");

        dateOfExpirationjTextField.setText("\n");

        bloodTypeTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bloodTypeTextField.setForeground(new java.awt.Color(0, 0, 0));
        bloodTypeTextField.setText("\n");
        bloodTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeTextFieldActionPerformed(evt);
            }
        });

        medicalRecordInformationjLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        medicalRecordInformationjLabel.setText("Medical Record Information");

        medicalRecordNumberjLabel.setText("Medical Record #:");

        medicalRecordNumberTextField.setText("\n");

        alergy1jLabel.setText("Alergy 1:");

        alergy1TextField.setText("\n");

        alergy2jLabel.setText("Alergy 2:");

        alergy2TextField.setText("\n");
        alergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TextFieldActionPerformed(evt);
            }
        });

        alergy3jLabel.setText("Alergy 3:");

        alergy3TextField.setText("\n");

        heightLabel.setText("Height:");

        weightLabel.setText("Weight:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(panelNamejLabel))
                    .addComponent(generalInformationjLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressInformationjLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(streetAddressjLabel1)
                                    .addComponent(cityjLabel1)
                                    .addComponent(zipCodejLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(streetAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(statejLabel)
                            .addComponent(bankAccountInformationjLabel)
                            .addComponent(bankNamejLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(routingNumberjLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(routingNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(accountBalancejLabel)
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(accountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(accountBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(accountTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(accountTypejLabel)
                            .addComponent(accountNumberjLabel)
                            .addComponent(heightLabel)
                            .addComponent(weightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(medicalRecordInformationjLabel)
                            .addComponent(driverLicenseInformationjLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bloodTypejLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateOfIssuejLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateOfIssuejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(licenseNumberjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(licenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateOfExpirationjLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(dateOfExpirationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medicalRecordNumberjLabel)
                                    .addComponent(alergy1jLabel)
                                    .addComponent(alergy2jLabel)
                                    .addComponent(alergy3jLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medicalRecordNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alergy1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alergy2TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alergy3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNamejLabel)
                            .addComponent(firstNamejLabel)
                            .addComponent(phoneNumberjLabel)
                            .addComponent(ssnjLabel)
                            .addComponent(agejLabel)
                            .addComponent(DoBjLabel))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(heightTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ssnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNamejLabel)
                .addGap(18, 18, 18)
                .addComponent(generalInformationjLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNamejLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNamejLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberjLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssnjLabel)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agejLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoBjLabel)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightLabel)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightLabel)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressInformationjLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(streetAddressjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(streetAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityjLabel1)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statejLabel)
                            .addComponent(stateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(driverLicenseInformationjLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenseNumberjLabel)
                            .addComponent(licenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfIssuejLabel)
                            .addComponent(dateOfIssuejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfExpirationjLabel2)
                            .addComponent(dateOfExpirationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipCodejLabel)
                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodTypejLabel)
                    .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bankAccountInformationjLabel)
                    .addComponent(medicalRecordInformationjLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bankNamejLabel)
                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicalRecordNumberjLabel)
                    .addComponent(medicalRecordNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountTypejLabel)
                    .addComponent(accountTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alergy1jLabel)
                    .addComponent(alergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accountNumberjLabel)
                            .addComponent(accountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alergy2jLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accountBalancejLabel)
                                    .addComponent(accountBalanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(routingNumberjLabel)
                                    .addComponent(routingNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(alergy3jLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void ssnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnTextFieldActionPerformed

    private void licenseNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseNumberTextFieldActionPerformed

    private void bloodTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypeTextFieldActionPerformed

    private void alergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoBjLabel;
    private java.awt.TextField accountBalanceTextField;
    private javax.swing.JLabel accountBalancejLabel;
    private java.awt.TextField accountNumberTextField;
    private javax.swing.JLabel accountNumberjLabel;
    private java.awt.TextField accountTypeTextField;
    private javax.swing.JLabel accountTypejLabel;
    private javax.swing.JLabel addressInformationjLabel;
    private java.awt.TextField ageTextField;
    private javax.swing.JLabel agejLabel;
    private java.awt.TextField alergy1TextField;
    private javax.swing.JLabel alergy1jLabel;
    private java.awt.TextField alergy2TextField;
    private javax.swing.JLabel alergy2jLabel;
    private java.awt.TextField alergy3TextField;
    private javax.swing.JLabel alergy3jLabel;
    private javax.swing.JLabel bankAccountInformationjLabel;
    private java.awt.TextField bankNameTextField;
    private javax.swing.JLabel bankNamejLabel;
    private java.awt.TextField bloodTypeTextField;
    private javax.swing.JLabel bloodTypejLabel;
    private java.awt.TextField cityTextField;
    private javax.swing.JLabel cityjLabel1;
    private javax.swing.JLabel dateOfExpirationjLabel2;
    private java.awt.TextField dateOfExpirationjTextField;
    private javax.swing.JLabel dateOfIssuejLabel;
    private java.awt.TextField dateOfIssuejTextField;
    private java.awt.TextField dobTextField;
    private javax.swing.JLabel driverLicenseInformationjLabel;
    private java.awt.TextField firstNameTextField;
    private javax.swing.JLabel firstNamejLabel;
    private javax.swing.JLabel generalInformationjLabel;
    private javax.swing.JLabel heightLabel;
    private java.awt.TextField heightTextField;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField lastNameTextField;
    private javax.swing.JLabel lastNamejLabel;
    private java.awt.TextField licenseNumberTextField;
    private javax.swing.JLabel licenseNumberjLabel;
    private javax.swing.JLabel medicalRecordInformationjLabel;
    private java.awt.TextField medicalRecordNumberTextField;
    private javax.swing.JLabel medicalRecordNumberjLabel;
    private javax.swing.JLabel panelNamejLabel;
    private java.awt.TextField phoneNumberTextField;
    private javax.swing.JLabel phoneNumberjLabel;
    private java.awt.TextField routingNumberTextField;
    private javax.swing.JLabel routingNumberjLabel;
    private java.awt.TextField ssnTextField;
    private javax.swing.JLabel ssnjLabel;
    private java.awt.TextField stateTextField;
    private javax.swing.JLabel statejLabel;
    private java.awt.TextField streetAddressTextField;
    private javax.swing.JLabel streetAddressjLabel1;
    private javax.swing.JLabel weightLabel;
    private java.awt.TextField weightTextField;
    private java.awt.TextField zipCodeTextField;
    private javax.swing.JLabel zipCodejLabel;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {

        firstNameTextField.setText(personInformation.getGeneralInformation().getFirstName());
        lastNameTextField.setText(personInformation.getGeneralInformation().getLastName());
        dobTextField.setText(personInformation.getGeneralInformation().getDateOfBirth());
        ageTextField.setText(String.valueOf(personInformation.getGeneralInformation().getCurrentAge()));
        phoneNumberTextField.setText(String.valueOf(personInformation.getGeneralInformation().getPhoneNumber()));
        ssnTextField.setText(String.valueOf(personInformation.getGeneralInformation().getSocialSecurityNumber()));
        heightTextField.setText(String.valueOf(personInformation.getGeneralInformation().getHumanHeight()));
        weightTextField.setText(String.valueOf(personInformation.getGeneralInformation().getHumanWeight()));

        streetAddressTextField.setText(personInformation.getAddressInformation().getStreetAddress());
        cityTextField.setText(personInformation.getAddressInformation().getCityAddress());
        stateTextField.setText(personInformation.getAddressInformation().getStateAddress());
        zipCodeTextField.setText(String.valueOf(personInformation.getAddressInformation().getZipCode()));

        licenseNumberTextField.setText(String.valueOf(personInformation.getLicenseInformation().getLicenseNumber()));
        dateOfIssuejTextField.setText(personInformation.getLicenseInformation().getLicenseIssueDate());
        dateOfExpirationjTextField.setText(personInformation.getLicenseInformation().getLicenseExpirationDate());
        bloodTypeTextField.setText(personInformation.getLicenseInformation().getBloodGroup());

        bankNameTextField.setText(personInformation.getAccountInformation().getBankName());
        accountTypeTextField.setText(personInformation.getAccountInformation().getAccountType());
        accountBalanceTextField.setText(String.valueOf(personInformation.getAccountInformation().getAccountBalance()));
        accountNumberTextField.setText(String.valueOf(personInformation.getAccountInformation().getAccountNumber()));
        routingNumberTextField.setText(String.valueOf(personInformation.getAccountInformation().getRoutingNumber()));

        medicalRecordNumberTextField.setText(String.valueOf(personInformation.getMedicalInformation().getRecordNumber()));
        alergy1TextField.setText(personInformation.getMedicalInformation().getMedicalAlergy1());
        alergy2TextField.setText(personInformation.getMedicalInformation().getMedicalAlergy2());
        alergy3TextField.setText(personInformation.getMedicalInformation().getMedicalAlergy3());
    }
}