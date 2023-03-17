package co.edu.poli.appcourses.services;

import co.edu.poli.appcourses.persistence.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    List<Course> findAll();

}
