package com.data;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.data.entity.Student;
import com.data.repository.StudRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudRepository studRepo = context.getBean(StudRepository.class);
		Student st = new Student();
		
		//Insert Or Save Data
		
//		st.setName("Chetan");
//		st.setCity("Hyderabaad");
//		studRepo.save(st);
//		System.out.println("Record Save Successfully");

		//Update Data
		
//		Student st1 = studRepo.findById(1).get();
//		st1.setName("Avinash");
//		st1.setCity("Jaipur");
//		studRepo.save(st1);
//		
//		System.out.println("Record Updated");
		

		//Delete Data
		
		Student st1 = studRepo.findById(3).get();
		studRepo.delete(st1);
		System.out.println("Record Deleted");
		
		// Print All Data
		
		List<Student> list = (List<Student>) studRepo.findAll();
		for (Student s : list) {
			System.out.println(s);
		}

	}

}
