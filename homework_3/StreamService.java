package homework_3;

import java.util.List;

public class StreamService {
    private List<stream> listStreams;

    public StreamService(List<stream> listStreams) {
        this.listStreams = listStreams;
    }

    public void sortStudentsStreamBySize(){
        listStreams.sort(new StreamComparator());
    }
    
}
