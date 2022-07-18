package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String artgs[]){
        Scanner ler = new Scanner(System.in);
        
        //Alo mundo
        System.out.println("Alo mundo!");
        
        //Pedir um número e mostrá-lo na tela
        System.out.print("Informe um número: ");
        int numero = ler.nextInt();
        System.out.println("O número informado foi["+numero+"]");
        
        //Soma entre dois valores informados
        System.out.print("Informe um valor qualquer: ");
        int num1 = ler.nextInt();
        System.out.print("Informe outro valor: ");
        int num2 = ler.nextInt();
        int soma = num1+num2;
        System.out.println("A soma entre os dois valores");
        System.out.println("informados é "+soma);
        
        //Média de quatro notas bimestrais
        System.out.print("Informe a primeira nota: ");
        int nota1 = ler.nextInt();
        System.out.print("Informe a segunda nota: ");
        int nota2 = ler.nextInt();
        System.out.print("Informe a terceira nota: ");
        int nota3 = ler.nextInt();
        System.out.print("Informe a quarta nota: ");
        int nota4 = ler.nextInt();
        int media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A sua média foi de "+media+" pontos!");
        
        //Converter metros para centímetros
        System.out.print("Informe a media em metros: ");
        double metros = ler.nextInt();
        double centimetros = metros*100;
        System.out.println(metros+" metros é igual a "+centimetros+" centímetros!");
        
    }
}
