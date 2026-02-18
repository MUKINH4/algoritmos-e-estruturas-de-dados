package ExerciciosUnidade01;

import java.util.Scanner;

public class Ex02 {
    //Escreva um programa que leia um número e determine se ele é par ou ímpar. Imprima o resultado na tela
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número Par!");
        } else {
            System.out.println("Número Ímpar!");
        }

        scanner.close();
    }
}
