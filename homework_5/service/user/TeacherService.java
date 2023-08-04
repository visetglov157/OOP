package homework_5.service.user;

import homework_5.model.teacher;
import homework_5.model.user;
import homework_5.repository.TeacherRepository;
import homework_5.repository.UserRepository;
import homework_5.service.comparator.UserComparator;
import homework_5.service.randomizer.TeacherRandomizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<teacher> {

    private final UserRepository<teacher> teacherRepository;
    private final TeacherRandomizer teacherRandomizer;

    public TeacherService() throws IOException {
        this.teacherRepository = TeacherRepository.getInstance();
        this.teacherRandomizer = new TeacherRandomizer();
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        for (teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(createTeacher:)'" + fullName + "' <- запись уже существует");
                return;
            }
        }
        Long id = teacherRepository.getMaxId() + 1;
        teacher teacher = new teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public void createRandom(Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            create(teacherRandomizer.getData().get(0),
                    Integer.valueOf(teacherRandomizer.getData().get(1)),
                    teacherRandomizer.getData().get(2)
            );
        }
    }

    @Override
    public List<teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<teacher> getAllUsersSortedByFirstName() {
        List<teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);

        return teachers;
    }

    @Override
    public List<teacher> getAllUsersSortedByLastName() {
        List<teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());

        return teachers;
    }

    @Override
    public List<teacher> getAllUsersSortedByAge() {
        List<teacher> teachers = teacherRepository.getAll();
        teachers.sort((Comparator.comparing(user::getAge)));

        return teachers;
    }

    @Override
    public List<teacher> getAllUsersSortedById() {
        List<teacher> teachers = teacherRepository.getAll();
        teachers.sort((Comparator.comparing(user::getId)));

        return teachers;
    }

    @Override
    public void remove(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        for (teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(editTeacher:)'" + fullName + "' <- запись найдена");
                System.out.println("(editTeacher:)*поля age и phoneNumber обновлены*");
                Long id = teacher.getId();
                teacherRepository.remove(fullName);
                teacher editedTeacher = new teacher(id, fullName, age, phoneNumber);
                teacherRepository.add(editedTeacher);
                return;
            }
        }
        System.out.println("(editTeacher:)'" + fullName + "' <- запись не найдена");
    }

    @Override
    public List<teacher> getAvailableUsers() {
        List<teacher> teacherList = new ArrayList<>();
        for (teacher teacher : teacherRepository.getAll()) {
            if (teacher.getTeam_id() == null) {
                teacherList.add(teacher);
            }
        }
        return teacherList;
    }
}