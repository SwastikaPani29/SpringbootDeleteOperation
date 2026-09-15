package com.org;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.entity.Doctor;
import com.org.services.DoctorImpl;
import com.org.services.IDoctorService;

@SpringBootApplication
public class SpringDataJpaDeleteAllByIdsApplication {

	public static void main(String[] args)  {
	  ApplicationContext ctx = SpringApplication.run(SpringDataJpaDeleteAllByIdsApplication.class, args);
	  =========== = ctx.getBean("doctorService",DoctorImpl.class);
	  
Doctor doc;
try {
	doc = bean.getCustomerById(151);
} catch (Exception e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println(e);
}
System.out.println("101");
	}

}
