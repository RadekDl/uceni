package com.radek;

public class VstupProVypocet {
    private final double prvniCislo;
    private final double druheCislo;
    private final char operator;

    public VstupProVypocet(double prvniCislo, double druheCislo, char operator) {
        this.prvniCislo = prvniCislo;
        this.druheCislo = druheCislo;
        this.operator = operator;
    }

    public double getPrvniCislo() {
        return prvniCislo;
    }

    public double getDruheCislo() {
        return druheCislo;
    }

    public char getOperator() {
        return operator;
    }
}
