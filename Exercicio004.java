package com.Nicolas.aulaJava;

public class Exercicio004 {
    public static void main(String[] args){
        int var01 = 2147483647;
        int var02 = 1;
        
        System.out.println(var01 + var02);
        
        double d1 = 123.4;
        double d2 = 1.234e2;//notação cientifica
        float f1 = 123.4f;
        
        //Literais
        
        int decVal = 26;//decimal
        int hexVal = 0x1a;//hexadecimal
        int octVal = 032;//octal
        int cotVal = 0b11010;//binario
        
        long creditCardNumber = 1234_5678_9012_3456L;
        long cpf = 101_134_156_68L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        
        
        int Oct31 = 031;
        int Dec25 = 25;
        System.out.println(Oct31 == Dec25);
        
        //Hello, World!
        System.out.print("\"Hello, World!\"\n\r");
        System.out.println("1\\4");
    }
}
