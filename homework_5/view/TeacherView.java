package homework_5.view;

import homework_5.controller.UserController;
import homework_5.model.teacher;

import java.util.List;

public class TeacherView implements UserView<teacher> {

    UserController<teacher> controller;

    public TeacherView(UserController<teacher> controller) {
        this.controller = controller;
    }


    @Override
    public void sendOnConsole(String sortType) {
        int separatorLength = 39;
        List<teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.ID -> controller.getAllUsersSortedById();
            case SortType.FIRSTNAME -> controller.getAllUsersSortedByFirstName();
            case SortType.SURNAME -> controller.getAllUsersSortedByLastName();
            case SortType.AGE -> controller.getAllUsersSortedByAge();
            default -> null;
        };
        if (teachers == null || teachers.size() < 1) {
            System.out.println("(DB:) преподаватели отсутствуют");
            return;
        }
        System.out.println("-".repeat(separatorLength));
        System.out.println("Преподаватели:");
        for (teacher teacher : teachers) {
            System.out.println(teacher);
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