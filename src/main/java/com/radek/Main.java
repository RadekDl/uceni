package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       int pole1[] = {2, 6, 23, 12, 8};
       for (int i = 0; i < pole1.length; i++){
           System.out.println(pole1[i]);
       }
        System.out.println();
       for (int cislo : pole1){
           System.out.println(cislo);
       }

    }
}





