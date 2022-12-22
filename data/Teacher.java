package data;

/* Создать package – data. Работу продолжаем в нем
Реализовать абстрактный класс data.User и его наследники data.Student и data.Teacher.
 Родитель имеет в себе общие данные (фио, год рождения, паспорт (серия номер),

  а наследники собственные параметры (номер группы для data.Student, кафедра для data.Teacher). */
public class Teacher extends User{

    private int department;

    public Teacher(String fio, int age, int passport) {
        super(fio, age, passport);
        this.department = department;
    }
}
