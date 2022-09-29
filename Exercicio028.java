/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
As perguntas são: 
a. Telefonou para a vítima?
b. Esteve no local do crime?
c. Mora perto da vítima?
d. Devia para a vítima?
e. Já trabalho com a vitima? 
-Emitir, no final, uma classificação sober a participação da pessoa no
crime.
-2 questões positivas: "Suspeita";
-3 ou 4 questões positivas: "Cúmplice";
-5 questões positivas: "Assassino";
-caso contrário: inocente.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio28 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        char resposta;
        int contador = 0;
        
        //perguntas
        System.out.println("Telefonou para a vítima?(s/n)");
        resposta = ler.next().charAt(0);
        if(resposta == 's' || resposta == 'S')
            contador++;
        System.out.println("Esteve no local do crime?(s/n)");
        resposta = ler.next().charAt(0);
        if(resposta == 's' || resposta == 'S')
            contador++;
        System.out.println("Mora perto da vítima?(s/n)");
        resposta = ler.next().charAt(0);
        if(resposta == 's' || resposta == 'S')
            contador++;
        System.out.println("Devia para a vítima?(s/n)");
        resposta = ler.next().charAt(0);
        if(resposta == 's' || resposta == 'S')
            contador++;
        System.out.println("Já trabalhou com a vítima?(s/n)");
        resposta = ler.next().charAt(0);
        if(resposta == 's' || resposta == 'S')
            contador++;
        
        //veredito
        System.out.println("Veredito...");
        if(contador == 2)
            System.out.println("Suspeito!");
        else if(contador == 3 || contador == 4)
            System.out.println("Cúmplice!");
        else if(contador == 5)
            System.out.println("Assassino!");
        else
            System.out.println("Inocente!");
    }
}
