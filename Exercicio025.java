/*
Ler dois números e perguntar ao usuário qual operação ele deseja realizar.
Mostrar o resultado da operação, se o número é par ou ímpar e se é positivo
ou negativo.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio025 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int num1, num2, resultado = 0;
        char opc;
        
        do{
            System.out.print("Informe um valor inteiro qualquer: ");
            num1 = ler.nextInt();
            System.out.print("Informe outro valor inteiro qualquer: ");
            num2 = ler.nextInt();
        
            if(num2 == 0){
                System.out.println("O segundo valor não pode ser zero!");
                System.out.println("Favor informar outro valor...\n");
            }
        }while(num2 == 0);
        
        System.out.println("Informe a operação que desejas realizar... ");
        System.out.printf("+ - x /\n:");
        opc = ler.next().charAt(0);
        
        switch(opc){
            case '+': resultado = num1+num2;  break;
            case '-': resultado = num1-num2; break;
            case 'x': case 'X': resultado = num1*num2; break;
            case '/': resultado = num1/num2; break;
            default:
                System.out.println("O valor informado para a operação é inválido!");
                //loop de erro...
                for(int i = 0; i < 1; ){
                    System.out.println("[ERRO!]");
                }
        }
        if(opc == '+' || opc == '-' ||
          opc == 'x' || opc == 'X' ||
          opc == '/')
        {
            System.out.println("=================");
            System.out.println("Resultado: "+resultado);
            if(resultado != 0){
                if(resultado % 2 == 0)
                    System.out.println("O número é par!");
                else
                    System.out.println("O número é ímpar!");
                if(resultado > 0)
                    System.out.println("O número é positivo!");
                else 
                    System.out.println("O número é negativo!");
            }else
                System.out.println("O número é nulo!");
            System.out.println("=================");
        }
 
    }
}
