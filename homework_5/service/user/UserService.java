package homework_5.service.user;

import homework_5.model.student;
import homework_5.model.user;

import java.util.List;

public interface UserService<T extends user> {

    void create(String fullName, Integer age, String phoneNumber);

    void createRandom(Integer quantity);

    List<T> getAll();

    List<T> getAllUsersSortedByFirstName();

    List<T> getAllUsersSortedByLastName();

    List<T> getAllUsersSortedByAge();

    List<T> getAllUsersSortedById();

    void remove(String fullName);

    void edit(String fullName, Integer age, String phoneNumber);

    List<T> getAvailableUsers();
}
