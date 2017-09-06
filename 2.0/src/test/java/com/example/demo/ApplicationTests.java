package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	public void listShouldContainPropertiesFromYaml() {
		HelloProperties properties = this.context.getBean(HelloProperties.class);
		List<String> foo = properties.getFooList();
		assertThat(foo).containsExactly("c");
	}

}
