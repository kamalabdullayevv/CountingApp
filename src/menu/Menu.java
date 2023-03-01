package menu;

import config.Config;
import menuService.*;

public enum Menu {
    LOG_IN(1, "Hesaba giriş", new LogInService()),

    PENSIYA_ARTIMI(2,"Pensiya Artımı hesabla", new PensiyaArtimi()),

    LOG_OUT(3,"Hesabdan çıxış",new LogOutService()),

    EXIT(4,"Proqramdan çıxış",new Exit()),

    UNKNOWN;


    String name;
    int number;
    private MenuService service;

    Menu(int number, String name, MenuService service) {
        this.number = number;
        this.name = name;
        this.service = service;

    }
    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    Menu() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values(); //values-enumun icindeki butun meni bolmeleridir bunu menus massivine otururuk

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) { //aldigimiz deyer menuda varsa return edib aciqi
                return menus[i];
            }

        }
        return Menu.UNKNOWN; //yoxdursa UNKNOWN deyirik
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values(); //values-enumun icindeki butun menu bolmeleridir bunu menus massivine otururuk

        for (int i = 0; i < menus.length; i++) { //butun menulari gosteririk
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOG_IN) {

                    if (!Config.isLogin()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLogin()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}


