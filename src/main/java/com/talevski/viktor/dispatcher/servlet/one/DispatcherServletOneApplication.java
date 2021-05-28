package com.talevski.viktor.dispatcher.servlet.one;

import com.talevski.viktor.dispatcher.servlet.one.config.DispatcherServletOneConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class DispatcherServletOneApplication implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(DispatcherServletOneConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);

        ServletRegistration.Dynamic dynamicDispatcherServlet = servletContext.addServlet("dispatcherServletOne", dispatcherServlet);
        dynamicDispatcherServlet.setLoadOnStartup(1);
        dynamicDispatcherServlet.addMapping("/dispatcher-servlet-context-one/*");
    }
}
