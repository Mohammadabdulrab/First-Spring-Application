package com.firstapp.example.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("This is my first spring boot code");
		int a=10;
		if(a%2==0){
			System.out.println(a+" is an even number.");
		}
		else{
			System.out.println(a+" is an odd number");
		}
	}

}
