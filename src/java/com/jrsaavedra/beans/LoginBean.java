/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jrsaavedra.beans;

import java.io.Serializable;

/**
 *
 * @author jrsaavedra
 */
public class LoginBean implements Serializable {
    private String name;
    private String password;
    //contructor
    public LoginBean() {
    }
    // contructor sobrecargado
    public LoginBean(String name, String password) {
        this.name = name;
        this.password = password;
    }
    // getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean authentication(){
        return (this.password.equals("jrsaavedra"));
    }
}
