package data;

public abstract class User {
    protected String fio;
    protected int age;
    protected int passport;


    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPassport() {
        return passport;
    }
    public void setPassport(int passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "User{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }
}
