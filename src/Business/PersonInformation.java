/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.Icon;

/**
 *
 * @author Aurobindo
 */
public class PersonInformation {
    private AccountInformation accountInformation;
    private AddressInformation addressInformation;
    private GeneralInformation generalInformation;
    private MedicalInformation medicalInformation;
    private LicenseInformation  licenseInformation; 
    
    Icon photoInput;

    public Icon getPhotoInput() {
        return photoInput;
    }

    public void setPhotoInput(Icon photoInput) {
        this.photoInput = photoInput;
    }
    
    public PersonInformation(AccountInformation accountInformation, AddressInformation addressInformation, GeneralInformation demoGraphicInformation, MedicalInformation medicalInformation, LicenseInformation licenseInformation) {
        this.accountInformation = accountInformation;
        this.addressInformation = addressInformation;
        this.generalInformation = demoGraphicInformation;
        this.medicalInformation = medicalInformation;
        this.licenseInformation = licenseInformation;
    }

    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public MedicalInformation getMedicalInformation() {
        return medicalInformation;
    }

    public void setMedicalInformation(MedicalInformation medicalInformation) {
        this.medicalInformation = medicalInformation;
    }

    public LicenseInformation getLicenseInformation() {
        return licenseInformation;
    }

    public void setLicenseInformation(LicenseInformation licenseInformation) {
        this.licenseInformation = licenseInformation;
    }
}
