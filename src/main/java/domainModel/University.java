package domainModel;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;

    @OneToMany(mappedBy = "university")
    List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "university")
    List<Teacher> teachers = new ArrayList<>();

    @OneToMany(mappedBy = "university")
    List<Class> classes = new ArrayList<>();
}
