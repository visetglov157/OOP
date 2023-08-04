package homework_5.service.iterator;

import homework_5.model.teacher;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TeacherGroupIterator implements Iterator<teacher> {

    private final List<teacher> teacherList;
    private int position;

    public TeacherGroupIterator(List<teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return position < teacherList.size();
    }

    @Override
    public teacher next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return teacherList.get(position++);
    }

    @Override
    public void remove() {
        teacherList.remove(position - 1);
    }

}