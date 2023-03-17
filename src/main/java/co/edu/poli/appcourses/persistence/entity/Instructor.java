package co.edu.poli.appcourses.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Long instructorId;
    private String indentification;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    @JsonManagedReference
    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER,
            cascade = CascadeType.PERSIST)
    private List<Course> courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return Objects.equals(instructorId, that.instructorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructorId);
    }
}