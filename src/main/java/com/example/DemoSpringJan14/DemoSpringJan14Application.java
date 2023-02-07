package com.example.DemoSpringJan14;

import com.example.DemoSpringJan14.conf.Carconfig;
import com.example.DemoSpringJan14.domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

//@SpringBootApplication
public class DemoSpringJan14Application {

	public static void main(String[] args) {
		//SpringApplication.run(DemoSpringJan14Application.class, args);

//XML based
//		ApplicationContext context=
//
//				new ClassPathXmlApplicationContext("context.xml");
//		System.out.println("context.getBean(\"car\", Car.class) = " + context.getBean("car", Car.class));
//
		//PASSING INDIVIDUAL CLASS
//		ApplicationContext context=
//new AnnotationConfigApplicationContext(Carconfig.class);
//
//var car=context.getBean("car",Car.class);
//		System.out.println("Car" +car);

		//PASSING WHOLE PACKAGE
		ApplicationContext context=
				new AnnotationConfigApplicationContext("com.example.DemoSpringJan14");

		var car=context.getBean("car",Car.class);
		System.out.println("Car" +car);
	}

}
