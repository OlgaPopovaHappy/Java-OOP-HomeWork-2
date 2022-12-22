package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService{
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
