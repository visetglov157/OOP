package homework_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<stream>{

    @Override
    public int compare(stream arg0, stream arg1) {
        return Integer.compare(arg0.getListStudentGroup().size(), arg1.getListStudentGroup().size());
    }
    
}
