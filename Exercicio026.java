/*
Pedir um número inteiro e informar se ele é par o ímpar.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio026 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro qualquer: ");
        int numero = ler.nextInt();
        
        if(numero % 2 == 0)
            System.out.println("O número "+numero+" é par!");
        else
            System.out.println("O número é "+numero+" ímpar!");
    }
}
