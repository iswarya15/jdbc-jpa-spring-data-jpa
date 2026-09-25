
package com.in28minutes.springboot.learn_jpa_hibernate.course.springdatajpa;

import com.in28minutes.springboot.learn_jpa_hibernate.course.Course;
import com.in28minutes.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRespository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS JPA", "udemy"));
        repository.save(new Course(2, "Spring Boot jpa", "Udemy"));
        repository.save(new Course(3, "Learn Kafka", "anonym"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));

    }
}

