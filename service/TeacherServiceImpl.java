package service;

import controller.TeacherController;
import data.Teacher;
import data.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService {
    private final TeacherRepository teacherRepository;
    private final TeacherController teacherController;


    public TeacherServiceImpl(TeacherRepository teacherRepository, TeacherController teacherController) {
        this.teacherRepository = teacherRepository;
        this.teacherController = teacherController;
    }


    public Teacher saveT(Teacher teacher) {
        return teacherController.save(teacher);
    }

    public Teacher findByIdT(int id) {
        return teacherController.findById(id);
    }

    public Teacher findByFioT(String fio) {
        return teacherController.findByFio(fio);
    }


    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }

    public Teacher findByFioteacher(String fio) {
        return teacherRepository.findByFio(fio);
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
