/*
Calcule a folha e pagamento...
descontando 3% para o Sindicato, 11% para o FGTS sendo depositado
pela empresa. 
Peça ao usuário o valor de sua hora trabalhada  e a quantidade de 
horas trabalhadas no mês.
Descontos do IR(imposto de renda) sobre o salário bruto:
-salário <= 900 - isento
-salário <= 1500 - 5%
-salário <= 2500 - 10%
-salário  > 2500 20%.

 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        double valorHora, quantHora;//ok
        double salBruto, salLiquido;//ok
        double fgts,sindicato, inss, ir = 0;//ok
        double percentualIR = 0, totalDescontos;//ok
        
        System.out.println("-------------------------------------------------");
        System.out.print("Informe o valor da hora trabalhada:\nR$");
        valorHora = ler.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mes:");
        quantHora = ler.nextDouble();
        salBruto = valorHora*quantHora;
        System.out.println("-------------------------------------------------");
        
        fgts = (11.0*salBruto)/100.0;
        sindicato = (3.0*salBruto)/100.0;
        inss = (10.0*salBruto)/100.0;
        //imposto de renda com relação ao salário bruto
        if(salBruto <= 900.0){
            ir = 0.0;
            percentualIR = 0.0;
        }
        else if(salBruto <= 1500.0){
            ir = (5.0*salBruto)/100.0;
            percentualIR = 5.0;
        }
        else if(salBruto <= 2500.0){
            ir = (10.0*salBruto)/100.0;
            percentualIR = 10.0;
        }
        else if(salBruto > 2500.0){
            ir = (20*salBruto)/100.0;
            percentualIR = 20.0;
        }
        totalDescontos = salBruto - sindicato - ir - inss; 
        salLiquido = totalDescontos;
        
    /*  System.out.println("-------------------------------------------------");
        System.out.println("Salário Bruto: R$"+salBruto);
        System.out.println("Desconto de 3% do sindicato: R$"+sindicato);
        if(percentualIR <= 0){
            System.out.println("Isento de imposto de renda!");
        }else{
            System.out.print("Desconto de "+percentualIR+"% de "); 
            System.out.println("IR(imposto de renda): R$"+ir);
        }
        System.out.println("Saldo positivo de 11% de FGTS: R$ "+fgts);
        System.out.println("Salário líquido: R$"+salLiquido);
        System.out.println("-------------------------------------------------");
    */
        System.out.println("Salário Bruto ("+valorHora+" * "+quantHora+"): R$"+salBruto);
        System.out.println("(-) IR ("+percentualIR+"%): R$"+ir);
        System.out.println("(-) INSS (10%): R$"+inss);
        System.out.println("FGTS (11%): R$"+fgts);
        System.out.println("Totald de descontos: R$"+totalDescontos);
        System.out.println("Salário líquido: R$"+salLiquido);
    }
}
