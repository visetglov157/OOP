package homework_5.service.iterator;

import homework_5.model.student;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentGroupIterator implements Iterator<student> {

    private final List<student> studentList;
    private int position;

    public StudentGroupIterator(List<student> studentsList) {
        this.studentList = studentsList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return studentList.get(position++);
    }

    @Override
    public void remove() {
        studentList.remove(position-1);
    }
}
