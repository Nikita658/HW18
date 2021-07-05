package HW18;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.create(
                new Users("1", "v", "m", "v m", "v@"));
        userDao.create(
                new Users("9", "s", "l", "s l", "s@"));
        userDao.create(
                new Users("3", "c", "a", "c a", "c@"));

        userDao.remove("2");
        System.out.println(userDao.getById("3"));
        System.out.println(userDao.getAll());
        System.out.println(userDao.users);

        userDao.writeUser();
        userDao.readUser();
    }
}