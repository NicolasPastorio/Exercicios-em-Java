/*
ax2 + bx + c;
-pedir os valores de A, B e C;
-se A igual à zero a equação não é do segundo grau e o 
programa não deve pedir os demais valores;
-se delta(b2 - (4.a.c)) for negativo, informe ao usuário "a equação não possui
raízes reais" e encerre o programa;
-se delata for igual à zero mostre na tela "a equação possui 
duas raízes reais" e as informe ao usuário.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio023 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("   FUNÇÃO DO SEGUNDO GRAU");
        System.out.println("----------------------------");
        System.out.println(" a2x + bx + c");
        System.out.println("----------------------------");
        
        double a, b, c, delta, raiz1, raiz2;
        
        System.out.print("Informe um valor para a: ");
        a = ler.nextDouble();
        if(a != 0){
            System.out.print("Informe um valor para b: ");
            b = ler.nextDouble();
            System.out.print("Informe um valor para c: ");
            c = ler.nextDouble();
            
            delta = (b*b) - (4.0*a*c);
            System.out.println("Valor de delata: "+delta);
            
            if(delta < 0){
                System.out.println("[ERROR!]");
                System.out.println("A equação não possui duas raízes reais!");
            }else if (delta == 0){
                System.out.println("A equação possui duas raízes reais!");
                raiz1 = ((-b) + Math.sqrt(delta))/2.0*a;
                raiz2 = ((-b) - Math.sqrt(delta))/2.0*a;
                System.out.println("São elas...");
                System.out.println("x': "+raiz1);
                System.out.println("x'': "+raiz2);
            }
        }else{//a == 0
            System.out.println("Esta não é uma função do segundo grau!");
        }
    }
}
