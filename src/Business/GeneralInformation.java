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
public class GeneralInformation {
    
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String dateOfBirth;
    private int currentAge;
    private int humanHeight;
    private int humanWeight;
    private int socialSecurityNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getHumanHeight() {
        return humanHeight;
    }

    public void setHumanHeight(int humanHeight) {
        this.humanHeight = humanHeight;
    }

    public int getHumanWeight() {
        return humanWeight;
    }

    public void setHumanWeight(int humanWeight) {
        this.humanWeight = humanWeight;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }    
}
