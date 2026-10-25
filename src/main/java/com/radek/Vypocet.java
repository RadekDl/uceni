package com.radek;

public class Vypocet {
    private VstupProVypocet vstupProVypocet;

    public double vypocitej(VstupProVypocet vstupProVypocet) {


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
