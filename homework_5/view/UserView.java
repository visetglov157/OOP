package homework_5.view;

import homework_5.model.user;

public interface UserView<T extends user> {

    void sendOnConsole(String sortType);  // GET request
    void create(String fullName, Integer age, String phoneNumber);  // POST request
    void createRandom(Integer quantity);
    void remove(String fullName);  // DELETE request
    void edit(String fullName, Integer age, String phoneNumber);  // PUT request
}
