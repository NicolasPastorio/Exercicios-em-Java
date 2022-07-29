/*
Ler tês números e mostrar o maior e o menor deles
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int num1, num2, num3, maior = 0, menor = 0;
        
        System.out.print("Informe um valor inteiro qualquer: ");
        num1 = ler.nextInt();
        System.out.print("Informe outro valor inteiro qualquer: ");
        num2 = ler.nextInt();
        System.out.print("Informe mais um valor inteiro qualquer: ");
        num3 = ler.nextInt();
        
        //cálculo
        if(num1 > num2 && num1 > num3)
            maior = num1;
        else if(num2 > num1 && num2 > num3)
            maior = num2;
        else if(num3 > num1 && num3 > num2)
            maior = num3;
        else if(num1 < num2 && num1 < num3)
            menor = num1;
        else if(num2 < num1 && num2 < num3)
            menor = num2;
        else if(num3 < num1 && num3 < num2)
            menor = num3;
        else if(num1 > num2 && num2 == num3){
            maior = num1;
            menor = num2;
        }
        else if(num1 > num3 && num2 == num3){
            maior = num1;
            menor = num2;
        }
        else if(num2 > num1 && num1 == num3){
            maior = num2;
            menor = num1;
        }
        else if(num2 > num3 && num1 == num3){
            maior = num2;
            menor = num1;
        }
        else if(num3 > num1 && num2 == num1){
            maior = num3;
            menor = num2;
        }
        else if(num3 > num2 && num2 == num1){
            maior = num3;
            menor = num2;
        }else if(num1 == num2 && num2 == num3){
            System.out.println("Todos os valores são iguais!");
        }else
            System.out.println("Ops! Algo deu errado!");
        if(maior != 0 && num1 != num2 && num2 != num3)
            System.out.println("O maior valor é "+maior+"!");
        
        
        
        if(num1 == num2 || num2 == num3 || num3 == num1){
            System.out.println("Temos dois valores iguais!\nSão eles: ");
            if(num1 == num2 && num1 == menor)
                System.out.println(num1+" e "+num2);
            else if(num1 == num3 && num1 == menor)
                System.out.println(num1+" e "+num3);
            else if(num3 == num2 && num2 == menor)
                System.out.println(num2+" e "+num3);
        }else
            System.out.println("O menor valor é "+menor+"!");
    }
}
