package com.stratio.daasWeatherService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class DasWeatherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DasWeatherServiceApplication.class, args);
    }

}
