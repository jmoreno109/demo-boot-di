package com.example.demo.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${user.name}")
	private String name;

	@Value("${user.age}")
	private String age;

	@PostConstruct
	public void construct() {
		System.out.println("llamando al @PostConstruct !!!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("seek and destroy !!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
