package com.example.demoo.com.Webapp;

import javax.servlet.http.HttpServlet;

import com.example.demoo.com.Webapp.MyServlets.DoctorServlet;
import com.example.demoo.com.Webapp.MyServlets.NurseServlet;
import com.example.demoo.com.Webapp.MyServlets.PatientServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebConfig {
    @Bean
    public ServletRegistrationBean<HttpServlet> pServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new PatientServlet());
        servRegBean.addUrlMappings("/patient/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
    @Bean
    public ServletRegistrationBean<HttpServlet> dServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new DoctorServlet());
        servRegBean.addUrlMappings("/doctor/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
    @Bean
    public ServletRegistrationBean<HttpServlet> nServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new NurseServlet());
        servRegBean.addUrlMappings("/nurse/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}