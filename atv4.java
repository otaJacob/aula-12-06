package Atividade1206;

import java.util.Scanner;

public class atv4 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
 
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + ": " + nome);
        }

        scanner.close();
    }
}

