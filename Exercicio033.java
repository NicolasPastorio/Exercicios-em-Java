/*
Ler nome de uruário e senha e não aceitar se a senha for igual
ao nome de usuário, mostrando uma mensagem de erro e voltando a 
pedir as informações.
*/
package com.Nicolas.aulaJava;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        boolean infoValida = false;
        int contador = 0;
        String usuario, senha;
        
        do{
            if(contador == 0){
                System.out.println("Informe um nome de usuário: ");
                usuario = ler.next();
                System.out.println("Informe uma senha: ");
                senha = ler.next();
            }else{
                System.out.println("Informe novamente...");
                System.out.println("nome de usuário: ");
                usuario = ler.next();
                System.out.println("senha: ");
                senha = ler.next();
            }
            if(usuario.equalsIgnoreCase(senha)){
                infoValida = false;
                System.out.println("[Erro]\nSenha igual a usuário!");
                contador++;
            }else{
                infoValida = true;
                System.out.println("Senha e usuário dentro dos padrões!");
            }
        }while(!infoValida);
    }
}
