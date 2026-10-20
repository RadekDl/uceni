package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int max = 20;
        int a = 1;
        int coeficient =1;

        for (int i = 1; i <= max; i++) {
            if ( i < max) {
                System.out.print(i + ", ");

            } else {
                System.out.println(i);
            }
        }

        while (a <= max) {
            if (a == max) {
                System.out.print(a);

            } else  {
                System.out.print(a + ", ");
            }
            a++;
        }

    }

}

