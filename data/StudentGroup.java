package data;

import java.util.Iterator;
import java.util.List;

/**
 * - Модифицировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
 * - Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
 */
public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> students;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List<Student> students, int groupNumber) {

        this.teacher = teacher;
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}