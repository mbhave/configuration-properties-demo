package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Madhura Bhave
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

	private List<String> fooList = Arrays.asList("a", "b");

	public List<String> getFooList() {
		return fooList;
	}

	public void setFooList(List<String> fooList) {
		this.fooList = fooList;
	}
}
