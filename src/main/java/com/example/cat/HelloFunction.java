package com.example.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloFunction {
	@Bean Function<String, String> hello() {
		return (in) -> { return "Hello " + in; };
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloFunction.class, args);
	}
}
