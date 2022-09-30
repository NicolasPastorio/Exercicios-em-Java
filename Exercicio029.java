/*
Venda de combustível, tabela: 
alcool:
R$1,90 por litro
a. até 20 litros, desconto de 3% por litro;
b. acima de 20 litros, desconto de 5% por litro.
gasolina:
R$2,50
a. até 20 litros, desconto de 4% por litro;
b. acima de 20 litros, desconto de 6% por litro.
-Imprima o valor a ser pago pelo cliente...
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio29 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        //variáveis
        char escolha;
        double quantLitros, valorPagar = 0, percentualDesconto = 0;
        double desconto = 0, valorLitro = 0;
        
        System.out.println("====POSTO DE GASOLINA====");
        System.out.print("tabela de preços:\nGasolina R$ 2,50 litro");
        System.out.print("\nÁlcool R$1,90 litro\n");
        
        do{
            System.out.println("Escolha: (A- alcool ou G- gasolina)");
            System.out.print("-> ");
            escolha = ler.next().charAt(0);
        }while(escolha != 'a' && escolha != 'A' && 
                escolha != 'g' && escolha != 'G');
        
        do{
            System.out.println("Informe a quantidade de litros");
            System.out.print("-> ");
            quantLitros = ler.nextDouble();  
        }while(quantLitros <= 0 || quantLitros > 80);
        
        //cálculo do desconto
        if(escolha == 'a' || escolha == 'A'){//álcool
            valorLitro = 1.9;
            if(quantLitros <= 20)
                percentualDesconto = 3/100.0;
            else
                percentualDesconto = 5/100.0;
        }else{//gasolina
            valorLitro = 2.5;
            if(quantLitros <= 20)
                percentualDesconto = 4/100.0;
            else
                percentualDesconto = 6/100.0;
        }
        //desconto no valor do litro
        desconto = valorLitro - (valorLitro*percentualDesconto);
        valorPagar = quantLitros*desconto;
                
        System.out.println("===========================");
        if(escolha == 'a' || escolha == 'A')
            System.out.println("    Álcool");
        else
            System.out.println("    Gasolina");
        System.out.println("Total de "+quantLitros+" Litros");
        System.out.println("Desconto de "+percentualDesconto+"%!");
        System.out.println("Total a pagra: R$"+valorPagar);
        System.out.println("===========================");
        
    }
}
