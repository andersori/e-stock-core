package com.dvn.estock.api.entity;

public enum AccountType{

    UNDEFINED(1),
    FUNCTIONARY(2),
    VISITOR(3);

    private final int id;

    private AccountType(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public static AccountType getAccountType(int id) throws IllegalArgumentException{
        if(id == 1){
            return AccountType.FUNCTIONARY;
        }else if(id == 2){
            return AccountType.VISITOR;
        }else{
            throw new IllegalArgumentException("Id does not match any available");
        }
    }
}