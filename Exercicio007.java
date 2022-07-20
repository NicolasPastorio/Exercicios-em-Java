/*Pedir dois números inteiros e um real.
calcule e mostre: 
b- a soma do triplo do primeiro com o terceiro
c- o terceiro elevado ao cubo*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        //Exercício 01
    /*  System.out.print("Informe um valor inteiro: ");
        int num1 = ler.nextInt();
        System.out.print("Informe outro valor inteiro: ");
        int num2 = ler.nextInt();
        System.out.print("Informe um valor real: ");
        double num3 = ler.nextDouble();
        
        int a = (2*num1) * (num2/2);
        System.out.println("O produto do dobro do primeiro com metade do segundo: "+a);
        double b = (3*num1) + num3;
        System.out.println("A soma do triplo do primeiro com o terceiro: "+b);
        double c = Math.pow(num3, 3);
        System.out.println("O terceiro elevado ao cubo: "+c);
    */
    
        //Exercício 02
        double altura, pesoIdeal;
        System.out.print("Informe a sua altura em metros: ");
        altura = ler.nextFloat();
        pesoIdeal = (72.7*altura) - 58;
        System.out.printf("O seu peso ideal é %.1fkg!\n", pesoIdeal);
    }
}
