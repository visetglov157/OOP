package homework_5.controller;

import homework_5.model.student;
import homework_5.service.user.UserService;

import java.util.List;

public class StudentController implements UserController<student> {

    public UserService<student> studentService;

    public StudentController(UserService<student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public void createRandom(Integer quantity) {
        studentService.createRandom(quantity);
    }

    @Override
    public List<student> getAllUsersSortedByFirstName() {
        return studentService.getAllUsersSortedByFirstName();
    }

    @Override
    public List<student> getAllUsersSortedByLastName() {
        return studentService.getAllUsersSortedByLastName();
    }

    @Override
    public List<student> getAllUsersSortedByAge() {
        return studentService.getAllUsersSortedByAge();
    }

    @Override
    public List<student> getAllUsersSortedById() {
        return studentService.getAllUsersSortedById();
    }

    @Override
    public boolean remove(String fullName) {
        studentService.remove(fullName);
        return true;
    }

    @Override
    public List<student> getAll() {
        return studentService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        studentService.edit(fullName, age, phoneNumber);
    }


}
