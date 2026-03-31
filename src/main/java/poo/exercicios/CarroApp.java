package poo.exercicios;

import java.util.Scanner;

public class CarroApp {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Carro carro = new Carro("Fiat", "Uno");

            System.out.print("Acelerar quantas vezes? ");
            int vezes = teclado.nextInt();
            for (int i = 0; i < vezes; i++) {
                carro.acelerar();
            }

            System.out.print("Frear quantas vezes? ");
            int freios = teclado.nextInt();
            for (int i = 0; i < freios; i++) {
                carro.frear();
            }

            System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
            System.out.println("Velocidade final: " + carro.getVelocidade() + " km/h");
        }
    }

    static class Carro {
        private final String marca;
        private final String modelo;
        private int velocidade;

        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = 0;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getVelocidade() {
            return velocidade;
        }

        public void acelerar() {
            velocidade += 10;
        }

        public void frear() {
            velocidade -= 10;
            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }
}
