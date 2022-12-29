package service;

import controller.StudentController;
import data.Student;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;


public class StudentServiceImpl implements DataService {
    private final StudentRepository studentRepository;
    private final StudentController studentController;


    public StudentServiceImpl(StudentRepository studentRepository, StudentController studentController) {
        this.studentRepository = studentRepository;
        this.studentController = studentController;
    }


    public Student saveSt(Student entity) {
        return studentController.save(entity);
    }

    public Student findByIdSt(int id) {
        return studentController.findById(id);
    }

    public Student findByFioSt(String fio) {
        return studentController.findByFio(fio);
    }


    public void saveStudent(Student entity) {
        studentRepository.save(entity);
    }

    public Student findByIdStudent(int id) {
        return studentRepository.findById(id);
    }

    public Student findByFioStudent(String fio) {
        return studentRepository.findByFio(fio);
    }


    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        ReaderFromTxt.read(user);
        return user;
    }

}
