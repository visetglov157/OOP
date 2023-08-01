package homework_5.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class team {

    private final Long id;
    private String teamName;
    private int maxStudents;
    private int maxTeachers;
    private List<student> studentRoster;
    private List<teacher> teacherRoster;


}