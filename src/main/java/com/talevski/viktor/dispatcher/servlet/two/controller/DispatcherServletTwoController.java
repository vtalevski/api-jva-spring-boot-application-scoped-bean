package com.talevski.viktor.dispatcher.servlet.two.controller;

import com.talevski.viktor.bean.ApplicationScopedBean;
import com.talevski.viktor.bean.SingletonScopedBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatcherServletTwoController {
    private final SingletonScopedBean singletonScopedBean;
    private final ApplicationScopedBean applicationScopedBean;

    public DispatcherServletTwoController(SingletonScopedBean singletonScopedBean, ApplicationScopedBean applicationScopedBean) {
        this.singletonScopedBean = singletonScopedBean;
        this.applicationScopedBean = applicationScopedBean;
    }

    @GetMapping("/numbers")
    public String getNumbers() {
        return "The singleton scoped bean number is - '" + singletonScopedBean.getNumber() + "', and the application scoped bean number is - '" + applicationScopedBean.getNumber() + "'.";
    }
}
