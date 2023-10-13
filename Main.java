package org.example.DZ5;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        View view = new View();
        System.out.println("Введите свое имя: ");
        controller.name = (scanner.nextLine());
        controller.vvodName(controller.name);
        boolean flag = true;
        while (flag) {
            view.menuCalсulator();
            controller.vyborDey(Integer.parseInt(scanner.nextLine()));
            System.out.println("Выйти из калькулятора? [Y/N]");
            if (scanner.nextLine().equals("y")) {
                System.out.println("До свидания " + controller.name);
                flag = false;
            }
        }
    }
}