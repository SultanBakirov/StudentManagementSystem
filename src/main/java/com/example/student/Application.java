package com.example.student;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  {  // implements CommandLineRunner
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Student student1 = new Student("Sultan", "Bakirov", "sultan@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Albert", "Ernist uulu", "albert@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Edil", "Joldubaev", "edil@gmail.com");
//        studentRepository.save(student3);
//    }
}
