package com.talevski.viktor.dispatcher.servlet.one.controller;

import com.talevski.viktor.bean.ApplicationScopedBean;
import com.talevski.viktor.bean.SingletonScopedBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatcherServletOneController {
    private final SingletonScopedBean singletonScopedBean;
    private final ApplicationScopedBean applicationScopedBean;

    public DispatcherServletOneController(SingletonScopedBean singletonScopedBean, ApplicationScopedBean applicationScopedBean) {
        this.singletonScopedBean = singletonScopedBean;
        this.applicationScopedBean = applicationScopedBean;
    }

    @GetMapping("/numbers")
    public String getNumbers() {
        singletonScopedBean.setNumber(5);
        applicationScopedBean.setNumber(5);

        return "The singleton scoped bean number is - '" + singletonScopedBean.getNumber() + "', and the application scoped bean number is - '" + applicationScopedBean.getNumber() + "'.";
    }
}
