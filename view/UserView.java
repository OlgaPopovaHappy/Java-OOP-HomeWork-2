/* Создать package – view. Работу продолжаем в нем

Создать абстрактный класс UserView, содержащий в себе метод void showTheBest(List<User> userList)
, нутри вызывающий абстрактный метод User findTheBest(List<User> userList)

 Создать класс StudentView, унаследованный или имплементирующий UserView ,
 содержащий в себе реализация findTheBest
 */
package view;

import data.User;
import java.util.List;

public abstract class UserView {

    void ShowTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
    protected abstract User findTheBest(List<User> userList);

}
