package poo.exercicios;

import java.util.Scanner;

public class RetanguloApp {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Retangulo retangulo = new Retangulo();

            System.out.print("Largura: ");
            retangulo.setLargura(teclado.nextDouble());

            System.out.print("Altura: ");
            retangulo.setAltura(teclado.nextDouble());

            System.out.println("Área: " + String.format("%.2f", retangulo.getArea()));
            System.out.println("Perímetro: " + String.format("%.2f", retangulo.getPerimetro()));
        }
    }

    static class Retangulo {
        private double largura;
        private double altura;

        public double getLargura() {
            return largura;
        }

        public void setLargura(double largura) {
            this.largura = Math.max(0, largura);
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = Math.max(0, altura);
        }

        public double getArea() {
            return largura * altura;
        }

        public double getPerimetro() {
            return 2 * (largura + altura);
        }
    }
}
