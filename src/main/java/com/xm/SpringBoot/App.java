package com.xm.SpringBoot;

/**
 * Hello world!
 *O
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

	@RequestMapping("/h")
	public String home() {
		return "Hello";
	}

	@RequestMapping("/w")
	public String word() {
		return "World";
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello World ! 哈哈哈");
		SpringApplication.run(App.class, args);
	}
}
