package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

//@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication(scanBasePackages = { "com.example.demo" })
@Configuration
//@EnableWebMvc
@EntityScan(basePackageClasses = { CrudApplication.class })
//@EnableWebSecurity
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

//	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//		protected void configure(HttpSecurity http) throws Exception {
//	        http.csrf().disable()
//	                .authorizeRequests() // authorize
//	                .anyRequest().authenticated() // all requests are authenticated
//	                .and()
//	                .httpBasic();
//
//	        http.cors();
//	}
//	}
}
