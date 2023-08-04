package homework_5.repository;

import homework_5.model.team;

import java.util.List;

public interface TeamRepository<T extends team> {

    List<T> getAll();
    void add(T t);
    void remove(String teamName);
    Long getMaxId();

}