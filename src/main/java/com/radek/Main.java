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
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("chyba vstupu u sčítání: " + e.getClass().getSimpleName()+" "+e.getMessage());
        }
        try {
            System.out.println(vypocitej(4, 0, '*'));

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("chyba vstupu násobení: "+ e.getClass().getSimpleName()+" "+ e.getMessage());
        }
        try {
            System.out.println(vypocitej(5, 0, '/'));

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("chyba výpočtu: " + e.getClass().getSimpleName()+" "+e.getMessage());
        }
        try {
            System.out.println(vypocitej(89, 7, '-'));
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("chyba vstupu u odčítání: " + e.getClass().getSimpleName()+" "+ e.getMessage());
        }
    }
}
// Co platí
//samostatné bloky	pořadí záleží, konkrétní nahoře
//A | B	pořadí nezáleží, typy nesmí být v příbuzenském vztahu