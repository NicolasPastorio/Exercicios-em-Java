/*

 */
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        boolean verificador = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do{
            System.out.println("Informe um nome: ");
            nome = ler.next();
            if(nome.length() >= 3)
                verificador = true;
            else{
                System.out.println("[Erro!]\nO nome informado é inválido!");
                System.out.println("--é necessário no mínimo 3 caracteres.");
                System.out.println("Informe novamente...");
            }
        }while(!verificador);
        
        verificador = false;
        do{
            System.out.println("Informe a idade: ");
            idade = ler.nextInt();
            if(idade > 0 && idade < 120)
                verificador = true;
            else{
                System.out.println("A idade informada ["+idade+"] é inválida!");
                System.out.println("Favor informar uma idade entre 0 e 120 anos...");
            }
        }while(!verificador);
        
        verificador = false;
        do{
            System.out.println("Informe o salário ");
            System.out.print("R$");
            salario = ler.nextDouble();
            if(salario > 0)
                verificador = true;
            else{
                System.out.println("[Erro!] Salário inválido!");
                System.out.println("Favor informar um salário maior que 0!");
            }
        }while(!verificador);
        
        verificador = false;
        do{
            System.out.println("Informe o seu sexo: ");
            sexo = ler.next();
            if(sexo.equalsIgnoreCase("f") ||
              sexo.equalsIgnoreCase("m"))
                verificador = true;
            else{
                System.out.println("O sexo informado é inválido!");
                System.out.println("Favor informar novamente...");
            }
        }while(!verificador);
        
        verificador = false;
        do{
            System.out.println("Informe o Estado Civil: ");
            estadoCivil = ler.next();
            if(estadoCivil.equalsIgnoreCase("s") || 
              estadoCivil.equalsIgnoreCase("c") ||
              estadoCivil.equalsIgnoreCase("v") ||
              estadoCivil.equalsIgnoreCase("d"))
                verificador = true;
            else{
                System.out.println("O Estado Civil informado é inválido!");
                System.out.print("Precisa ser s-solteiro(a), c-casado(a),"); 
                System.out.println("v-viuvo(a) ou d-divorciado(a).");
                System.out.println("Favor inserir uma informação válida...");
            }
            
        }while(!verificador);
        
        //dados
        System.out.print("\nNome: "+nome+"\nIdade: "+idade+"\nSalário: "+salario);
        System.out.print("\nSexo: "+sexo+"\nEstado Civil: "+estadoCivil+"\n");
    }
}
