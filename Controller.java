package org.example.DZ5;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller{
    String name;


    public Controller() {
    }

    View view = new View();
    Logi logiControler = new Logi();
    Scanner scanner = new Scanner(System.in);
    Model model = new Model();


    public void vvodName(String name){
        view.privet(name);
        logiControler.addList(name);
    }
    public Integer vyborDey(int menu){
        String str = Integer.toString(menu);
        logiControler.addList(str);
        switch (menu){
            case 1:
                view.zaprosChisel();
                view.resultat(model.sum(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 2:
                view.zaprosChisel();
                view.resultat(model.vych(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 3:
                view.zaprosChisel();
                view.resultat(model.umn(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 4:
                view.zaprosChisel();
                view.resultat(model.del(scanner.nextDouble(), scanner.nextDouble()));
                break;
            case 5:
                logiControler.addList(String.valueOf(model.logiModel));
                logiControler.printLog();
                break;

            default: break;
        }
        return null;
    }
}
