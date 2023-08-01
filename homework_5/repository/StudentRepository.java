package homework_5.repository;

import homework_5.model.student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements UserRepository<student> {
    private static StudentRepository INSTANCE;

    public static StudentRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StudentRepository();
        }
        return INSTANCE;
    }

    private final List<student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    @Override
    public List<student> getAll() {
        return students;
    }

    @Override
    public void add(student student) {
        students.add(student);
    }

    @Override
    public void remove(String fullName) {
        for (student student : students) {
            if (student.getFullName().equals(fullName)) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }

}
