package com.qualifier.prc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qualifier.prc.pojo.Engine;

@Configuration
@ComponentScan(basePackages = "com.qualifier.prc")
public class ConfigDb2 {
@Bean(value="Engine")
public Engine getEngine() {
	return new Engine();
}
}
