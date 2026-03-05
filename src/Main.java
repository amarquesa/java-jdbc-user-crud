import dao.UserDao;
import model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDao dao = new UserDao();

        List<User> users = dao.listAll();

        System.out.println("Lista de usuários:\n");

        for (User u : users) {
            System.out.println(u.getId() + " | " + u.getName() + " | " + u.getEmail());
        }
    }
}