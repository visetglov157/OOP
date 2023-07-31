package homework_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<student>{

    @Override
    public int compare(student arg0, student arg1) {
        String name0 = arg0.getSurname() + arg0.getFirstname() + arg0.getPatronymic();
        String name1 = arg1.getSurname() + arg1.getFirstname() + arg1.getPatronymic();
        return name0.compareToIgnoreCase(name1);        
    }
    
}