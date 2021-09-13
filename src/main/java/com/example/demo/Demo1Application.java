package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    public void insertEmployee(EmployeeRepository employeeRepository){
        Employee employee = Employee.builder()
                .firstName("Thanh")
                .lastName("Nam")
                .email("buithanhnam26092000@gmail.com")
                .build();
        employeeRepository.save(employee);
    }
}