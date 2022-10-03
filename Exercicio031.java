/*
 Hipermercado Tabajara
 */
package com.Nicolas.aulaJava;

import java.util.Scanner;


public class Exercicio31 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        double precoKg = 0, precoTotal = 0;
        int percentualDesconto = 0;
        
        System.out.print("               Até 5kg");
        System.out.println("              Acima de 5kg");
        System.out.println("Filé Duplo    R$ 4,90 por kg      R$ 5,80 por kg");
        System.out.println("Alcatra      R$ 5,90 por kg      R$ 6,80 por kg");
        System.out.println("Picanha       R$ 6,90 por kg      R$ 7,80 por kg");
        
        System.out.println("Escolha o tipo de carne:");
        System.out.print("-> ");
        String tipoCarne = ler.nextLine();
        System.out.println("Informe a quantidade(kg):");
        System.out.print("-> ");
        double quantidade = ler.nextDouble();
        System.out.println("Informe o tipo de pagamento: ");
        System.out.println("1)Dinheiro\n2)Cartão Tabajara");
        System.out.print("-> ");
        int tipoPagamento = ler.nextInt();
        
        //Filé Duplo
        if(tipoCarne.equalsIgnoreCase("file duplo") && quantidade <= 5.0)
            precoKg = 4.9;
        else if(tipoCarne.equalsIgnoreCase("file duplo") && quantidade > 5.0)
            precoKg = 5.8;
        //Alcatara
        if(tipoCarne.equalsIgnoreCase("alcatra") && quantidade <= 5.0)
            precoKg = 5.9;
        else if(tipoCarne.equalsIgnoreCase("alcatra") && quantidade > 5.0)
            precoKg = 6.8;
        //Picanha
        if(tipoCarne.equalsIgnoreCase("picanha") && quantidade <= 5.0)
            precoKg = 6.9;
        else if(tipoCarne.equalsIgnoreCase("picanha") && quantidade > 5.0)
            precoKg = 7.8;
        //Tipo de pagamento
        if(tipoPagamento == 2)
            percentualDesconto = 5;
        
        precoTotal = precoKg*quantidade;
        double valorDesconto  = (precoTotal/100)*percentualDesconto;
        double valorPagar = precoTotal - valorDesconto;
        
        //Resultado
        System.out.println("================================");
        System.out.println("Tipo de carne: "+tipoCarne);
        System.out.println("Quantidade: "+quantidade+"kg");
        System.out.println("Preço total: R$"+precoTotal);
        if(tipoPagamento == 1)
            System.out.println("Tipo de pagamento: Dinheiro");
        else
            System.out.println("Tipo de pagamento: Cartão Tabajara");
        System.out.println("Percentual de desconto "+percentualDesconto+"%");
        System.out.println("Valor do desconto: R$"+valorDesconto);
        System.out.println("Valor a pagar: R$"+valorPagar);
        System.out.println("================================");
    }
}
