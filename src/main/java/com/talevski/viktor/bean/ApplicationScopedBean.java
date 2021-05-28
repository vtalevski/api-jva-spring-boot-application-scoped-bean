package com.talevski.viktor.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationScopedBean {
    private Integer number = 0;

    public ApplicationScopedBean() {
        System.out.println("ApplicationScopedBean constructor.");
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
