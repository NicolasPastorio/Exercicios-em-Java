/*
do while
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do{
            System.out.println("Informe a nota: ");
            double nota = ler.nextDouble();
            
            if(nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("["+nota+"] Nota válido!");
            }else{
                System.out.println("Nota inválida!");
            }
        }while(!notaValida);
    }
}
