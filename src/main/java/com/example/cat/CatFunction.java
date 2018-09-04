package com.example.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class CatFunction {
	@Bean Function<String, String> uppercase() {
		return (in) -> {
			String uppercase = in.toUpperCase();
			return uppercase;
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(CatFunction.class, args);
	}
}
