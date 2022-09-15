/*
Pedir o salário de um colaborador e fazer o reajuste com os critérios:
-salários até R$280,00(incluido): aumento de 20%
-salários entre R$280,00 e R$700,00: aumento de 15%
-salários entre R$700,00 e R$1500,00: aumento de 10%
-salários de R$1500,00 em diante: aumento de 5%.
Após o aumento ser realizado, mostre na tela: 
-O salário antes do reajuste
-O percentual de aumento aplicado
-O valor de aumento
-O novo salário após o aumento.
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio018 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //variáveis
        double salarioInicial;
        double percentualDeAumento = 0;
        double valorDeAumento;
        double novoSalario;
        
        System.out.println("Informe o salário atual do colaborador: ");
        System.out.print("R$");
        salarioInicial = ler.nextDouble();
        
        if(salarioInicial > 0 && salarioInicial <= 280.0)
            percentualDeAumento = 20.0;
        else if(salarioInicial > 280.0 && salarioInicial <= 700.0)
            percentualDeAumento = 15.0;
        else if(salarioInicial > 700.0 && salarioInicial <= 1500.0)
            percentualDeAumento = 10.0;
        else if(salarioInicial > 1500.0)
            percentualDeAumento = 5.0;
        //else{}
        valorDeAumento = percentualDeAumento *salarioInicial/100;
        novoSalario = valorDeAumento+salarioInicial;
        
        System.out.println("---------------------------");
        System.out.println("Salário anterior: R$"+salarioInicial);
        System.out.println("Percentual de aumento: "+percentualDeAumento+"%!");
        System.out.println("Valor de aumento: R$"+valorDeAumento);
        System.out.println("Novo salário: R$"+novoSalario);
        System.out.println("---------------------------");
    }
}
