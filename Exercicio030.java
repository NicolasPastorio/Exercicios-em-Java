/*
Fruteira...
*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        //variáveis
        char opc;
        double quanTotal = 0;
        double quantMorango = 0, quantMaca = 0;
        double totalPagar = 0;
        
        System.out.print("              Até 5kg");
        System.out.println("           Acima de 5kg");
        System.out.println("Morango    R$ 2,50 por kg      R$ 2,20 por kg");
        System.out.println("Maçã       R$ 1,80 por kg      R$ 1,50 por kg\n");
        
        //morango
        System.out.println("Deseja comprar morango?");
        System.out.println("s- Sim ou n- Não");
        System.out.print("->");
        opc = ler.next().charAt(0);
        if(opc == 's' || opc == 'S'){
            System.out.println("Informe a quantidade em kg");
            System.out.print("->");
            quantMorango = ler.nextInt();
        }else quantMorango = 0.0;
        //maçã
        System.out.println("Deseja comprar maçã?");
        System.out.println("s- Sim ou n- Não");
        System.out.print("->");
        opc = ler.next().charAt(0);
        if(opc == 's' || opc == 'S'){
            System.out.println("Informe a quantidade em kg");
            System.out.print("->");
            quantMaca = ler.nextInt();
        }else quantMaca = 0.0;
        
        if(quantMorango != 0.0 || quantMaca != 0.0){
            quanTotal = quantMorango + quantMaca;
            
            if(quanTotal <= 5.0 && quanTotal > 0.0)
                totalPagar = (quantMorango*2.5) + (quantMaca*1.8);
            else if(quanTotal > 5.0)
                totalPagar = (quantMorango*2.2) + (quantMaca*1.5);
            if(quanTotal > 8.0 || totalPagar > 25.0)
                totalPagar = totalPagar - (totalPagar*0.1);
        }
        System.out.println("Total a ser pago R$"+totalPagar);
        //mensagem final
        System.out.println("=========================");
        System.out.println("           FIM");
        System.out.println("=========================");
        
    }
}
