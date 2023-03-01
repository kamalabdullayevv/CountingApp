package menuService;

public class LogOutService implements MenuService {
    @Override
    public void process() {
        new LogInService();
    }
}
