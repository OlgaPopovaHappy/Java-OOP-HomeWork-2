package controller;

import data.User;

public interface UserController<E extends User, I> extends Controller<E, I> {
    E findByFio(String fio);


}
