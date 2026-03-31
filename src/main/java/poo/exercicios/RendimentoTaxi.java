package poo.exercicios;

import java.util.Scanner;

public class RendimentoTaxi {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            final double PRECO_COMBUSTIVEL = 4.90;

            double odometroInicio;
            double odometroFinal;
            double litrosGastos;
            double valorRecebido;

            System.out.print("Digite o odômetro no início do dia: ");
            odometroInicio = entrada.nextDouble();

            System.out.print("Digite o odômetro no final do dia: ");
            odometroFinal = entrada.nextDouble();

            if (odometroFinal < odometroInicio) {
                System.out.println("Erro: odômetro final não pode ser menor que o inicial.");
                return;
            }

            System.out.print("Digite os litros gastos: ");
            litrosGastos = entrada.nextDouble();

            if (litrosGastos <= 0) {
                System.out.println("Erro: litros gastos deve ser maior que zero.");
                return;
            }

            System.out.print("Digite o valor recebido: ");
            valorRecebido = entrada.nextDouble();

            double kmRodados = odometroFinal - odometroInicio;
            double mediaConsumo = kmRodados / litrosGastos;
            double gastoCombustivel = litrosGastos * PRECO_COMBUSTIVEL;
            double lucroLiquido = valorRecebido - gastoCombustivel;

            System.out.printf("%nMédia (Km/l): %.2f%n", mediaConsumo);
            System.out.printf("Lucro líquido: R$ %.2f%n", lucroLiquido);
        }
    }
}
