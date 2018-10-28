package com.itemmaster.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itemmaster.utils.RuleEngine;

@Configuration
public class ItemMasterBeans {

	@Bean
	public RuleEngine ruleEngine() {
		return new RuleEngine();
	}
}
