package com.firstapp.example.first_spring_app;

import com.firstapp.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.firstapp.example.first_spring_app.model.Address;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("This is my first spring boot code");


//		int a=10;
//		if(a%2==0){
//			System.out.println(a+" is an even number.");
//		}
//		else{
//			System.out.println(a+" is an odd number");
//		}

//       below code is showing tight coupling
//		 here one object is directly depend on another object that is tight coupling.


//		Employee employee = new Employee();
//		employee.empId=101;
//		employee.empName="Mohammad Abdul Rab";
//		employee.empEmail= "abdulrab123@gmail.com";
//
//		Address address1=new Address();
//		address1.doorNo=999;
//		address1.streetName="hhjjkk";
//		address1.city="jhudis";
//
//		employee.address=address1;


//		loss coupling

		Employee employee = new Employee();
		employee.setEmpId(101);
	    employee.setEmpName("Mohammad Abdul Rab");
		employee.setEmpEmail("abdul123@gmail.com");

		Address address1=new Address();
		address1.setDoorNo(909);
		address1.setStreetName("bilari");
		address1.setCity("Hyderabad");

		employee.setAddress(address1);

		employee.getAddress().setDoorNo(205);
		employee.getAddress().setCity("Ahmadabad");

	}

}
