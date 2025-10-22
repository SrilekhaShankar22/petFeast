package com.petfeast;   // 👈 Make sure package matches folder structure

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetSuppliesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetSuppliesApplication.class, args);
    }
}
