package com.example.codeclan.coursebookingsystem.repositories.courseRepositories;

import com.example.codeclan.coursebookingsystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesWithCertainRating(int rating);
}
