package data.comparator;

import data.Student;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {
    /** упорядочивание студентов по ФИО */
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFio().compareTo(student2.getFio());
    }
}
