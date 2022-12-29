package controller;

import data.Student;

public class StudentController implements UserController<Student, Integer> {
    public Student save(Student entity) {
        return null;
    }

    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
