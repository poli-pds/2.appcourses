package co.edu.poli.appcourses.controller;

import co.edu.poli.appcourses.persistence.entity.Course;
import co.edu.poli.appcourses.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }
}

