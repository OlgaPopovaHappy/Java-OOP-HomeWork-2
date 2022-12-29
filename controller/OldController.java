package controller;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

import java.util.List;

public class OldController {
    private final StudentServiceImpl studentService;
    private final StudentGroupServiceImpl studentGroupService;
    private final GroupStreamServiceImpl groupStreamService;

    public OldController(StudentServiceImpl studentService, StudentGroupServiceImpl studentGroupService, GroupStreamServiceImpl groupStreamService) {
        this.studentService = studentService;
        this.studentGroupService = studentGroupService;
        this.groupStreamService = groupStreamService;
    }

    public Student createStudent(Student student) {
        studentService.create(student); // интерфейс.метод_интерфейса
        return (Student) studentService.read((student));
    }

    public StudentGroup createGroup(int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }

    public void removeStudent(String fio) {
        studentGroupService.removeStudent(fio);
    }

    public void sortGroups(List<GroupStream> groupStream) {
        groupStreamService.sortGroupStream(groupStream);
    }

}
