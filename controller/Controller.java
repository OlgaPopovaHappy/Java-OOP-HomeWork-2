/*
1. Создать packege - controller. Работу продолжаем внем.

 2. Создать класс Controller содержащий в себе необходимые
 интерфейсы в виде переменных, а в конструкторе создаем объекты
 конкретных реализацийю

 3. Создаем метод CreateStudent(Student student) -
 реализующих логику, путем вызова соответствующих методов интерфейсов:
 a. Создания Студента
 b. Записи в файл Студента
 c. Чтения того, что записали
 d. Возвращаем в методе то, что мы прочли в файле
 */
package controller;

import data.Student;
import data.StudentGroup;
import service.DataService;


public class Controller {
    private DataService studentService;
    private DataService studentGroup;

    public Controller(DataService studentService, DataService studentGroup) {
        this.studentService = studentService;
        this.studentGroup = studentGroup;
    }

    public Student createStudent(Student student){
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public Student writeStudent (Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }



}
