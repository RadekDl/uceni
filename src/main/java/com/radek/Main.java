package com.radek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       VstupProVypocet[] vstupy = new VstupProVypocet[8];

       vstupy[0] = new VstupProVypocet(2,3,'*');
       vstupy[1] = new VstupProVypocet(67,8,'+');
       vstupy[2] = new VstupProVypocet(9,0,'/');
       vstupy[3] = new VstupProVypocet(34,36,'-');
       vstupy[4] = new VstupProVypocet(8,4,'x');
       vstupy[5] = new VstupProVypocet(10,4,'/');
       vstupy[6] = new VstupProVypocet(0,5,'/');
       vstupy[7] = new VstupProVypocet(5,0,'/');

       Vypocet vypocet = new Vypocet();

       for (int i = 0; i < vstupy.length; i++) {
          try {
             double vysledek = vypocet.vypocitej(vstupy[i]);
             System.out.println("výsledek příkladu: " + (i + 1) + " je: " + vysledek);
          }
             catch(ArithmeticException | IllegalArgumentException e){
                System.out.println(e.getMessage()+ ", příklad "+ (i + 1));



          }
       }
       System.out.println(vstupy[0]);
    }
}







