package homework_5.model;

import lombok.Getter;
import lombok.ToString;
import homework_5.service.iterator.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
//@Data
public class StudentGroup implements Iterable<student> {

    private final List<student> studentsList;

    public StudentGroup() {
        this.studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<student> iterator() {
        return new StudentGroupIterator(studentsList);
    }

}
