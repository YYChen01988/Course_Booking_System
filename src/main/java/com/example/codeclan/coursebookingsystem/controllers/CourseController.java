package com.example.codeclan.coursebookingsystem.controllers;

import com.example.codeclan.coursebookingsystem.models.Course;
import com.example.codeclan.coursebookingsystem.repositories.courseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesWithCertainRating(@PathVariable int rating){
        return courseRepository.getCoursesWithCertainRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getCoursesForCustomer(@PathVariable Long id){
        return courseRepository.getCoursesForCustomer(id);
    }


}
