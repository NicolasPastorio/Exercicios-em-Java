/*
Peça para o usuário informar 'F'(feminino) ou 'M'(masculino);
caso seja informado qualquer outra letra, mostr na tela 'sexo inválido'
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe (F ou M): ");
        
    /*  String sexo = ler.next();
        
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("F - feminino!");
        }else if(sexo.equalsIgnoreCase("m")){
            System.out.println("M - masculino!");
        }else{
            System.out.println("Sexo inválido!");
        }
    */
        //lendo uma variável do tipo char do teclado
        char sexo = ler.next().charAt(0);
        
        switch (sexo){
            case 'f':
                System.out.println("F - feminino!");
                break;
            case 'F':
                System.out.println("F - feminino!");
                break;
            case 'm':
                System.out.println("M - masculino!");
                break;
            case 'M':
                System.out.println("M - masculino!");
                break;
            default:
                System.out.println("Sexo inválido!");
        }
    }
}
