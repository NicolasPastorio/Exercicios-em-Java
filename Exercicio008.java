/*Pedir dois números e imprimir o maior deles*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Informe um número: ");
        num1 = ler.nextInt();
        System.out.print("Informe outro número: ");
        num2 = ler.nextInt();
        
        if(num1>num2)
            System.out.println(num1+" é maior que "+num2);
        else if(num2>num1)
            System.out.println(num2+" é maior que "+num1);
        else 
            System.out.println("O valor "+num1+" e "+num2+" são iguais!");
    }
}
