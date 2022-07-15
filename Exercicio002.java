package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
      
    /*  System.out.println("Entre com sua idade: ");;
        int idade = ler.nextInt();
      
        if(idade >= 18){
            System.out.println("É maior de idade!");
        }else{
            System.out.println("Não é maior de idade!");
        } */
      //valor <= 10 "barato"
      //10 < valor < 15 "pedir desconto"
      //15 <= valor < 17 "pesquisar mais"
      //valor >= 17 "muito caro"
      
        System.out.print("Informe um valor para o produto: R$");
        double valor = ler.nextDouble();
      
        if(valor <= 10)
            System.out.println("O produto está barato!");
        else if(valor > 10 && valor < 15)
            System.out.println("Peça um desconto!");
        else if(valor >= 15 && valor < 17)
            System.out.println("Pesquise mais!");
        else // if(valor >= 17)
            System.out.println("Muito caro!");
        
    }
}
