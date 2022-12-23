package controller;

import data.Student;
import data.StudentGroup;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

public class Controller {
    private StudentServiceImpl studentService;
    private StudentGroupServiceImpl studentGroupService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student){
        studentService.create(student); // интерфейс.метод_интерфейса
        return (Student) studentService.read((student));
    }

    /** ДЗ - Создать метод в Controller createGroup(int groupNumber),
        в который передается номер группы, а возвращается StudentGroup. */
    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}
