package menu;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("please select menu:");
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();

        Menu selectedMenu = Menu.find(selectedNumber);

        selectedMenu.process();
    }

    public static void processMenu(Menu menu) { //secilecek menunu teleb edir
        menu.process();
    }
}


