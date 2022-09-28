/*
Ler dois números e perguntar ao usuário qual operação ele deseja realizar.
Mostrar o resultado da operação, se o número é par ou ímpar e se é positivo
ou negativo.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int num1 = ler.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = ler.nextInt();
        System.out.println("Informe a operação (+ - / *):");
        String operacao = ler.next();
        
        double resultado = 0;
        boolean valida = true;
        
        switch(operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: 
                System.out.println("Operação inválida!");
                valida = false; 
        }
        if(valida){
            //resultado
            System.out.println("Resultado: "+resultado);
            //positivo ou negativo?
            if(resultado >= 0)
                System.out.println("Resultado positivo!");
            else
                System.out.println("Resultado negativo!");
            //par ou ímpar?
            if(resultado % 2 == 0)
                System.out.println("Resultado par!");
            else
                System.out.println("Resultado ímpar!");
        }
    }
}
