package com.example.productoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProductoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoServiceApplication.class, args);
    }
}
