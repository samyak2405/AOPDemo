package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
@ComponentScan(basePackageClasses = {org.example.beans.Vehicle.class,org.example.beans.Person.class})
public class proConfig {
}
