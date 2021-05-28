package com.talevski.viktor.bean;

import org.springframework.stereotype.Component;

@Component
public class SingletonScopedBean {
    private Integer number = 0;

    public SingletonScopedBean() {
        System.out.println("SingletonScopedBean constructor.");
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
