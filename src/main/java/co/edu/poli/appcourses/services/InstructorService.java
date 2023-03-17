package co.edu.poli.appcourses.services;

import co.edu.poli.appcourses.persistence.entity.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);
    List<Instructor> findAll();

}
