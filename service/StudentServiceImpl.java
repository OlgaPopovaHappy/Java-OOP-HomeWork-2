package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

/** класс реализирует методы интерфейса */
public class StudentServiceImpl implements DataService{
    @Override
    public void create(User user) {
        WriterToTxt.write(user); // в статичный метод передаем только переменую
    }

    @Override
    public User read(User user) {
        ReaderFromTxt.read(user);
        return user;
    }
}
