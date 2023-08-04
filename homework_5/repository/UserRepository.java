package homework_5.repository;

import homework_5.model.user;

import java.util.List;

public interface UserRepository<T extends user> {

    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}