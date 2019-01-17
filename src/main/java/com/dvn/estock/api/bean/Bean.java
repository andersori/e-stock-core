package com.dvn.estock.api.bean;

public interface Bean<T>{

    public void toBean(T obj);

    public T toEntity();
}