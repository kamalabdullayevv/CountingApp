package menuService;

import java.util.Scanner;

public class PensiyaArtimi implements MenuService {


    @Override
    public void process() {
        System.out.println("Əvvəli pensiyanızı yazın:");
        Scanner sc = new Scanner(System.in);
        double pensiya = sc.nextDouble();

        System.out.println("Artım faizini yazın:");
        Scanner sc2 = new Scanner(System.in);
        double faiz = sc.nextDouble();

        double solve = (pensiya * faiz / 100);
        double result = (pensiya + solve);

        System.out.println("Alacağınız yeni pensiya məbləği:" + result);

    }
}