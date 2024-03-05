package com.hughes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hughes.model.Aadhar;
import com.hughes.service.AadharService;

@SpringBootApplication
public class SpringBootAssignJdbcApplication implements CommandLineRunner {

	@Autowired
	AadharService aser;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Aadhar a = new Aadhar();
		// Implementing the Create Operation..................................................
//		a.setAadhar_no(101);
//		a.setAddress("karnal");
//		a.setIncome(10000);
//		a.setMobile_no("223456");
//		a.setName("Charlie");
//		a.setState("Haryana");
//		aser.create(a);
//		for(Aadhar i : aser.findAll())
//		{
//			System.out.println(i.getAadhar_no()+" "+i.getAddress()+" "+i.getIncome()+" "+i.getMobile_no()+" "+i.getName()+" "+i.getState());
//		}

		//Implementing the Read Operation.......................................................
		a.setAadhar_no(100);
		System.out.println(aser.read(a).get().getName());

		// Implementing the Update Operation....................................................
//		for (Aadhar i : aser.findAll()) {
//			System.out.println(i.getAadhar_no() + " " + i.getAddress() + " " + i.getIncome() + " " + i.getMobile_no()
//					+ " " + i.getName() + " " + i.getState());
//		}
//		a.setAadhar_no(100);
//		a.setName("Alice");
//		aser.update(a);
//		System.out.println("After updation");
//		for (Aadhar i : aser.findAll()) {
//			System.out.println(i.getAadhar_no() + " " + i.getAddress() + " " + i.getIncome() + " " + i.getMobile_no()
//					+ " " + i.getName() + " " + i.getState());
//		}

		// Implementing the Delete Operation.....................................................
//		for (Aadhar i : aser.findAll()) {
//			System.out.println(i.getAadhar_no() + " " + i.getAddress() + " " + i.getIncome() + " " + i.getMobile_no()
//					+ " " + i.getName() + " " + i.getState());
//		}
//		a.setAadhar_no(101);
//		aser.delete(a);
//		System.out.println("After Deletion");
//		for (Aadhar i : aser.findAll()) {
//			System.out.println(i.getAadhar_no() + " " + i.getAddress() + " " + i.getIncome() + " " + i.getMobile_no()
//					+ " " + i.getName() + " " + i.getState());
		}

	}
