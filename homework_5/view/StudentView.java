package homework_5.view;

import homework_5.controller.UserController;
import homework_5.model.student;

import java.util.List;

public class StudentView implements UserView<student> {

    UserController<student> controller;

    public StudentView(UserController<student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        int separatorLength = 39;
        List<student> students = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.ID -> controller.getAllUsersSortedById();
            case SortType.FIRSTNAME -> controller.getAllUsersSortedByFirstName();
            case SortType.SURNAME -> controller.getAllUsersSortedByLastName();
            case SortType.AGE -> controller.getAllUsersSortedByAge();
            default -> null;
        };
        if (students == null || students.size() < 1) {
            System.out.println("(DB:) студенты отсутствуют");
            return;
        }
        System.out.println("-".repeat(separatorLength));
        System.out.println("Студенты:");
        for (student student : students) {
            System.out.println(student);
        }
        System.out.println("-".repeat(separatorLength));
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void createRandom(Integer quantity) {
        controller.createRandom(quantity);
    }

    @Override
    public void remove(String fullName) {
        controller.remove(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        controller.edit(fullName, age, phoneNumber);
    }
}