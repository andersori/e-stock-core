package com.dvn.estock.api.bean;

import java.time.LocalDateTime;

import com.dvn.estock.api.entity.Account;
import com.dvn.estock.api.entity.AccountType;

public class AccountBean implements Bean<Account>{

    private long id;
    private AccountType accountType;
    private String name;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdOn;
    private LocalDateTime lastLogin;

    public AccountBean(){
        setId(-1L);
        setAccountType(AccountType.UNDEFINED);
        setName("UNDEFINED");
        setLastName("UNDEFINED");
        setUsername("UNDEFINED");
        setEmail("UNDEFINED");
        setPassword("");
        setCreatedOn(LocalDateTime.now());
        setLastLogin(LocalDateTime.now());
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

    @Override
    public void toBean(Account obj){
        try{
            setId(obj.getId());
            setAccountType(obj.getAccountType());
            setName(obj.getName());
            setLastName(obj.getLastName());
            setUsername(obj.getUsername());
            setEmail(obj.getEmail());
            setPassword(obj.getPassword());
            setCreatedOn(obj.getCreatedOn());
            setLastLogin(obj.getLastLogin());
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    @Override
    public Account toEntity(){
        Account ac = new Account();

        ac.setId(getId());
        ac.setAccountType(getAccountType());
        ac.setName(getName());
        ac.setLastName(getLastName());
        ac.setUsername(getUsername());
        ac.setEmail(getEmail());
        ac.setPassword(getPassword());
        ac.setCreatedOn(getCreatedOn());
        ac.setLastLogin(getLastLogin());

        return ac;
    }
    
}