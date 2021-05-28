package com.talevski.viktor.dispatcher.servlet.two;

import com.talevski.viktor.dispatcher.servlet.two.config.DispatcherServletTwoConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class DispatcherServletTwoApplication implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(DispatcherServletTwoConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);

        ServletRegistration.Dynamic dynamicDispatcherServlet = servletContext.addServlet("dispatcherServletTwo", dispatcherServlet);
        dynamicDispatcherServlet.setLoadOnStartup(1);
        dynamicDispatcherServlet.addMapping("/dispatcher-servlet-context-two/*");
    }
}
