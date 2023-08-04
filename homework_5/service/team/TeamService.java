package homework_5.service.team;

import homework_5.model.student;
import homework_5.model.teacher;
import homework_5.model.team;

import java.util.List;

public interface TeamService<T extends team> {

    void create(String teamName);
    void createAndPopulate(String teamName);
    void populateStudentClassById(Long id);

    void load();

    List<T> getAllTeamsSortedById();

    List<T> getAllTeamsSortedByTeamName();

    void remove(String teamName);

    List<T> getAll();

    T getStudentClassById(Long id);

    T getStudentClassByName(String teamName);

    void addTeacher(Long teacherId, Long studentClassId);

    void addTeacher(String teacherName, Long studentClassId);

    void addStudent(Long studentId, Long studentClassId);

    void addStudent(String studentName, Long studentClassId);

    void setStudentClassTeacherLimitById(Long id, int limit);

    Long getStudentClassIdByUserName(String fullName);

    List<student> getStudentClassStudentsList(T studentClass);

    List<teacher> getStudentClassTeachersList(T studentClass);
}