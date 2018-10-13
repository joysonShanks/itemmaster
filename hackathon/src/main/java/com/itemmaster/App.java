package com.itemmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.itemmaster.controllers", "com.itemmaster.beans", "com.itemmaster.models"})
//@ComponentScan(basePackages = "com.itemmaster")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
    }
}
