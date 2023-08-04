package homework_5.repository;

import homework_5.model.teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements UserRepository<teacher> {
    private static TeacherRepository INSTANCE;

    public static TeacherRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TeacherRepository();
        }
        return INSTANCE;
    }

    private final List<teacher> teachers;

    public TeacherRepository() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(String name) {
        for (teacher teacher : teachers) {
            if (teacher.getFullName().equals(name)) {
                teachers.remove(teacher);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (teacher teacher : teachers) {
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }

}