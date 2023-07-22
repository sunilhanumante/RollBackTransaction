package com.BikkadIT.RBT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RBT.Service.ServiceI;

@SpringBootApplication
public class RollBackTransaction05Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RollBackTransaction05Application.class, args);
		ServiceI bean = context.getBean(ServiceI.class);
		
		bean.save();
	}

}
