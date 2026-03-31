package poo.exercicios;

import java.util.Scanner;

public class DescontoCompra {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Qual o valor da compra? ");
            double valorCompra = teclado.nextDouble();

            if (valorCompra > 100) {
                valorCompra = valorCompra * 0.90;
            }

            System.out.println("O valor total fica " + valorCompra);
        }
    }
}
