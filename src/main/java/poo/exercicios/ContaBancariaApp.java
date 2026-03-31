package poo.exercicios;

import java.util.Scanner;

public class ContaBancariaApp {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            ContaBancaria conta = new ContaBancaria("0001-1", "Fares");

            System.out.print("Valor para depósito: ");
            double deposito = teclado.nextDouble();
            conta.depositar(deposito);

            System.out.print("Valor para saque: ");
            double saque = teclado.nextDouble();
            conta.sacar(saque);

            System.out.println("Saldo final: R$ " + String.format("%.2f", conta.getSaldo()));
        }
    }

    static class ContaBancaria {
        private final String numero;
        private final String titular;
        private double saldo;

        public ContaBancaria(String numero, String titular) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = 0.0;
        }

        public String getNumero() {
            return numero;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            if (valor <= 0) {
                System.out.println("Depósito inválido.");
                return;
            }
            saldo += valor;
        }

        public void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Saque inválido.");
                return;
            }
            if (valor > saldo) {
                System.out.println("Saldo insuficiente.");
                return;
            }
            saldo -= valor;
        }
    }
}
