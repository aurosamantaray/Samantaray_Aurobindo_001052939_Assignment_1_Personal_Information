/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Name
 */
public class MedicalInformation {
    private int recordNumber;
    private String medicalAlergy1;
    private String medicalAlergy2;
    private String medicalAlergy3;

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getMedicalAlergy1() {
        return medicalAlergy1;
    }

    public void setMedicalAlergy1(String medicalAlergy1) {
        this.medicalAlergy1 = medicalAlergy1;
    }

    public String getMedicalAlergy2() {
        return medicalAlergy2;
    }

    public void setMedicalAlergy2(String medicalAlergy2) {
        this.medicalAlergy2 = medicalAlergy2;
    }

    public String getMedicalAlergy3() {
        return medicalAlergy3;
    }

    public void setMedicalAlergy3(String medicalAlergy3) {
        this.medicalAlergy3 = medicalAlergy3;
    }
}
