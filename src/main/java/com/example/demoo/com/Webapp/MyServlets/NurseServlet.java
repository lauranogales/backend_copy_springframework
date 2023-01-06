package com.example.demoo.com.Webapp.MyServlets;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns={"/Nurses"}, loadOnStartup = 1)
public class NurseServlet extends HttpServlet {
    @Bean
    public ServletRegistrationBean<HttpServlet> dataServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.addUrlMappings();
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}