package co.edu.poli.appcourses.services;

import co.edu.poli.appcourses.persistence.entity.Instructor;
import co.edu.poli.appcourses.persistence.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }
}
