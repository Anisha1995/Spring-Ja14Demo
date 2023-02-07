package com.example.DemoSpringJan14.conf;

import com.example.DemoSpringJan14.domain.Car;
import com.example.DemoSpringJan14.domain.GasolineEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Carconfig {

    @Bean
    public Car car(){
        Car car= new Car();
        car.setMake("bmv");
        car.setModel("x5");
        car.setEngine(engine());
        return car;
    }

    @Bean
    public GasolineEngine engine() {
        return new GasolineEngine("simple engine");
    }


}
