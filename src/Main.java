import dao.UserDao;
import model.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Amanda", "amanda@gmail.com");

        UserDao dao = new UserDao();
        dao.create(user);

        System.out.println("Fim ✅");
    }
}