package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String jmeno = "Radek";
        double vyska = 183.5;
        int vek = 50;
        boolean masRadKavu = true;

        int cisloA = 7;
        int cisloB = 2;
        int cisloC = 10;
        int cisloD = 3;
        int cisloE = 8;
        double x = 9.99;


        System.out.println("výsledek modulo 7 % 2 "+ (cisloA % cisloB));
        System.out.println("výsledek modulo 10 % 3 "+ (cisloC % cisloD));
        System.out.println("výsledek modulo 8 % 2 "+ (cisloE % cisloB));
        System.out.println("zkácený zápis 10 += 5 " + (cisloC += 5));

        System.out.println("zkrácený zápis 10 *= 2 "+ (cisloC *= 2));

        System.out.println("zkrácený zápis 10 -= 3 "+ (cisloC -= 3));

        System.out.println("zkrácený zápis 10 ++ "+ ( cisloC ++));
        System.out.println("změna po postfix "+ cisloC);
        System.out.println("přetypování double na int "+ (int) x);
        System.out.println("x"+(2+3));


    }
}