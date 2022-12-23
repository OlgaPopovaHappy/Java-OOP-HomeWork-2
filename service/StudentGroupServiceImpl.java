package service;

import data.User;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements GroupService {

    /** ДЗ -
     * Создать класс StudentGroupServiceImpl, в котором
     * реализована логика чтения Студентов и Преподавателя
     * из файла txt (реализация чтения файла опциональна),
     * создания класса StudentGroup и возвращения его.
     */
    @Override
    public User createGroup(User StudentGroup) {
        ReaderFromTxt.read(StudentGroup);
        return StudentGroup;
    }


}
