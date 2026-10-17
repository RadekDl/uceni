package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void vypisZnamenko( int cislo){
        if (cislo > 0){
            System.out.println(cislo +" je kladné");
        } else if (cislo < 0) {
            System.out.println(cislo + " je záporné");
        } else {
            System.out.println("zadal jsi " +cislo);
        }
    }

    public static void main(String[] args) {

       vypisZnamenko(1);
       vypisZnamenko(-9);
       vypisZnamenko("ahoj");
    }
}