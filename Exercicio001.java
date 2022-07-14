/*
    -Como ler dados do teclado;
    -Ler uma linha inteira;
    -Ler tipo de dado específico;
*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio001 {
    public static void main(String args[]){
        //-Classe Scanner
        Scanner scan = new Scanner(System.in);

        //Lendo uma linha inteira do teclado
        //String nome = scan.nextLine();
        //Lendo um tipo específico do teclado
        //String primeiroNome = scan.next();
        //int idade = scan.nextInt();
        //double altura = scan.nextDouble();

        //Lendo uma linha inteira do tecla
     /* System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();//lendo uma linha inteira de strings
        System.out.println("Seu nome completo é "+nomeCompleto);
      */  
        //Lendo um tipo de dado específico do teclado
      /*System.out.println("Digite seu primeiro nome ");
        String primeiroNome = scan.next();//Lendo uma string até o espaço
        System.out.println("O seu primeiro nome é "+primeiroNome);
        System.out.println("Informe a sua idade");
        int idade = scan.nextInt();
        System.out.println("Você tem "+idade+" anos de idade! ");
        System.out.println("Informe a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é "+altura);*/
        
        //Lendo varios tipos de dados ao mesmo tempo
      System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem um animal de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: "+primeiroNome);
        System.out.println("Idade: "+idade);
        System.out.println("Quantidade de filhos: "+qtdFilhos);
        System.out.println("Altura: "+altura);
        System.out.println("Tem bichinho de estimação? "+temPet);
    } 
}
