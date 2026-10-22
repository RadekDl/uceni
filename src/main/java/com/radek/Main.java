package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int max = 22;
        int a = 1;
        int krok = 3;
        boolean jeCisloPrvni = true;

//        while (a <= max) {
//            if (jeCisloPrvni == false && a % 2 == 0){
//                System.out.print(", ");
//
//            }
//            if (a % 2 == 0) {
//                System.out.print(a);
//                jeCisloPrvni = false;
//            }
//            a = a + krok;
//        }
//        System.out.println();

        while (a <= max){
            if (a % 2 == 0){
                if (jeCisloPrvni == false){
                    System.out.print(", ");
                }
                System.out.print(a);
                jeCisloPrvni = false;

            }
            a += krok;

        }
    }
}





