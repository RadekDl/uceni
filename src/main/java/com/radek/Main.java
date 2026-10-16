package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int cisloA = 7;
        int cisloB = -2;
        int cisloC = 0;

        if (cisloA > 0) {
            System.out.println("čísloA " + cisloA + " je kladné ");
        } else if (cisloA < 0) {
            System.out.println("čísloA " + cisloA + " je záporné ");
        } else {
            System.out.println("čísloA " + cisloA + " je 0 ");
        }

        if (cisloB > 0) {
            System.out.println("čísloB " + cisloB + " je kladné ");
        } else if (cisloB < 0) {
            System.out.println("čísloB " + cisloB + " je záporné ");
        } else {
            System.out.println("čísloB " + cisloB + " je 0 ");
        }

        if (cisloC > 0) {
            System.out.println("čísloC " + cisloC + " je kladné ");
        } else if (cisloC < 0) {
            System.out.println("čísloC " + cisloC + " je záporné ");
        } else {
            System.out.println("čísloC " + cisloC + " je 0 ");
        }


    }
}