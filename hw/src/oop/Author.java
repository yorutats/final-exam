package oop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s2000
 */
public class Author {

    public String name;
    public String email;
    public char gender;


    public Author(){
        
    }
    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }

}
