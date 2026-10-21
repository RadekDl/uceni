package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int max = 22;
        int a = 2;
        int krok = 1;

//
        while (a <= max) {

            if (a % 2 == 0) {
                System.out.print(a + ", ");


            }
            a = a + krok;
        }
    }
}





