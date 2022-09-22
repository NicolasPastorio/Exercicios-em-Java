/*
Pedir 3 lados de um triângulo, informar se os valores podem ser um
triângulo e, caso for um triângulo, informar se é equilátero, isóseles 
ou escaleno.
-3 lados formam um trinângulo quando a soma dos dois lados for maior
do que o terceiro lado;
-triângulo equilátero: 3 lados iguais;
-triângulo isósceles: 2 lados iguais;
-triângulo escaleno: 3 lados diferentes.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio022 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        double lado1, lado2, lado3;
        int condicao = 0;
        
        System.out.print("Informe o primeiro lado do triângulo: ");
        lado1 = ler.nextDouble();
        System.out.print("Informe o segundo lado do triângulo: ");
        lado2 = ler.nextDouble();
        System.out.print("Informe o terceiro lado do triângulo: ");
        lado3 = ler.nextDouble();
        
        //é um triângulo?
        if(lado1 + lado2 > lado3 && 
          lado1 + lado3 > lado2 && lado2 + lado3 > lado1){//sim
          condicao++;
            System.out.println("Os valores "+lado1+", "+lado2+" e ");
            System.out.println(""+lado3+" podem formar um triângulo!");
            //equilátero, isósceles ou escaleno?
            //equilátero
            if(lado1 == lado2 && lado2 == lado3)
                System.out.println("O triângulo é equilátero!");
            //isósceles
            else if(lado1==lado2 || lado1==lado3 || lado2==lado3)
                System.out.println("O triângulo é isósceles!");
            //escaleno
            else if(lado1 != lado2 && lado2 != lado3)
                System.out.println("O triângulo é escaleno!");
        }else{
            System.out.println("Os valores "+lado1+", "+lado2+" e ");
            System.out.println(""+lado3+" não podem formar um triângulo!");
        }
    }
}
