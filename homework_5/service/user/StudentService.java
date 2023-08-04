package homework_5.service.user;

import homework_5.model.student;
import homework_5.model.user;
import homework_5.repository.StudentRepository;
import homework_5.repository.UserRepository;
import homework_5.service.comparator.UserComparator;
import homework_5.service.randomizer.StudentRandomizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<student> {

    private final UserRepository<student> studentRepository;
    private final StudentRandomizer studentRandomizer;

    public StudentService() throws IOException {
        this.studentRepository = StudentRepository.getInstance();
        this.studentRandomizer = new StudentRandomizer();
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        for (student student : studentRepository.getAll()) {
            if (student.getFullName().equals(fullName)) {
                System.out.println("(createStudent:)'" + fullName + "' <- запись уже существует");
                return;
            }
        }
        Long id = studentRepository.getMaxId() + 1;
        student student = new student(id, fullName, age, phoneNumber);
        studentRepository.add(student);
    }

    @Override
    public void createRandom(Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            create(studentRandomizer.getData().get(0),
                    Integer.valueOf(studentRandomizer.getData().get(1)),
                    studentRandomizer.getData().get(2)
            );
        }
    }

    @Override
    public List<student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<student> getAllUsersSortedByFirstName() {
        List<student> students = studentRepository.getAll();
        Collections.sort(students);

        return students;
    }

    @Override
    public List<student> getAllUsersSortedByLastName() {
        List<student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());

        return students;
    }

    @Override
    public List<student> getAllUsersSortedByAge() {
        List<student> students = studentRepository.getAll();
        students.sort((Comparator.comparing(user::getAge)));

        return students;
    }

    @Override
    public List<student> getAllUsersSortedById() {
        List<student> students = studentRepository.getAll();
        students.sort((Comparator.comparing(user::getId)));

        return students;
    }

    @Override
    public void remove(String fullName) {
        studentRepository.remove(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        for (student student : studentRepository.getAll()) {
            if (student.getFullName().equals(fullName)) {
                System.out.println("(editStudent:)'" + fullName + "' <- запись найдена");
                student.setAge(age);
                student.setPhoneNumber(phoneNumber);
                System.out.println("(editStudent:)*поля age и phoneNumber обновлены*");
                return;
            }
        }
        System.out.println("(editStudent:)'" + fullName + "' <- запись не найдена");
    }

    @Override
    public List<student> getAvailableUsers() {
        List<student> studentList = new ArrayList<>();
        for (student student : studentRepository.getAll()) {
            if (student.getTeam_id() == null) {
                studentList.add(student);
            }
        }
        return studentList;
    }

}
