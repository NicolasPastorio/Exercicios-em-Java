/*
Peça duas notas para um aluno e calcule a sua média.
Média de aproveitamento   Conceito
entre 9.0 e 10.0          A
entre 7.5 e 9.0           B
entre 6.0 e 7.5           C
entre 4.0 e 6.0           D
entre 4.0 e 0             E
Mostrar ne tela as notas, o conceito e, "APROVADO"
(A, B ou C) e "REPROVADO" (D ou E).
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio021 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = ler.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = ler.nextDouble();
        double media = (nota1+nota2)/ 2.0;
        
        char conceito = 'a';
        
        
        if(media > 9.0 && media <= 10.0)
            conceito = 'A';
        else if(media > 7.5 && media <= 9.0)
            conceito = 'B';
        else if(media > 6.0 && media <= 7.5)
            conceito = 'C';
        else if(media > 4.0 && media <= 6.0)
            conceito = 'D';
        else if(media > 0.0 && media <= 4.0)
            conceito = 'E';
        
        System.out.println("-----------------------------------------------");
        System.out.println("Primeira nota: "+nota1+" e Segunda nota: "+nota2);
        System.out.println("Média: "+media);
        System.out.println("Conceito: "+conceito);
        if(conceito == 'A' || conceito == 'B' || conceito == 'C')
            System.out.println("APROVADO!");
        else if(conceito == 'D' || conceito == 'E');
        System.out.println("-----------------------------------------------");
    }
}
