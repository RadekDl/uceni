package com.radek;

public class Vypocet {

    public double vypocitej(VstupProVypocet vstupProVypocet) {

    double a = vstupProVypocet.getPrvniCislo();
    double b = vstupProVypocet.getDruheCislo();
    char c = vstupProVypocet.getOperator();

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

}
