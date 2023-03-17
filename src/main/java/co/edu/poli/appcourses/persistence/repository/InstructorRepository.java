package co.edu.poli.appcourses.persistence.repository;

import co.edu.poli.appcourses.persistence.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends
        JpaRepository<Instructor, Long> {
}
