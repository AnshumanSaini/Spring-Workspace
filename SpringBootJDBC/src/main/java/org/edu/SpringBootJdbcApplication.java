package org.edu;

import org.edu.model.Students;
import org.edu.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {
	@Autowired
	StudentsService stdser;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("before insertion");
		for (Students obj : stdser.findAll()) {
			System.out.println(obj.getStudentId() + " " + obj.getAge() + " " + obj.getStudentName());
		}
//		Students std = new Students();
//		std.setStudentId(111);
//		std.setStudentName("harsh");
//		std.setAge(27);
//		stdser.save(std);
//		System.out.println("After insertion");
//		for(Students obj : stdser.findAll())
//		{
//			System.out.println(obj.getStudentId()+" "+obj.getAge()+" "+obj.getStudentName());
//		}
//		System.out.println("After Deletion");
//		stdser.delete(110);
//		for(Students obj : stdser.findAll())
//		{
//			System.out.println(obj.getStudentId()+" "+obj.getAge()+" "+obj.getStudentName());
//		}
//		stdser.update(std);
//		Students std = new Students();
//		std.setAge(30);
//		std.setStudentName("Anshuman");
//		std.setStudentId(100);
//		stdser.update(std);
//		System.out.println("After updation");
//		for (Students obj : stdser.findAll()) {
//			System.out.println(obj.getStudentId() + " " + obj.getAge() + " " + obj.getStudentName());
//		}
		
		System.out.println("Find using ID");
		Students std = new Students();
		std.setStudentId(100);
		System.out.println(stdser.findById(std).get().getStudentName());
	}

}
