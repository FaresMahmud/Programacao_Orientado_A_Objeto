package poo.exercicios;

import java.util.Scanner;

public class TrianguloApp {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Triangulo triangulo = new Triangulo();

            System.out.print("Lado A: ");
            triangulo.setLadoA(teclado.nextDouble());

            System.out.print("Lado B: ");
            triangulo.setLadoB(teclado.nextDouble());

            System.out.print("Lado C: ");
            triangulo.setLadoC(teclado.nextDouble());

            if (!triangulo.ehValido()) {
                System.out.println("Triângulo inválido.");
                return;
            }

            System.out.println("Tipo: " + triangulo.getTipo());
        }
    }

    static class Triangulo {
        private double ladoA;
        private double ladoB;
        private double ladoC;

        public void setLadoA(double ladoA) {
            this.ladoA = Math.max(0, ladoA);
        }

        public void setLadoB(double ladoB) {
            this.ladoB = Math.max(0, ladoB);
        }

        public void setLadoC(double ladoC) {
            this.ladoC = Math.max(0, ladoC);
        }

        public boolean ehValido() {
            return ladoA + ladoB > ladoC
                    && ladoA + ladoC > ladoB
                    && ladoB + ladoC > ladoA;
        }

        public String getTipo() {
            if (ladoA == ladoB && ladoB == ladoC) {
                return "Equilátero";
            }
            if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                return "Isósceles";
            }
            return "Escaleno";
        }
    }
}
