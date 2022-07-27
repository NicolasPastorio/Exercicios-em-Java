/*
Ler três números e mostrar o maior deles.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int num1, num2, num3, maior = 0;
        System.out.print("Informe um valor inteiro qualquer: ");
        num1 = ler.nextInt();
        System.out.print("Informe outro valor inteiro qualquer: ");
        num2 = ler.nextInt();
        System.out.print("Informe mais um valor inteiro qualquer: ");
        num3 = ler.nextInt();
        //cálculo
        if(num1 > num2 && num1 > num3)
            maior = num1;
        else if(num2 > num1 && num2 > num3)
            maior = num2;
        else if(num3 > num1 && num3 > num2)
            maior = num3;
        else
            System.out.println("Ops! Algo deu errado!");
        if(maior != 0)
            System.out.println("O maior valor é "+maior+"!");
    }
}
