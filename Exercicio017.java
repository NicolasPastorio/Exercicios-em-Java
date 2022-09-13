/*
Perguntar o turno em que o usoário estuda: M-matutino,
V-vespertino ou N-noturno. Imprima: "Bom dia!", "Boa tarde!",
"Boa noite!" ou "Valor inválido".
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio017 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        char turno;
        
        System.out.println("Informe o turno em que você estuda...");
        System.out.println("-------------------------------------");
        System.out.println("M-matutino, V-vespertino ou N-noturno");
        turno = ler.next().charAt(0);
        System.out.println("-------------------------------------");
        
        if(turno == 'm' || turno == 'M'){
            System.out.println("Bom dia!");
            System.out.println("--------");
        }else if(turno == 'v' || turno == 'V'){
            System.out.println("Boa tarde!");
            System.out.println("----------");
        }else if(turno == 'n' || turno == 'N'){
            System.out.println("Boa noite!");
            System.out.println("----------");
        }else {
            System.out.println("[ERROR!] Valor inválido!");
            System.out.println("------------------------");
        }
        
    } 
}
