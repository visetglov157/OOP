package homework_3;

public class controller {
    private StudentGroupService studentGroupService;
    private StreamService streamService;

    public controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public boolean delStudent(String f, String i, String o) {
        return studentGroupService.removeStudent(f, i, o);
    }

    public void sortByStudentIdOfStudentGroup(){
        studentGroupService.sortStudentsById();
    }

    public void sortByNameOfStudentGroup(){
        studentGroupService.sortStudentsByName();
    }

    public void sortBySizeListStream(){
        streamService.sortStudentsStreamBySize();
    }
}
