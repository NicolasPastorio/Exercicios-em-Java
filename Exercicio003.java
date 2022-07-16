//dias da semana
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o dia da semana: (1-7)");
        int diaSemana = ler.nextInt();
        
        //Dias da semana com if
    /*  if(diaSemana == 1)
            System.out.println("Domingo!");
        else if(diaSemana == 2)
            System.out.println("Segunda-feira!");
        else if(diaSemana == 3)
            System.out.println("Terça-feira!");
        else if(diaSemana == 4)
            System.out.println("Quarta-feira!");
        else if(diaSemana == 5)
            System.out.println("Quinta-feira!");
        else if(diaSemana == 6)
            System.out.println("Sexta-feira!");
        else if(diaSemana == 7)
            System.out.println("Sábado!"); 
        else
            System.out.println("Não é um valor válido para o dia da semana!"); 
        */
        
        //Dias da semana com switch
        switch (diaSemana) {
            case 1: System.out.println("Domingo!"); break;
            case 2: System.out.println("Segunda-feira!"); break;
            case 3: System.out.println("Terça-feira!"); break;
            case 4: System.out.println("Quarta-feira!"); break;
            case 5: System.out.println("Quinta-feira!"); break;
            case 6: System.out.println("Sexta-feira!"); break;
            case 7: System.out.println("Sábado!"); break;
            default: System.out.println("Não é um valor válido para um dia da semana!");
        }
        switch (diaSemana) { 
            case 2:case 3:case 4:case 5:case 6: System.out.println("Dia útil!"); break;
            case 1: case 7: System.out.println("Fim de semana!"); break;
            default: System.out.println("Não é um valor válido para um dia da semana!");
        }
        
    }
}
