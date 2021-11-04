package com.example.demo;

import com.example.demo.config.MyConfig1;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String pass = "1234567";
//		String encode = passwordEncoder.encode(pass);
//		System.out.println(encode);
	}

}
