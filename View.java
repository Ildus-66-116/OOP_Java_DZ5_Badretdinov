package org.example.DZ5;

import java.util.List;

public class View {
    public View() {
    }

    public void privet(String name){
        System.out.println("Приветствую " + name + "!\n");
    }

    public void menuCalсulator(){
        System.out.println("Меню калькулятора: \n" +
                "1. Сложение \n" +
                "2. Выичитание \n" +
                "3. Умножение \n" +
                "4. Деление \n" +
                "5. Логи ");
    }
    public void zaprosChisel(){
        System.out.println("Введите числа: ");
    }
    public void resultat(Double res){
        System.out.println("Результат: " + res);
    }
}
