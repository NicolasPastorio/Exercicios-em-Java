/*
Ler duas notas de um aluno, calcular a média de cada aluno e apresentar:
aprovado, se a média for >= 7, reprovado se a média for menor do que 7 e,
aprovado com distinção, se a média for igual a 10.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.print("Informe a nota da primeira prova do aluno: ");
        nota1 = ler.nextDouble();
        System.out.print("Informe a nota da segunda prova do aluno: ");
        nota2 = ler.nextDouble();
        media = (nota1+nota2)/2;
        
        System.out.println("A média do aluno foi "+media+" pontos!");
        if(media == 10){
            System.out.println("--------------------");
            System.out.println("Aprovado com Distinção!");
            System.out.println("--------------------");
        }else if(media >= 7){
            System.out.println("--------------------");
            System.out.println("Aprovado!");
            System.out.println("--------------------");
        }else if(media < 7){
            System.out.println("--------------------");
            System.out.println("Reprovado!");
            System.out.println("--------------------");
        }else{
            System.out.println("--------------------");
            System.out.println("[Erro] Os valores informados são\ninválidos!");
            System.out.println("--------------------");
            
        }
            
    }
}
