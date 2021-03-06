package com.find.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
public class IwillFindYouApplication {

	public static void main(String[] args) { SpringApplication.run(IwillFindYouApplication.class, args); }

	/*public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {IwillFindYouApplication.class, ParseFile.class}, args);
	}*/


}
