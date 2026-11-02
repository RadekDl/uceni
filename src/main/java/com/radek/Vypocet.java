package com.radek;

public class Vypocet {
    public static double vypocitej(VstupProVypocet vstupProVypocet) {
        if ( vstupProVypocet == null) {
            throw new ChybejiciVstup("Chybí vstupní hodnota pro výpočet");
        }

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
