package com.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//spring reads this config
@Configuration
@ComponentScan(basePackages  = "com.edu")
public class CollegeConfiguration {


}
