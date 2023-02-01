package com.cogent.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//example of java based bean configuration
@Configuration
public class ApplicationBean {

	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();

		p.setpId(1003);
		p.setpName("Will");
		p.setpAge(25);
		return p;
	}

}
