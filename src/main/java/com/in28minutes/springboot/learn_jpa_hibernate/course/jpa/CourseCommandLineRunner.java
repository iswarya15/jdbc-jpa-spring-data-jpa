package com.in28minutes.springboot.learn_jpa_hibernate.course.jpa;

import com.in28minutes.springboot.learn_jpa_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS JPA", "udemy"));
        repository.insert(new Course(2, "Spring Boot jpa", "Udemy"));
        repository.insert(new Course(3, "Learn Kafka", "anonym"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));

    }
}
