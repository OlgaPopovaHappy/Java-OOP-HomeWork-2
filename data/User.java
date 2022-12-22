package data;/* Создать package – data. Работу продолжаем в нем
Реализовать абстрактный класс data.User и его наследники
data.Student и data.Teacher. Родитель имеет в себе общие данные
(фио, год рождения, паспорт (серия номер), а наследники
собственные параметры (номер группы для data.Student, кафедра для data.Teacher).
 */


public abstract class  User {
    protected String fio;
    protected int age;
    protected int passport;


    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }
}
