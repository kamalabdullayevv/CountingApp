package config;

public class Config {
    private static boolean isLoggedIn;


    public static boolean isLogin() {
        return isLoggedIn;
    }

    public static  boolean setLoggedIn(boolean isLoggedIn) {
        Config.isLoggedIn = isLoggedIn;

        return isLoggedIn;
    }

}
