package menuService;

public class Exit implements MenuService{
    @Override
    public void process() {
        System.exit(0);
    }
}
