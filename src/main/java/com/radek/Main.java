package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double vypocitej(int a, int b, char c) {
        if (b == 0 && c == '/') {
            throw new ArithmeticException("nelze dělit nulou");
        }

        switch (c) {
            case '+' -> {
                return a + b;
            }
        default -> throw new IllegalArgumentException("neplatný operátor");
    }
}


    public static void main(String[] args) {

       double[] a = {2, 67, 9, 34, 8};
       double[] b = {3, 8, 0, 36, 4};
       char[] c = {'*', '+', '/','-', 'x'};


    }
}





