package homework_5.service.comparator;

import homework_5.model.team;

import java.util.Comparator;

public class StudentClassComparator<T extends team> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getTeamName().compareTo(o2.getTeamName());
    }
}