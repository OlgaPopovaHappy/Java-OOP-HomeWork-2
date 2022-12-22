package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.User;
import util.ReaderFromTxt;
;

public class StudentGroupServiceImpl {
    private StudentGroup group;

    public StudentGroupServiceImpl(StudentGroup group) {
        this.group = group;
    }

    public StudentGroup getGroup() {
        return group;
    }

    public void setGroup(StudentGroup group) {
        this.group = group;
    }

    public Student read(Student student) {
        return (Student) ReaderFromTxt.read(student);
    }

    public Teacher read(Teacher teacher) {
        return (Teacher) ReaderFromTxt.read(teacher);
    }
}
