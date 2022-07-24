/*
Faça um programa que verifique se uma letra digitada 
é uma vogal ou uma consoante.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        //char letra;
        System.out.print("Informe uma letra qualquer: ");
        //letra = ler.next().charAt(0);
        String letra = ler.next();
        
    /*    if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
            || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
            || letra.equalsIgnoreCase("u")){
            System.out.println("A letra "+letra+" é uma vogal!");
        }else{
            System.out.println("A letra "+letra+" é uma consoante!");
        }*/
    
        if(letra.length() > 1){
            System.out.println("A letra informada não é válida!");
        }else{
            switch(letra){
            case "a": case "e": case "i": case "o": case "u":
            case "A": case "E": case "I": case "O": case "U":
                System.out.println("A letra ["+letra+"] é uma vogal!");
                break;
            default:
                System.out.println("A letra ["+letra+"] é uma consoante!");
            }
        }
    
        
    }
}
