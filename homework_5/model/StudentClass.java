package homework_5.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = true)
public class StudentClass extends team implements Comparable<StudentClass> {

    public StudentClass(Long id,
                        String teamName,
                        int maxStudents,
                        int maxTeachers,
                        List<student> studentRoster,
                        List<teacher> teacherRoster
                        ) {
        super(id, teamName, maxStudents, maxTeachers, studentRoster, teacherRoster);
    }

    @Override
    public int compareTo(StudentClass o) {
        return getTeamName().compareTo(o.getTeamName());
    }

    @Override
    public String toString() {
        return String.format("%3s %22s  %s/%s  %2s/%2s"
                , getId()
                , getTeamName()
                , getTeacherRoster().size()
                , getMaxTeachers()
                , getStudentRoster().size()
                , getMaxStudents()
                );
    }

}
