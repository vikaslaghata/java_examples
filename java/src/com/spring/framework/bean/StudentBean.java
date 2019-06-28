package com.spring.framework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class StudentBean {
    private String name;

    @Value("1")  // read from property file
    private int type;

    @Autowired
    @Qualifier("address")
    private AddressBean address;

    public StudentBean(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getAddress() {
        return address.getAddress();
    }
}
