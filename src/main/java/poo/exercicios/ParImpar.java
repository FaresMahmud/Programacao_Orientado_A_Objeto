package poo.exercicios;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é ímpar");
            }
        }
    }
}
