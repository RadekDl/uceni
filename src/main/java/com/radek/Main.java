package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static double vypocitej(double a, double b, char znak) {
        if (b == 0 && znak == '/') {
            throw new ArithmeticException("nelze dělit nulou");
        }

        switch (znak) {
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

        try {
            System.out.println(vypocitej(4, 0, '+'));
            System.out.println(vypocitej(4, 0, '*'));
            System.out.println(vypocitej(5, 0, '/'));


        } catch (ArithmeticException e) {
            System.out.println("chyba výpočtu: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("chyba vstupu: " + e.getMessage());
        }
    }
}