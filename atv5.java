package Atividade1206;

import java.util.Scanner;

public class atv5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite as idades das 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades das 20 pessoas é: " + soma);

        scanner.close();
    }
}

