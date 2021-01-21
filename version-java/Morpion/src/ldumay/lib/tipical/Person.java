/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldumay.lib.tipical;

import java.util.Objects;
import ldumay.lib.essentials.GenerateBirthday;

/**
 *
 * @author dumay
 */

/**
 * Class - Person
 * <br/>
 * <br/>
 * <br/>Constructor :
 * <br/>- Private String -> firstName
 * <br/>- Private String -> lastName
 * <br/>- Private String -> fullName
 * <br/>- Private String -> birthday
 * <br/>- Private Integer -> age
 * <br/>- Private String -> adress
 * <br/>- Private String -> department
 * <br/>- Private Integer -> codeDepartment
 * <br/>- Private String -> region
 * <br/>- Private String -> country
 * <br/>- Private String -> login
 * <br/>- Private String -> password
 * <br/>- Private String -> mail
 * <br/>
 * <br/>
 * <br/>Functions :
 * <br/>
 * <br/>
 * <br/>End.
 */
public class Person {
    
    private GenerateBirthday generateBirthday = new GenerateBirthday();
    
    private String firstName;
    private String lastName;
    private String fullName;
    private String birthday;
    private Integer age;
    private String adress;
    private String department;
    private Integer codeDepartment;
    private String region;
    private String country;
    private String login;
    private String password;
    private String mail;
    
    /**
     * This is the constructor of the Person class.
     */
    public Person(String firstName, String lastName, String birthday, String login, String mail){
        if(firstName!=null){ this.firstName = firstName; }
        if(lastName!=null){ this.lastName = lastName; }
        if( (firstName!=null) && (lastName!=null) ){ this.fullName = firstName+" "+lastName; }
        if(birthday!=null){ this.birthday = birthday; }
        if(birthday!=null){ this.age = generateBirthday.getYearsOld(birthday); }
        if(login!=null){ this.login = login; }
        if(mail!=null){ this.mail = mail; }
    }
    
    // The methods of basic getter below.
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getFullName(){ return this.fullName; }
    public String getBirthday(){ return this.birthday; }
    public Integer getAge(){ return this.age; }
    public String getAdress(){ return this.adress; }
    public String getDepartment(){ return this.department; }
    public Integer getCodeDepartment(){ return this.codeDepartment; }
    public String getRegion(){ return this.region; }
    public String getCountry(){ return this.country; }
    public String getLogin(){ return this.login; }
    public String getPassword(){ return this.password; }
    public String getMail(){ return this.mail; }
    
    // The methods of basic setter below.
    public void setFirstName(String value){ this.firstName = value; }
    public void setLastName(String value){ this.lastName = value; }
    public void setFullName(String value){ this.fullName = value; }
    public void setBirthday(String value){ this.birthday = value; }
    public void setAge(Integer value){ this.age = value; }
    public void setAdress(String value){ this.adress = value; }
    public void setDepartment(String value){ this.department = value; }
    public void setCodeDepartment(Integer value){ this.codeDepartment = value; }
    public void setRegion(String value){ this.region = value; }
    public void setCountry(String value){ this.country = value; }
    public void setLogin(String value){ this.login = value; }
    public void setPassword(String value){ this.password = value; }
    public void setMail(String value){ this.mail = value; }
    
    // The methods for checking for duplicates are listed below : hashCode() & equals()

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.mail);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        return true;
    }

    
    
}
