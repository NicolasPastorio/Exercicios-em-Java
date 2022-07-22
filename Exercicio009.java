/*
Peça um valor e mostre se ele é positivo ou negativo 
*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro qualquer: ");
        int numero = ler.nextInt();
        if(numero > 0)
            System.out.println("O número "+numero+" é positivo!");
        else if(numero < 0)
            System.out.println("O número "+numero+" é negativo!");
        else
            System.out.println("O número "+numero+" é nulo!");
    }
}
