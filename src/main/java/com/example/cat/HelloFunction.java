package com.example.cat;

import java.util.function.Function;

public class HelloFunction implements Function<String, String> {
	@Override public String apply(String s) {
		return "Hello " + s;
	}
}
