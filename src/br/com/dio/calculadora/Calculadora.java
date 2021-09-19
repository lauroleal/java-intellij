package br.com.dio.calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar (a,b);
        int multi = multi (a,b);
        int divi = divi (a,b);
        int  sub =  sub (a,b);

        System.out.println("Soma: " + somar);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divi: " + divi);
        System.out.println("sub: " + sub);


    }
    public static int somar( int a, int b){
        return  a + b;
    }
    public static int multi( int a, int b){
        return  a * b;
    }
    public static int divi( int a, int b){
        return  a / b;
    }
    public static int sub( int a, int b){
        return  a - b;
    }
}
