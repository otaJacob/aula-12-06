package Atividade1206;

import java.util.Scanner;

public class atv7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 20;
        int contadorMaioresIdade = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                contadorMaioresIdade++;
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + contadorMaioresIdade);
        scanner.close();
    }
}

