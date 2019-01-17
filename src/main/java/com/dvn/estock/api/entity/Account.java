package com.dvn.estock.api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Account implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private long id;
    private AccountType accountType;
    private String name;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdOn;
    private LocalDateTime lastLogin;

    public Account(){
        
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public AccountType getAccountType(){
        return accountType;
    }
    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public LocalDateTime getCreatedOn(){
        return createdOn;
    }
    public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn = createdOn;
    }
    public LocalDateTime getLastLogin(){
        return lastLogin;
    }
    public void setLastLogin(LocalDateTime lastLogin){
        this.lastLogin = lastLogin;
    }

    public static long getSerialVersionUID(){
        return serialVersionUID;
    }

}