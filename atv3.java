package Atividade1206;

import java.util.Scanner;

public class atv3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        double[] numeros = new double[10];
 
        System.out.println("Digite 10 números:");
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
         
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
 
        System.out.println("A soma dos números é: " + soma);
 
        scanner.close();
    }
}

