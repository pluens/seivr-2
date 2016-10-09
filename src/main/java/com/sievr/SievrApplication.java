package com.sievr;

import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sievr.util.JsonWebServiceClient;

@SpringBootApplication
public class SievrApplication extends WebMvcConfigurerAdapter{
	@Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".html");
        return resolver;
	}
	@Bean
	public JsonWebServiceClient jsonWebServiceClient() throws MalformedURLException {
		JsonWebServiceClient client = new JsonWebServiceClient();
		return client;
	}

	public static void main(String[] args) {
		SpringApplication.run(SievrApplication.class, args);
	}
	

}
