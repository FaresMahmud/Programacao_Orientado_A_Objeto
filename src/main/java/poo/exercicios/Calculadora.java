package poo.exercicios;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double numero1;
            System.out.print("Digite um número: ");
            numero1 = teclado.nextDouble();

            double numero2;
            System.out.print("Digite o segundo número: ");
            numero2 = teclado.nextDouble();

            System.out.println("Qual operação deseja fazer:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O resultado da soma é " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("O resultado da multiplicação é " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("O resultado da divisão é " + (numero1 / numero2));
                    } else {
                        System.out.println("Não é possível dividir por 0");
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        }
    }
}
