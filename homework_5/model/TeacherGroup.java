package homework_5.model;

import lombok.Getter;
import lombok.ToString;
import homework_5.service.iterator.TeacherGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
public class TeacherGroup implements Iterable<teacher> {

    private final List<teacher> teachersList;

    public TeacherGroup() {
        this.teachersList = new ArrayList<>();
    }

    @Override
    public Iterator<teacher> iterator() {
        return new TeacherGroupIterator(teachersList);
    }

}