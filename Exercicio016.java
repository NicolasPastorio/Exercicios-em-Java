/*
Faça um programa que leia três números e mostre-os 
em ordem decrescente
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = ler.nextInt();
        System.out.print("Informe o terceiro número: ");
        int num3 = ler.nextInt();
        
        if(num1 <= num2 && num1 <= num3 && num2 <= num3)
            System.out.println(num3+" - "+num2+" - "+num1);
        else if(num1 <= num2 && num1 <= num3 && num3 <= num2)
            System.out.println(num2+" - "+num3+" - "+num1);
        else if(num2 <= num1 && num2 <= num3 && num1 <= num3)
            System.out.println(num3+" - "+num1+" - "+num2);
        else if(num2 <= num1 && num2 <= num3 && num3 <= num1)
            System.out.println(num1+" - "+num3+" - "+num2);
        else if(num3 <= num1 && num3 <= num2 && num1 <= num2)
            System.out.println(num2+" - "+num1+" - "+num3);
        else if(num3 <= num1 && num3 <= num2 && num2 <= num1)
            System.out.println(num1+" - "+num2+" - "+num3);
    }
}
