package com.anas.artf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ArtfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtfApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String welcome ()	
	{
		return "welcome to first project spring boot";
	}

}
