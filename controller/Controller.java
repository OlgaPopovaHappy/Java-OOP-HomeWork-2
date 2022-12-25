package controller;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

import java.util.List;

public class Controller {
    private StudentServiceImpl studentService;
    private StudentGroupServiceImpl studentGroupService;
    private GroupStreamServiceImpl groupStreamService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student){
        studentService.create(student); // интерфейс.метод_интерфейса
        return (Student) studentService.read((student));
    }

    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }

    /**  ДЗ №3
     * - Модифицировать класс Controller,
     * добавив в него метод удаления студента и
     * вызывать в нем созданный метод из StudentGroupServiceImpl
     */
    public void removeStudent(String fio){
        studentGroupService.removeStudent(fio);
    }

    /** ДЗ №3
     * Модифицировать класс Controller, добавив в него метод,
     * сортирующий список потоков, путем вызова созданного сервиса
     */
    public void sortGroups(List<GroupStream> groupStream){
        groupStreamService.sortGroupStream(groupStream);
    }

}
