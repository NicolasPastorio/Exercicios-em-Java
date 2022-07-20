package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        //Peça o raio de um círculo, calcule 
        //e mostre a sua área
    /*  System.out.println("----Área do círculo----");
        System.out.print("Informe o raoi do círculo: ");
        double raio = ler.nextDouble();
        double area = raio*raio*13.1415;
        //double area = Math.PI * Math.pow(raio,2);
        System.out.println("A área do círculo é: "+area);
        System.out.println("----------fim----------");
    */   
        //Calcular a área do quadrado e em seguida mostrar 
        //o dobro do resultado para o usuário
    /*  System.out.println("---Área do quadrado----");
        System.out.println("Informe o lado do quadrado: ");
        double ladoQuadrado = ler.nextDouble();
        double areaQuadrado = ladoQuadrado*2;
        double DobroArea = areaQuadrado*2;
        System.out.println("O dobro da área do quadrado é: "+DobroArea);
        System.out.println("----------fim----------");
    */
        //Perguntar quanto o usuário ganha por hora e o número de 
        //horas trabalhadas no mês, calcular e mostrar na tela o
        //salário do referido mês[
    /*  System.out.println("-----Salário do mês----");
        System.out.print("Informe o valor que voçê recebe por horas trabalhadas: ");
        double salarioHora = ler.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasMes = ler.nextDouble();
        double salarioMes = salarioHora*horasMes;
        System.out.println("O seu salário deste mes é de R$"+salarioMes+"! ");
        System.out.println("----------fim----------");
    */
    
        //Pedir a temperatura em Farenheit e mostrar em Celcius
        // C = (5*(F-32)/9).
    /*  System.out.println("-----Temperatura-----");
        System.out.println("---Farenheit para Celcius---");
        System.out.print("Informe a temperatura atual em Farenheit: ");
        double temperaturaF = ler.nextDouble();
        double temperaturaC = (5*(temperaturaF-32)/9);
        System.out.println("São "+temperaturaC+" graus Celcius!");
        System.out.println("----------fim----------");
    */  
        //Pedir a temperatura em Celcius e mostrar em Farenheit
        //F = C*1,8 + 32;
        System.out.println("------Temperatura------");
        System.out.print("Informe a temperatura atual em Celcius: ");
        double tempC = ler.nextDouble();
        double tempF = (tempC*1.8)+32;
        System.out.println("São "+tempF+" graus Farenheit!");
        System.out.println("----------fim----------");
    }
}
