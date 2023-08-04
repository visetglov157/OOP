package homework_5.service.datareader;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentClassLoader extends DataReader {

    List<String> studentClasses;

    public StudentClassLoader() throws IOException {
        this.studentClasses = getStudentClassNames();
    }

    public List<String> getData() {
        return this.studentClasses;
    }
}