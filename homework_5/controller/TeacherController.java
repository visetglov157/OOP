package homework_5.controller;

import homework_5.model.teacher;
import homework_5.service.user.UserService;

import java.util.List;

public class TeacherController implements UserController<teacher> {

    public UserService<teacher> teacherService;

    public TeacherController(UserService<teacher> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        teacherService.create(fullName, age, phoneNumber);
    }

    @Override
    public void createRandom(Integer quantity) {
        teacherService.createRandom(quantity);
    }

    @Override
    public List<Teacher> getAllUsersSortedByFirstName() {
        return teacherService.getAllUsersSortedByFirstName();
    }

    @Override
    public List<Teacher> getAllUsersSortedByLastName() {
        return teacherService.getAllUsersSortedByLastName();
    }

    @Override
    public List<Teacher> getAllUsersSortedByAge() {
        return teacherService.getAllUsersSortedByAge();
    }

    @Override
    public List<Teacher> getAllUsersSortedById() {
        return teacherService.getAllUsersSortedById();
    }

    @Override
    public boolean remove(String fullName) {
        teacherService.remove(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        teacherService.edit(fullName, age, phoneNumber);
    }


}