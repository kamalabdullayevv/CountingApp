package menuService;

import config.Config;

import java.util.Scanner;

public class LogInService implements MenuService {

    @Override
    public void process() {
        String username;
        String password;

        System.out.println("username:");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();

        System.out.println("password:");
        Scanner sc2 = new Scanner(System.in);
        password = sc2.nextLine();
        try {
            if (!(username.equals("kamal") && password.equals("12345"))) {
                System.out.println("username or password is incorrect!");


            } else {
                System.out.println("You Logged in!");
                Config.setLoggedIn(true);

            }

        } catch (Exception ex) {
            System.out.println("Try again!");
            new LogInService();
        }


    }
}
