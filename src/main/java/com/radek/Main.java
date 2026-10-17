package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void nazevDne(int cislo){
        switch (cislo) {
            case 1 -> System.out.println("pondělí");
            case 2 -> System.out.println("úterý");
            case 3 -> System.out.println("středa");
            case 4 -> System.out.println("čtvrtek");
            case 5 -> System.out.println("pátek");
            case 6 -> System.out.println("sobota");
            case 7 -> System.out.println("neděle");
            default -> System.out.println("zadal jsi číslo mimo rozsah 1-7 včetně");

        }

    }

    static void jeVikend(int cislo){
        switch (cislo){
            case 1, 2, 3, 4, 5 -> System.out.println("je pracovní den");
            case 6, 7 -> System.out.println("je víkend");
            default -> System.out.println("nezadal jsi číslo od 1 po 7 pro nějaký den");
        }
    }

    static void operace (String znak){
        switch (znak){
            case "+" -> System.out.println("sčítání");
            case "-" -> System.out.println("odčítání");
            default -> System.out.println("zadej '+' a nebo '-'!");
        }
    }



    public static void main(String[] args) {

        nazevDne(1);
        nazevDne(6);
        nazevDne(9);

        jeVikend(8);
        jeVikend(3);
        jeVikend(7);

        operace("+");
        operace("-");
        operace("/");

        System.out.println('+' + 1);
        System.out.println(1 + 2 + "a" + (1 + 2));


    }
}