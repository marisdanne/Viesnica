/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author user
 */
public class Client extends User{
    private String personalCode;
    private Date birthday;
    private String country;
    private String documentCode;
    private String telNumber;
    
    public Client(int id, String name, String surname) {
        super(id, name, surname);
    }
    
    public Client(String personalCode, Date birthday, String country, String documentCode, String telNumber, int id, String name, String surname) {
        super(id, name, surname);
        this.personalCode = personalCode;
        this.birthday = birthday;
        this.country = country;
        this.documentCode = documentCode;
        this.telNumber = telNumber;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Client{"  + super.toString() +  ", personalCode=" + personalCode + ", birthday=" + birthday + ", country=" + country + ", documentCode=" + documentCode + ", telNumber=" + telNumber + '}';
    }
    
}
