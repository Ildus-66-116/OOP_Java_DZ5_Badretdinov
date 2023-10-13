package org.example.DZ5;

import java.util.Scanner;

public class Model {
    Logi logiModel = new Logi();



    public double sum(double a, double b) {
        String str1 = Double.toString(a);
        logiModel.addList(str1);
        String str2 = Double.toString(b);
        logiModel.addList(str2);
        double result = a + b;
        String str3 = Double.toString(result);
        logiModel.addList(str3);
        return result;
    }
    public double vych(double a, double b) {
        String str1 = Double.toString(a);
        logiModel.addList(str1);
        String str2 = Double.toString(b);
        logiModel.addList(str2);
        double result = a - b;
        String str3 = Double.toString(result);
        logiModel.addList(str3);
        return result;
    }
    public double umn(double a, double b) {
        String str1 = Double.toString(a);
        logiModel.addList(str1);
        String str2 = Double.toString(b);
        logiModel.addList(str2);
        double result = a * b;
        String str3 = Double.toString(result);
        logiModel.addList(str3);
        return result;
    }
    public double del(double a, double b) {
        if (a == 0){
            System.out.println("Деление на 0 не возможно!");
        }
        String str1 = Double.toString(a);
        logiModel.addList(str1);
        String str2 = Double.toString(b);
        logiModel.addList(str2);
        double result = a / b;
        String str3 = Double.toString(result);
        logiModel.addList(str3);
        return result;
    }

}

