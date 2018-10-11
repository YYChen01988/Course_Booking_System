package com.example.codeclan.coursebookingsystem.repositories.courseRepositories;

import com.example.codeclan.coursebookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
