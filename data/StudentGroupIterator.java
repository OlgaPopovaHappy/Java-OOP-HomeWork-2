package data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private List<Student> students;
//    private Iterator<Student> students;
    private int cursor; // курсор показывает на каком эл-те списка мы сейчас находимся

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudents();
//        this.students = studentGroup.getStudents().iterator();
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getCursor() {
        return cursor;
    }
    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
//        return this.students.hasNext();
    }
    @Override
    public Student next() {
    return students.get(cursor++); // получаем студента, после перемещаемся на следующего
//        return this.students.next();
    }
    @Override
    public void remove() {
        this.students.remove(cursor);
//        this.students.remove();
    }
}

