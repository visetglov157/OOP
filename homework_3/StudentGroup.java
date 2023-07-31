package homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<student>{
    private Integer groupId;
    private List<student> studentGroup;

    public StudentGroup(Integer groupId) {
        this.groupId = groupId;
        this.studentGroup = new ArrayList<student>();
    }

    public StudentGroup(Integer groupId, List<student> students) {
        this.groupId = groupId;
        this.studentGroup = students;

    }

    public List<student> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<student> students) {
        this.studentGroup = students;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentsGroup [groupId=" + groupId + ", students=" + studentGroup + "]";
    }

    @Override
    public Iterator<student> iterator() {
        return new StudentGroupInerator(this);
    }

    public boolean addStudent(student student){
        if (studentGroup != null) {
            studentGroup.add(student);
            return true;
        }
        return false;
    }

}