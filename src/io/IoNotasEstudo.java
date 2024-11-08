package io;

import java.util.Scanner;

/*
 * Entrada e saida (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário
 * Saída de dados: Escrever dados para o usuário
 */

public class IoNotasEstudo {
    public static void main(String[] args) {

        //leitura de dados de entrada
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valorDigitado = sc.nextInt();
        System.out.println(valorDigitado);

        //Saída de dados

        float qualquerNumero = 3.0f;
        System.out.printf("O número digitado foi %", qualquerNumero);

        sc.close();
    }
}
