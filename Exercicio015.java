/*
Pergunte o preço se três produtos e informe qual você deve comprar, 
sabendo que a decisão é sempre pelo mais barato.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio015 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        double abacate, laranja, morango;
        
        System.out.print("Informe o preço do abacate: R$");
        abacate = ler.nextDouble();
        System.out.print("Informe o preço da larana: R$");
        laranja = ler.nextDouble();
        System.out.print("Informe o preço do morango: R$");
        morango = ler.nextDouble();
        
        //abacate
        if(abacate < laranja && abacate < morango){
            System.out.println("----------------------------------------");
            System.out.println("O produto que será comprado é o abacate!");
            System.out.println("Pois o seu preço é R$"+abacate);
            System.out.println("----------------------------------------");
        }else if(abacate == laranja && abacate < morango){
            System.out.println("----------------------------------------");
            System.out.println("Os produtos que podem ser comprados são o abacate");
            System.out.println("ou a laranja!");
            System.out.println("Preço do abacate R$"+abacate+" e da laranja R$"+laranja);
            System.out.println("----------------------------------------");
        }else if(abacate == morango && abacate < laranja){
            System.out.println("----------------------------------------");
            System.out.println("Os produtos que podem ser comprados são o abacate");
            System.out.println("ou o morango!");
            System.out.println("Preço do abacate R$"+abacate+" e da laranja R$"+morango);
            System.out.println("----------------------------------------");
        }/*laranja*/
        else if(laranja < abacate && laranja < morango){
            System.out.println("----------------------------------------");
            System.out.println("O produto que será comprado é a laranja!");
            System.out.println("Pois o seu preço é R$"+laranja);
            System.out.println("----------------------------------------");
        }else if(laranja == morango && abacate < laranja){
            System.out.println("----------------------------------------");
            System.out.println("Os produtos que podem ser comprados são o morango");
            System.out.println("ou a laranja!");
            System.out.println("Preço do abacate R$"+morango+" e da laranja R$"+laranja);
            System.out.println("----------------------------------------");
        }/*morango*/
        else if(morango < abacate && morango < laranja){
            System.out.println("----------------------------------------");
            System.out.println("O produto que será comprado é o morango!");
            System.out.println("Pois o seu preço é R$"+morango);
            System.out.println("----------------------------------------");
        }
    }
}
