/*
Pedir um valor correspondente ao ano e informar se é
ou não ano bissexto.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int ano;
        boolean bissexto;
        
        System.out.print("Informe o ano: ");
        ano = ler.nextInt();
        
        if(ano % 400 == 0)
            System.out.println("O ano é bissexto!");
        else{
            if((ano % 4 == 0) && (ano % 100 != 0))
                System.out.println("O ano é bissexto!");
            else
                System.out.println("O ano não é bissexto!");
        }
    }
}
