package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Madhura Bhave
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

	private List<String> foo = Arrays.asList("a", "b");

	public List<String> getFoo() {
		return foo;
	}

	public void setFoo(List<String> foo) {
		this.foo = foo;
	}
}
