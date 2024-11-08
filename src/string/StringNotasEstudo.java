package string;

import java.util.Scanner;

public class StringNotasEstudo {
    public static void main(String[] args) {
        String texto = "Um texto para ser impresso";
        System.out.println(texto);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome);

        sc.close();
    }
}
