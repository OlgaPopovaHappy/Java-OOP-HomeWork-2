package service;

import data.*;
import util.ReaderFromTxt;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupServiceImpl implements DataService {
    @Override
    public void create(User user) {

    }

    @Override
    public User read(User user) {
        return null;
    }

    public StudentGroup getGroup() {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt());
    }
    public StudentGroup getGroup(int getNumber) {
        return new StudentGroup(getTeacherFromTxt(), getStudentsFromTxt(), getNumber);
    }

//    @Override
//    public User createGroup(int groupNumber) {
//        Teacher teacher = ReaderFromTxt.readTeacher(groupNumber);
//        List<Student> students = ReaderFromTxt.readStudents(groupNumber);
//        return new StudentGroup(teacher, students);
//    }

/** семинар-3
 * - Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО
 */
    public void removeStudent(String fio){
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()){
            Student student =  studentGroup.next();
            if (fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }
    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudents());
    }

}
