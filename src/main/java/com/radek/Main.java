package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double vypocitej(double a, double b, char c) {


        if (b == 0 && c == '/') {
            throw new ArithmeticException("nelze dělit nulou");
        }

        switch (c) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return a / b;
            }
            default -> throw new IllegalArgumentException("neplatný operátor");
        }
    }

    public static void main(String[] args) {
        double[] a = {2, 67, 9, 34, 8, 10, 0, 5};
        double[] b = {3, 8, 0, 36, 4, 4, 5, 0};
        char[] c = {'*', '+', '/', '-', 'x','/', '/', '/'};


        for (int i = 0; i < a.length; i++) {
            try {
                double vysledek = vypocitej(a[i], b[i], c[i]);
                System.out.println("příklad: " + (i + 1) + " = " + vysledek);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("příklad: " + (i + 1) + " " + e.getMessage());
            }

        }


    }


}






