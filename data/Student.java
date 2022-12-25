package data;

public class Student extends User implements Comparable<Student>{
    private int groupNumber;

    public Student(String fio, int age, int passport, int groupNumber) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    /** Упорядочивание по возрасту */
    @Override
    public int compareTo(Student student) {
        if (student.getAge() < this.getAge()) return 1;
        if (student.getAge() > this.getAge()) return -1;
        else return 0;
    }
}
