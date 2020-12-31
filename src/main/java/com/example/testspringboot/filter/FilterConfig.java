package com.example.testspringboot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registratio = new FilterRegistrationBean();
        registratio.setFilter(new LogCostFilter());
        registratio.addUrlPatterns("/*");
        registratio.setName("LogCosFilter");
        registratio.setOrder(1);
        return registratio;
    }
}
