package co.edu.poli.appcourses.persistence.repository;

import co.edu.poli.appcourses.persistence.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository
        extends JpaRepository<Course,Long> {
}
