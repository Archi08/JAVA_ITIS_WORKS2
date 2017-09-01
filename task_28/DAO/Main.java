package DAO;


public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoTextFileBaseImpl("D:\\Java\\HomeWork\\src\\DAO\\text.txt");
        UserService userService = new UserService(userDao);

        System.out.println(userService.isRegistredPerson("Николаев"));
        System.out.println(userService.isRegistredPerson("Николаев"));

    }
}
